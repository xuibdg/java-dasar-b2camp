package hirlan.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String filePath2 = "output2.txt";
        String filePath3 = "output3.csv";
        String filePathm = "muldim.xlsx";
        int number = 100;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("--------------------------");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath2))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("--------------------------");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath3))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePathm))){
            String line;
            System.out.println(" ________________________________");
            while ((line = reader.readLine()) != null){
                System.out.println("|" + line.replace(",", " ") + "|");
            }
            System.out.println("|________________________________|");

        }catch (IOException e){
            e.printStackTrace();
        }


        System.gc();  // Minta GC bekerja
    }
}
