package com.works.inheritance;

public class B extends Base{

    public B() {
        super(25);
        System.out.println("B Call");
    }

    @Override
    public void call() {
        print("B Class");
    }

}
