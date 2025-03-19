package Adam.Belajar_Java_dasar;

import java.util.Scanner;

public class UsiadanKategori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("USIA DAN KATEGORI");

        int usia = scanner.nextInt();

        String kategori = (usia <= 13) ? "Anak-anak" : (usia <= 17) ? "Remaja" :
                (usia <= 59) ? "Dewasa" : "Lansia";
        System.out.println("Kategori : " + kategori);


        scanner.close();
    }
}
