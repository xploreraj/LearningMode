package threads.harikrishna;

/**
 * Multiple threads for multiple logic
 */
public class Application5 {
    public static void main(String[] args) {
        System.out.println("Main started");
        new Thread(){
            @Override
            public void run(){
                int sum=0;
                for(int i=0; i<50; i++) {
                    sum += i;
                    System.out.println("Summation is: " + sum);
                }
            }
        }.start(); //summation thread

        new Thread(){
            @Override
            public void start(){
                System.out.println("custom start");
            }

            @Override
            public void run(){
                int diff=0;
                for(int i=50; i>0; i--) {
                    diff -= i;
                    System.out.println("Subtraction is: " + diff);
                }
            }
        }.start(); //subtraction thread
        System.out.println("main ended");
    }
}
