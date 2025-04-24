package rio.javaio_task_23_apr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWriterRio {
    public static void main(String[] args) {
        String filePath = "mulDim.csv";

        String muldimFinally =
                "o,o,o,o, , ,o, , ,o,o,o, , , ,o,o,o,o, , ,o, ,o, , , ,o, , ,o,o,o, , ,o, , , , , ,o, , ,o,o,o, ,;," +
                "o, , , ,o, ,o, ,o, , , ,o, , ,o, , , ,o, ,o, ,o, , ,o, , ,o, , , ,o, ,o, , , , , ,o, ,o, , , ,o,;," +
                "o, , , ,o, ,o, ,o, , , ,o, , ,o, , , ,o, ,o, ,o, ,o, , , ,o, , , ,o, ,o,o, , , , ,o, ,o, , , ,o,;," +
                "o, , , ,o, ,o, ,o, , , ,o, , ,o, , , ,o, ,o, ,o,o, , , , ,o, , , ,o, ,o, ,o, , , ,o, ,o, , , ,o,;," +
                "o,o,o,o, , ,o, ,o, , , ,o, , ,o,o,o,o, , ,o, ,o, , , , , ,o,o,o,o,o, ,o, , ,o, , ,o, ,o,o,o,o,o,;," +
                "o,o, , , , ,o, ,o, , , ,o, , ,o,o, , , , ,o, ,o,o, , , , ,o, , , ,o, ,o, , , ,o, ,o, ,o, , , ,o,;," +
                "o, ,o, , , ,o, ,o, , , ,o, , ,o, ,o, , , ,o, ,o, ,o, , , ,o, , , ,o, ,o, , , , ,o,o, ,o, , , ,o,;," +
                "o, , ,o, , ,o, ,o, , , ,o, , ,o, , ,o, , ,o, ,o, , ,o, , ,o, , , ,o, ,o, , , , , ,o, ,o, , , ,o,;," +
                "o, , , ,o, ,o, , ,o,o,o, , , ,o, , , ,o, ,o, ,o, , , ,o, ,o, , , ,o, ,o, , , , , ,o, ,o, , , ,o,;,";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            String[] Split = muldimFinally.split(",");
            Arrays.stream(Split).forEach(data -> {
                if (!data.equals(";")){
                    try {
                        writer.write(data + ",");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    try {
                        writer.newLine();
                    } catch (IOException e){
                        throw new RuntimeException(e);
                    }
                }
            });
            System.out.println("Data berhasil disimpan ke file");
        }catch (IOException e){
            e.printStackTrace();
        }
        System.gc();
    }
}
