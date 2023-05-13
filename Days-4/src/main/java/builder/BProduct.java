package builder;

public class BProduct extends Order{

    Product product;
    public BProduct( Product product ){
        this.product = product;
    }

    @Override
    void clearBasket() {
        System.out.println("clearBasket :" + product);
    }

    @Override
    void order() {
        System.out.println("order :" + product);
    }
}
