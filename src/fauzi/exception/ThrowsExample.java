package fauzi.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {

        try {
            readFile("ikam_installment.csv");
        } catch (IOException e) {
            System.out.println("file tidak di temukan : " + e.getMessage());
        }

    }

    public static void readFile(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
    }
}
