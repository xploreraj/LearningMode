package threads.caveofprog.interruptingthreads;

import java.util.Random;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting.");

        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Random ran = new Random();

                for (int i = 0; i < 1E8; i++) { //1 000 000
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interrupted.");
                        break;
                    }
                    Math.sin(ran.nextDouble());
                }
            }
        });
        t.start();

        Thread.sleep(500);
        t.interrupt();

        t.join();*/

        ExecutorService executor = Executors.newCachedThreadPool();

        Future<?> future = executor.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Random ran = new Random();

                for (int i = 0; i < 1E8; i++) { //1 000 000
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interrupted.");
                        break;
                    }
                    Math.sin(ran.nextDouble());
                }
                return null;
            }
        });

        executor.shutdown();

        Thread.sleep(500);

        executor.shutdownNow(); //attempts to kill all running flags, means just sets interrupt flag
        //future.cancel(true); //interrupts

        executor.awaitTermination(1, TimeUnit.DAYS);

        System.out.println("Finished.");
    }
}
