package factory;

public class Fabric {

    public IFactory create( ECar eCar ) {
        IFactory iFactory = null;
        switch (eCar) {
            case audi -> {
                iFactory = new Audi();
            }
            case bmw -> {
                iFactory = new Bmw();
            }
        }
        return iFactory;
    }

}
