package com.works.useAbstract;

public class Person extends Customer{

    int number = 0;
    int TC  = 0;
    public Person( int number, int TC ) {
       this.number = number;
       this.TC = TC;
    }

    @Override
    public int accountNumber() {
        return number;
    }

    @Override
    public int accountTC() {
        return TC;
    }

}
