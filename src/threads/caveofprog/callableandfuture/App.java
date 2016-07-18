package threads.caveofprog.callableandfuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        /*executor.submit(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                int duration = random.nextInt(4000);
                System.out.println("Starting ...");
                try{
                    //siumulating some task
                    Thread.sleep(duration);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished.");
            }
        });*/

        /*
        To make call() return nothing, do as follows:
        Future<?> future = executor.submit(new Callable<Void>() {
        ..
        and return null;
         */

        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int duration = random.nextInt(4000);

                if (duration > 2000) {
                    //what happens if some exception is thrown - ExecutionException
                    throw new IOException("Sleeping for too long.");
                }

                System.out.println("Starting ...");

                try {
                    //siumulating some task
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Finished.");

                return duration;
            }
        });

        executor.shutdown();

        try {
            System.out.println("Result is: " + future.get()); //using Future to get the value returned by call()
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            //System.out.println(e.getMessage());
            IOException ex = (IOException) e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
