import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UseFile {

    private String fileName = "";
    private File file = null;
    public UseFile( String fileName ) {
        this.fileName = fileName + ".jpg";
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

    public void fileRead() throws IOException {
        Scanner scanner = new Scanner(file);
        while ( scanner.hasNext() ) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

    public void newFileRead() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel fileChannel = fileInputStream.getChannel();
        long size = fileChannel.size();
        ByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
        CharBuffer charBuffer = StandardCharsets.ISO_8859_1.decode(byteBuffer);
        Scanner scanner = new Scanner(charBuffer.toString());
        while(scanner.hasNext() ) {
            String line =  scanner.nextLine();
            System.out.println( "Line: " + line );
        }
    }


}
