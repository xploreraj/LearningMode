package threads.harikrishna.producer_consumer;

/**
 * Created by rbiswas on 4/25/2015.
 */
public class Factory {
    int items;
    boolean itemsInFactory;

    synchronized void produce(int items) {
        if (itemsInFactory) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.items = items;
        itemsInFactory = true;
        System.out.println("produced item: " + items);
        notify();
    }

    synchronized int consume() {
        if (!itemsInFactory) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("item consumed: " + items);
        itemsInFactory = false;
        notifyAll();
        return items;
    }
}
