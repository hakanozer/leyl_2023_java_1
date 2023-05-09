package com.works.useAbstract;


import com.works.inheritance.Base;

abstract public class Customer extends Base {

    public abstract int accountNumber();
    public abstract int accountTC();

    public int total() {
        int total = 0;
        if ( accountNumber() == 10 ) {
            total = 1000000;
        }else if ( accountNumber() == 20 ) {
            total = 2000000;
        }
        return total;
    }

    public boolean status() {
        boolean status = false;
        if ( accountNumber() == 10 ) {
            status = true;
        }else if ( accountNumber() == 20 ) {
            status = true;
        }
        return status;
    }

}
