package useSynchronized;

public class BankAccount {

    private double total;
    private String name;

    public BankAccount(double total, String name) {
        this.total = total;
        this.name = name;
    }

    synchronized
    public void minus( double number ) {
        if ( number <= total ) {
            total -= number;
            System.out.println(name + " Number: " + number + " Kalan :" +  total );
        }else {
            System.out.println("Fail minus");
        }
    }
}
