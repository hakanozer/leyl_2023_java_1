import java.io.IOException;
import java.util.UUID;

public class AppMainFile {
    public static void main(String[] args) throws IOException {

        UseFile file = new UseFile("resim");
        //file.createFile();

        long time = System.currentTimeMillis();
        String uuid = time + "_" + UUID.randomUUID().toString();
        file.fileWrite("Sample Data - " + uuid);

        // delete file
        // file.deleteFile();

        // File Read
        // file.fileRead();
        file.newFileRead();

    }
}
