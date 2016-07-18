package threads.harikrishna;

/**
 * synchronization demo
 * application 12
 */
public class SynchronizationDemo {
    public static void main(String[] args) {
        PrintMessage pm = new PrintMessage();

        MessagePrinterThread th1 = new MessagePrinterThread(pm, "hello world", "Printer-1");
        MessagePrinterThread th2 = new MessagePrinterThread(pm, "ola ola", "Printer-2");
        MessagePrinterThread th3 = new MessagePrinterThread(pm, "marca futbol", "Printer-3");
    }

    static class PrintMessage {
        synchronized void printMessage(String msg) {
            System.out.print("[" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(": " + msg + "]");
        }
    }

    static class MessagePrinterThread extends Thread {
        private final PrintMessage pm;
        private final String msg;
        Thread th;

        MessagePrinterThread(PrintMessage pm, String msg, String name) {
            super(name); //assigning name to thread
            this.pm = pm;
            this.msg = msg;

            new Thread(this).start();
        }

        @Override
        public void run() {
            pm.printMessage(msg);
        }
    }
}