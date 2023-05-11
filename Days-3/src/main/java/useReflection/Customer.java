package useReflection;

public class Customer {

    private int number;
    private String name;

    public Customer() {
    }

    public Customer(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int sum( int a, int b ) {
        return a + b;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

}
