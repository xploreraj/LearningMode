package threads.harikrishna;

/**
 * Retrieving currently executing thread reference
 */
public class Application9 {
    static {
        System.out.println("In SB");
        Thread th = Thread.currentThread();
        System.out.println("SB executing in " + th.getName() + " thread\n");
    }

    public static void main(String[] args) {
        System.out.println("main method");

        Thread th = Thread.currentThread();
        System.out.println("Original thread name: " + th.getName());
        System.out.println("Original thread priority: " + th.getPriority());

        th.setName("main-thread");
        th.setPriority(7);

        System.out.println("Changed thread name: " + th.getName());
        System.out.println("Changed thread priority: " + th.getPriority());
    }
}
