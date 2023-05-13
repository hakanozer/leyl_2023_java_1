package builder;

public class AProduct extends Order {

    Product product;
    public AProduct( Product product ){
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
