package useThread;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

public class Action implements Runnable{

    private String imgPath = "";
    public Action( String imgPath ) {
        this.imgPath = imgPath;
    }

    @Override
    public void run() {
        System.out.println("Thread Start");
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //Thread.sleep(1000);
                System.out.println( Thread.currentThread().getName()+" - Action... " + imgPath);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Finish");
    }

}
