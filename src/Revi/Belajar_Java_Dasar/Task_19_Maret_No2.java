package Revi.Belajar_Java_Dasar;
import java.util.Scanner;

public class Task_19_Maret_No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        String kategori = (usia < 13) ? "Anak-anak" :
                (usia <= 17) ? "Remaja" :
                        (usia <= 59) ? "Dewasa" : "Lansia";

        System.out.println("Kategori usia: " + kategori);

        scanner.close();
    }
}
