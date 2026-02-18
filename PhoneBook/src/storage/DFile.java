package storage;

import java.io.File;
import java.io.IOException;

public class DFile {

    String path;
    File file = new File(path);

    public DFile() {
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }


    }






}
