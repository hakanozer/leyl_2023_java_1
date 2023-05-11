package singleton;

public class DBSingle {

    private static DB instance = null;
    //private static Object lock = new Object();

    synchronized
    public static DB getInstance() {
        if ( instance == null ) {
            //synchronized (lock) {
                instance = new DB();
                System.out.println( "DB Instance" );
            //}
        }
        return instance;
    }

}
