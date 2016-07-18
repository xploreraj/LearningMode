package com.yodlee.jms;

import javax.jms.*;
import javax.naming.*;
import java.util.Properties;

public class TSubscriber implements MessageListener {
    private boolean stop = false;
    public static void main(String[] args) {
        new TSubscriber().subscribe();
    }
    public void subscribe() {
        try {
            //Set JNDI names
            String factoryName = "GFConnectionFactory";
            String topicName = "jms/Topic01";
            //Look up administered objects
            Properties properties = new Properties();
            properties.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            properties.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            properties.setProperty("java.naming.provider.url", "iiop://localhost:3700");
            InitialContext initContext = new InitialContext(properties);
            TopicConnectionFactory factory =
                    (TopicConnectionFactory) initContext.lookup(factoryName);
            Topic topic = (Topic) initContext.lookup(topicName);
            initContext.close();
            //Create JMS objects
            TopicConnection connection = factory.createTopicConnection();
            TopicSession session =
                    connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            TopicSubscriber subscriber = session.createSubscriber(topic);
            subscriber.setMessageListener(this);
            connection.start();
            //Wait for stop
            while (!stop) {
                Thread.sleep(1000);
            }
            //Exit
            System.out.println("Exiting...");
            connection.close();
            System.out.println("Goodbye!");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void onMessage(Message message) {
        try {
            String msgText = ((TextMessage) message).getText();
            System.out.println(msgText);
            if ("stop".equals(msgText))
                stop = true;
        } catch (JMSException e) {
            e.printStackTrace();
            stop = true;
        }
    }
}