package threads.harikrishna.producer_consumer;

/**
 * Created by rbiswas on 4/25/2015.
 */
public class ProducerConsumer {
    class Producer implements Runnable {
        Factory factory;

        Producer(Factory factory) {
            this.factory = factory;
            new Thread(this, "Producer").start();
        }

        public void run() {
            int i = 1;
            while (i <= 3) {
                factory.produce(i++);
            }
        }
    }

    class Consumer implements Runnable {
        Factory factory;

        Consumer(Factory factory) {
            this.factory = factory;
            new Thread(this, "Consumer").start();
        }

        public void run() {
            int i=1;
            while (i<=3) {
                factory.consume();
                i++;
            }
        }
    }
}
