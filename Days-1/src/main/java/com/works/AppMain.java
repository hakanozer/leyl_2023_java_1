package com.works;

import com.works.inheritance.A;
import com.works.inheritance.B;
import com.works.inheritance.Base;
import com.works.inheritance.C;
import com.works.useAbstract.Customer;
import com.works.useAbstract.Person;
import com.works.users.Action;
import com.works.users.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        UserProfile userProfile = new UserProfile("MYSQL");
        userProfile.connect();
        userProfile.params(100,45);

        int min = userProfile.minus(567, 345);
        if ( min > 100 ) {
            System.out.println("100 > Min : " + min);
        }else {
            System.out.println("100 < Min : " + min);
        }


        // Params fnc
        userProfile.addressLine("Add Line-1","Add Line-2","Add Line-3");

        // Object params
        Action ac = new Action();
        userProfile.fncCall(ac);


        // Inheritance
        List<String> ls = new ArrayList<>();
        //Base base = new Base();
        //base.hashCode();

        A a = new A();
        B b = new B();
        C c = new C();

        objCall(a);
        objCall(b);
        objCall(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Abstract Class
        Person person = new Person(10, 1232312312);
        System.out.println( person.status() + " " + person.total() );

        Customer customer = new Customer() {
            @Override
            public int accountNumber() {
                return 10;
            }

            @Override
            public int accountTC() {
                return 123123121;
            }
        };
        System.out.println( customer.status() + " " + customer.total() );

        Base basePerson = new Person(20, 2342423);

        // Interfacee
        List<String> list = new ArrayList<>();



    }

    public static void objCall( Base base ) {
        if ( base instanceof A  ) {
            A aBase = (A) base;
            aBase.sum();
        }
        base.call();
    }

}
