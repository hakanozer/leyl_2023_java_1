package useSynchronized;

import java.util.concurrent.TimeUnit;

public class MinusThread extends Thread{

    private BankAccount bankAccount;
    private double number;
    public MinusThread(BankAccount bankAccount,double number ){
        this.bankAccount = bankAccount;
        this.number = number;
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
            bankAccount.minus(number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
