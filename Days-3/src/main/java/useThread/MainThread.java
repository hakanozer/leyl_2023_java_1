package useThread;

public class MainThread {
    public static void main(String[] args) {

        Runnable rn = () -> {
            try {
            Action ac1 = new Action("img-1.jpg");
            Thread th1 = new Thread(ac1, "Thread Img - 1");
            th1.start();
            th1.join();

            Action ac2 = new Action("img-2.jpg");
            Thread th2 = new Thread(ac2, "Thread Img - 2");
            th2.start();
            th2.join();

            Action ac3 = new Action("img-3.jpg");
            Thread th3 = new Thread(ac3, "Thread Img - 3");
            th3.start();
            th3.join();

            System.out.println("All Thread Finish");
            }catch (Exception ex) {}
        };
        new Thread(rn).start();

        System.out.println("MainThread This Line");

    }
}
