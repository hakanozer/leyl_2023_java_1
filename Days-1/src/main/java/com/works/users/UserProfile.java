package com.works.users;

import java.util.Random;

public class UserProfile {

    public String name = "Erkan Bilsin";
    public String dbName = "";

    // Kurucu methodlar
    // void yada return anahtar kelimesi almazlar.
    // sınıf ismi ile aynı isme sahip olmalıdırlar.
    // kurucu methodlar sınıfın hazır bulunuşluğunu artırır.

    public UserProfile() {
        System.out.println( name );
    }

    public UserProfile(String dbName) {
        this.dbName = dbName;
    }

    //  no paramter no return
    public void connect() {
        System.out.println("Connect : " + dbName);
    }

    // no return
    public void params( int num1, int num2 ) {
        int sum = num1 + num2;
        System.out.println("Sum : " + sum);
    }

    // return fnc

    /**
     * @since 1.8
     * @apiNote Ali Bilmem
     * ex: iki sayının  çıkarılması işlemi, sonuç tam sayı(int)
     * @param num1 (int)
     * @param num2 (int)
     * @return (int)
     */
    public int minus( int num1, int num2 ) {
        int min = num1 - num2;
        return min;
    }


    // params...
    public void addressLine( String... lines ) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < lines.length; i++) {
            System.out.println( lines[i] );
        }
        long end = System.currentTimeMillis();
        long between = end - start;
        System.out.println(between);
        /*
        for( String item : lines ) {
            System.out.println("item - " + item);
        }
         */
    }

    public void fncCall( Action action ) {
        action.print();
        action.print(33);
        action.print(24, 2);
    }

}
