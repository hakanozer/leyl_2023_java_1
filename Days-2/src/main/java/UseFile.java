import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UseFile {

    private String fileName = "";
    private File file = null;
    public UseFile( String fileName ) {
        this.fileName = fileName + ".txt";
        file = new File(this.fileName);
    }

    public void createFile() {
        try {
            if( !file.exists() ) {
                file.createNewFile();
            }
        }catch (IOException ex) {
            System.err.println("createFile Error : " + ex);
        }catch ( ArithmeticException ex ) {
            System.err.println("createFile ArithmeticException : " + ex);
        }
    }


    public void fileWrite( String data ) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
            writer.append(data + System.lineSeparator() );
        }catch (Exception ex) {
            System.err.println("fileWrite Error : " + ex);
        }finally {
            try {
                if ( writer != null )
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteFile() {
        try {
            if ( file.exists() ) {
                file.delete();
            }
        }catch (Exception ex) {
            System.err.println("deleteFile Error : " + ex);
        }
    }

}
