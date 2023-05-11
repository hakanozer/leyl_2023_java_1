package useSynchronized;

public class MainSync {
    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount(1000,"Ali Bilmem");
        MinusThread th1 = new MinusThread(bankAccount, 300);
        MinusThread th2 = new MinusThread(bankAccount, 200);
        MinusThread th3 = new MinusThread(bankAccount, 150);

        th1.start();
        //th1.join();

        th2.start();
        //th2.join();

        th3.start();
        //th3.join();

        System.out.println("This Line Call");
    }
}
