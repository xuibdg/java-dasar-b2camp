package rio.belajar_java_flow_control.conditional_statement;

import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        String kategori = (usia < 13) ? "Anak-anak" :
                (usia >= 13 && usia <= 17) ? "Remaja" :
                        (usia >= 18 && usia <= 59) ? "Dewasa" : "Lansia";

        System.out.println("Kategori usia: " + kategori);

        scanner.close();
    }
}
