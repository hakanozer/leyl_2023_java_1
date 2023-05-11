package singleton;

import java.sql.Connection;

public class MainSingleton {
    public static void main(String[] args) {

        // Singleton Thread 
        Runnable rn1 = () -> {
            DB db1 = DBSingle.getInstance();
            System.out.println(db1.hashCode());
            Connection con1 = db1.conn();
            System.out.println( con1.hashCode() );
            db1.close();
        };
        new Thread(rn1).start();

        Runnable rn2 = () -> {
        DB db2 = DBSingle.getInstance();
        System.out.println(db2.hashCode());
            Connection con2 = db2.conn();
            System.out.println( con2.hashCode() );
            db2.close();
        };
        new Thread(rn2).start();

        Runnable rn3 = () -> {
        DB db3 = DBSingle.getInstance();
        System.out.println(db3.hashCode());
        };
        new Thread(rn3).start();

        Runnable rn4 = () -> {
        DB db4 = DBSingle.getInstance();
        System.out.println(db4.hashCode());
        };
        new Thread(rn4).start();

        DB db5 = DBSingle.getInstance();
        System.out.println(db5.hashCode());
        Connection con5 = db5.conn();
        System.out.println( con5.hashCode() );
        db5.close();
    }
}
