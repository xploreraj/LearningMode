package threads.caveofprog.threads3;

/**
 * synchronized.
 */
public class App {
    private int count = 0;

    //fix, for issues described below
    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args) {
        App app = new App();
        app.doWork();
    }

    private void doWork() {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {

                for (int i = 0; i < 10000; i++) {
                    //count++;
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {

                for (int i = 0; i < 10000; i++) {
                    //count++;
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        //System.out.println("Count is: " + count); //without any sync, this might return 0

        try {
            t1.join();
            t1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //without inter-thread synchronization, this still will differ each time
        //the issue is with inter-leaving of the threads, they might not even see
        //consistent values while doing count = count + 1;
        System.out.println("Count is: " + count);
    }
}
