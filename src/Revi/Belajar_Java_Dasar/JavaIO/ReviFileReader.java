package Revi.Belajar_Java_Dasar.JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReviFileReader {

    public void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ReviFileReader reader = new ReviFileReader();
        String filename = "REVI_SATRIA.xlsx";
        reader.readFile(filename);
    }
}