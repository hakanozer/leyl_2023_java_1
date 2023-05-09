package com.works.inheritance;

public class Base {

    public int number = 0;

    public Base(){
        System.out.println("Base Call");
    }

    public Base(int number){
        this.number = number;
        System.out.println("Base Call :" + number);
    }

    public void call() {
        System.out.println("Base Empty Call");
    }

    // final anahtar kelimesi fonksiyonda olduğunda override verilemez.
    final public void print(String data) {
        System.out.println("Print Call: " + data);
    }

    @Override
    public String toString() {
        Class clazz = getClass();
        return clazz.getName() +"{}";
    }
}
