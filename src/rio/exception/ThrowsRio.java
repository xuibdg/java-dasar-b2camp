package rio.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsRio {
    public static void main(String[] args) {

        try {
            readfile("rio_biodata.pdf");
        } catch (Exception e) {
            System.out.println("file tidak ditemukan: " + e.getMessage());
        }

        }
        public static void readfile(String filepath) throws IOException {
            FileReader reader = new FileReader(filepath);
    }
}
