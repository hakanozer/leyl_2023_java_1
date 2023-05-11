package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/leyl_2023_java_1";
    private final String username =  "sa";
    private final String password = "sa";

    private Connection conn = null;

    public Connection conn()  {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connectin Success");
        }catch (Exception  ex) {
            System.err.println("Conn Fail : " + ex);
        }
        return conn;
    }

    public void close() {
        try {
            if ( conn != null && !conn.isClosed() ) {
                conn.close();
            }
        }catch (Exception ex) {
            System.err.println("DB  Close Error : " + ex);
        }
    }



}
