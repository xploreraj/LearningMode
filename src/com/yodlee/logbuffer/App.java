package com.yodlee.logbuffer;

public class App {

    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<10000; i++) {
            if(i%10==0) Thread.sleep(1000);
            Buffer.log("string" + i + "...");
        }
    }
}
