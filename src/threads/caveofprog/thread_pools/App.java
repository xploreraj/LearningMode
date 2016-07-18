package threads.caveofprog.thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
    private final int id;
    public Processor(int id) {
        this.id = id;
    }
    public void run() {
        System.out.println("Starting: " + id + "with instance " + this.hashCode());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed: " + id);
    }
}
public class App {
    public static void main(String[] args) {
        //one thread does one task, finishes and takes up another
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //5 tasks
        for (int i=0; i<5; i++) {
            executor.submit(new Processor(i)); //submitting a task
        }

        executor.shutdown(); //will wait for all the threads to complete

        System.out.println("All tasks submitted.");

        try {
            executor.awaitTermination(1, TimeUnit.DAYS); //wait for all the tasks to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed.");
    }
}
