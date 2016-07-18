package org.java8.lambdas;

import java.io.FileNotFoundException;

@FunctionalInterface
interface Compare{
    int sum(int a, int b);
}

public class One {
    public static void main(String[] args) {
        Compare c = (int a,int b) -> a+b;
        Runnable r = () -> {
            System.out.println("make me soup, " + Thread.currentThread().getName());
        };
        new Thread(() -> {
            System.out.println("do nothing, " + Thread.currentThread().getName());
        }, "grinder").start();
    }
}
