package fauzi.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class TryCatchExample {

    public static void main(String[] args) {
        FileReader fileReader = null;
        BigDecimal jumlah;
        try {
            jumlah = BigDecimal.valueOf(5).divide(BigDecimal.ZERO);
            fileReader = new FileReader("fauzi/angsuran.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file tidak di temukan : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("pembagian gaboleh nol : " + e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("gagal menutup file: " + e.getMessage());
                } catch (RuntimeException e) {
                    System.out.println("fileReader jangan sampe null : " + e.getMessage());
                }
            }
        }
    }
}
