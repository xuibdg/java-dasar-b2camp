package rio.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class TryCatchRio {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BigDecimal jumlah;
        try {
            fileReader = new FileReader("rio/biodata.pdf");
            jumlah = BigDecimal.valueOf(5).divide(BigDecimal.ZERO);
        }catch (IOException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println("Pembagian tidak boleh nol: " + e.getMessage());
        }finally {
            System.out.println("Proses Selesai");
        }
    }
}
