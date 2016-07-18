package threads.harikrishna;

/**
 * Created by rbiswas on 6/5/2015.
 */
public class Application3 extends Thread {
    public void run(){
        for(int i=0;i<15; i++)
            System.out.println(getName() + "run:" + i);
    }

    public static void main(String[] args) {
        Application3 m1 = new Application3();
        m1.start();
        Application3 m2 = new Application3();
        m2.start();
        Application3 m3 = new Application3();
        m3.start();
    }
}
