package factory;

public class Bmw implements IFactory{

    @Override
    public void factory(Car car) {
        System.out.println("Bmw : " + car);
    }

}
