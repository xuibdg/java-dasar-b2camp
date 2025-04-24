package rio.javaio_task_23_apr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRio {
    public static void main(String[] args) {
        String filePath = "mulDim.csv";
        int number = 100;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line.replace(",", " "));
            }
        }catch (IOException e){
            e.printStackTrace();

        }
        System.gc();
    }
}