package builder;

public class MainBuilder {
    public static void main(String[] args) {

        Product p1  = new Product("TV", 15000);
        Order orderA = new AProduct(p1);
        Builder builder = new Builder(orderA);

    }
}
