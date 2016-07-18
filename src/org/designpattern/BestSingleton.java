package org.designpattern;

/**
 * enums are by default singleton, not serializable, not clonable, with final fields
 * @author Rajdeep
 *
 */
enum EnumSingleton {
    INSTANCE;

    private EnumSingleton(){
        //can initialize something internally
    }

    public void doSomething(){
        //do something using same instance
    }
}

public class BestSingleton extends Thread{

    public static void main(String[] args) {
        int count = 100;
        Thread thread[] = new Thread[count];
        for(int i=0; i< count; i++){
            thread[i] = new Thread(new BestSingleton());
        }
        for(int j=0; j< count; j++){
            thread[j].start();
        }

    }//main()

    @Override
    public void run() {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println("Accessed by " + Thread.currentThread().getName() +
                "; EnumSingleton instance hashcode is " + instance.hashCode());

    }//run()

}