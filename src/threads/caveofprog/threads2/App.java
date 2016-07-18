package threads.caveofprog.threads2;

import java.util.Scanner;

/**
 * Basic thread synchronization and purpose of volatile
 */

class Processor extends Thread {
    private boolean running = true; //might not work due the caching of 'true' value by proc1 thread
    //private volatile boolean running = true; //is guaranteed to work
    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //to shutdown gracefully (interrupt could also have been used)
    public void shutdown() {
        running = false;
    }
}

public class App {
    public static void main(String[] args) {
        Processor proc1 = new Processor();
        proc1.start();
        System.out.println("Press return to stop...");
        Scanner kb = new Scanner(System.in);
        kb.nextLine();
        proc1.shutdown();
    }
}
