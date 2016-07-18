package org.java8.lambdas;

public class $1RunnableDemo {
    public static void main(String[] args) {
        //Old way
        new Thread(
                new Runnable(){
                    public void run(){
                        System.out.println("run logic...");
                    }
                }
        ).start();

        //lambdas
        new Thread(
                ()-> System.out.println("run logic ... two...")
        ).start();
    }
}
