package com.works.inheritance;

public class A extends Base{

    public A() {
        super(50);
        System.out.println("A Call : " + number);
    }

    @Override
    public void call() {
        print("A Class");
    }

    public void sum() {
        System.out.println("Sum Call");
    }

    @Override
    public String toString() {
        return "A{}";
    }

}
