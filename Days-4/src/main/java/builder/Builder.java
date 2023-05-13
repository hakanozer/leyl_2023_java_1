package builder;

public class Builder {

    Order order;
    public Builder(Order order) {
        this.order = order;
        this.order.clearBasket();
        this.order.order();
    }

}
