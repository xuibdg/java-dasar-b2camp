package Valdi.Belajar_Java_Dasar.tryJavaIO.Task_23_april;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWriterVal {
    public static void main(String[] args) {
        String filepath = "muldimVal.csv";

        String muldimFinally =
                "o,o,o, , , ,o,o,o, ,o, , , , ,o, , ,o,o,o, , ,o, , , , , ,o,o,o, , , ,o,o,o,;," +
                "o, , ,o, , , ,o, , ,o, , , , ,o, ,o, , , ,o, ,o, , , , , ,o, , ,o, , , ,o, ,;," +
                "o, , ,o, , , ,o, , , ,o, , ,o, , ,o, , , ,o, ,o, , , , , ,o, , , ,o, , ,o, ,;," +
                "o,o,o, , , , ,o, , , ,o, , ,o, , ,o,o,o,o,o, ,o, , , , , ,o, , , ,o, , ,o, ,;," +
                "o, ,o, , , , ,o, , , ,o, , ,o, , ,o, , , ,o, ,o, , , , , ,o, , , ,o, , ,o, ,;," +
                "o, , ,o, , , ,o, , , , ,o,o, , , ,o, , , ,o, ,o, , , , , ,o, , ,o, , , ,o, ,;," +
                "o, , ,o, , ,o,o,o, , , ,o,o, , , ,o, , , ,o, ,o,o,o,o,o, ,o,o,o, , , ,o,o,o,;";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            String[] split = muldimFinally.split(",");
            Arrays.stream(split).forEach( data -> {
                if (!data.equals(";")){
                    try {
                        writer.write(data + ",");
                    }catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    try {
                        writer.newLine();
                    }catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            System.out.println("Data berhasil disimpan ke file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.gc();

    }
}
