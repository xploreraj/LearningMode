package threads.caveofprog.reentrantlocks;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private int count = 0;
    private final Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {
        lock.lock();

        System.out.println("Waiting ....");
        condition.await(); //similar to wait()

        System.out.println("Woken up!");

        try {
            increment();
        } finally {
            //if increment throws exception, still we need to unlock the lock
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();

        System.out.println("Press return key.");
        new Scanner(System.in).nextLine();
        System.out.println("Got return key!");

        condition.signal(); //similar to notify()

        try {
            increment();
        } finally {
            //if increment throws exception, still we need to unlock the lock
            lock.unlock();
        }
    }

    public void finished() {
        System.out.println("Count is: " + count);
    }
}
