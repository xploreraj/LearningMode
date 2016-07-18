package com.yodlee.logbuffer;

/**
 * This buffer stores the log messages and dumps them to FS on
 * either n log messages or x amount of time, whichever comes early.
 */
public class Buffer {
    private static StringBuilder builder = new StringBuilder();
    private static int count = 0;
    static{
        new Thread(new Runnable(){
            long currTime = System.currentTimeMillis();
            @Override
            public void run() {
                while(true){
                    if(currTime + 5000 >= System.currentTimeMillis() && count!=0 ) {
                        dumpLog();
                        //reinitialize parameters
                        currTime = System.currentTimeMillis();
                        count=0;
//                        try {
//                            Thread.sleep(00);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                    }
                }
            }
        }).start();
    }

    public static void log(String msg) {
        count++;
        builder.append(msg).append("\n");
        if (count == 10)
            dumpLog();
    }

    private static void dumpLog() {
        if(count>0) {
            System.out.println("Dump \n" + builder.toString());
            builder = new StringBuilder();
        }
    }
}
