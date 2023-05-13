package factory;

public class Audi implements IFactory {

    @Override
    public void factory(Car car) {
        System.out.println("Audi : " + car);
    }

}
