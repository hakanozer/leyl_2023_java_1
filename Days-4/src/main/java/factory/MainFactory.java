package factory;

public class MainFactory {
    public static void main(String[] args) {

        Fabric fabric = new Fabric();
        Car car1 = new Car("A5", "T4", 120 );
        IFactory factory = fabric.create(ECar.audi);
        factory.factory(car1);

    }
}
