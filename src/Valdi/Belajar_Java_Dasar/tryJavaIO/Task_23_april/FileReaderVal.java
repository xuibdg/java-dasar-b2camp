package Valdi.Belajar_Java_Dasar.tryJavaIO.Task_23_april;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderVal {
    public static void main(String[] args) {
        String filePath = "muldimVal.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line.replace("," , " "));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.gc();
    }
}
