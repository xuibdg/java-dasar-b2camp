package fauzi.javaio;

import java.io.*;
import java.util.Arrays;

public class FileWriterExample {
    public static void main(String[] args) {
        String filePath = "muldim.xlsx";

        String muldemFinally =
                "o,o,x,o,o,x,x,x,o,x,o,x,o,x,o,x,;," +
                "o,o,x,o,o,x,x,x,o,x,o,x,o,x,o,o,;," +
                "o,o,x,o,o,x,x,x,o,x,o,x,x,o,x,o,;," +
                "o,o,x,o,o,o,o,x,o,x,o,x,o,x,x,o,;," +
                "o,o,x,o,o,x,o,x,o,x,o,x,x,o,x,o,;," +
                "o,o,x,o,o,o,x,o,x,o,x,o,x,x,o,o,;," +
                "o,o,o,o,o,x,x,x,o,x,o,x,o,x,x,o,;," +
                "o,o,x,o,o,x,x,x,o,x,o,o,o,x,o,x,;," +
                "o,o,x,o,x,x,x,x,o,x,o,x,o,x,x,o,;," +
                "o,o,x,o,o,x,o,x,o,x,o,x,x,x,x,o,;," +
                "o,o,x,o,o,x,x,x,x,x,o,x,o,x,x,o,;,";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){

            String[] split = muldemFinally.split(",");
            Arrays.stream(split).forEach(data -> {
                if (!data.equals(";")){
                    try {
                        writer.write(data + ",");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    try {
                        writer.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            System.out.println("data berhasil di tulis ke file. ");
        }catch (IOException e){
            e.printStackTrace();
        }

        System.gc();  // Minta GC bekerja
    }
}
