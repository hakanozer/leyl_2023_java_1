package com.works.inheritance;

public class C extends Base{

    int i = 10;

    public C() {
        super(10);
        System.out.println("C Call");
    }

    @Override
    public void call() {
        print("C Class");
    }

    public void action() {
        if ( i > 10 ) {
            call();
        }else {
            super.call();
            // Super
            // Normal method içinde kullanılırsa methodu çağırır
            // Kurucu method içinde kullanılırsa Miras olarak verilen sınıfın kurucu etkisini yaratır.
        }
    }
}
