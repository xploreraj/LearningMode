package threads.harikrishna.producer_consumer;

/**
 * Created by rbiswas on 4/25/2015.
 */
public class Main {
    public static void main(String[] args) {
        Factory bajaj = new Factory();
        ProducerConsumer producerConsumer = new ProducerConsumer();
        producerConsumer.new Producer(bajaj);
        producerConsumer.new Consumer(bajaj);
    }
}
