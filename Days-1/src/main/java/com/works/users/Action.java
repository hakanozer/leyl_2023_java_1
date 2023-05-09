package com.works.users;

public class Action {

    public void print() {
        System.out.println( "Print Call" );
    }

    public void print( int age ) {
        System.out.println( "Print Call -" + age );
    }

    public void print( int age, int section ) {
        System.out.println( "Print Call - " + age + " " +  section );
    }

}
