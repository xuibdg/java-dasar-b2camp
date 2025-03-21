package Fadhil.Belajar_Java_dasar.Tugas_20_Maret_2025;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Tugas_20_Maret_2025 {
    public static void main(String[] args) {

        System.out.println("------Nomer 1------");
        // Membuat scanner buat membaca input
        Scanner scanner = new Scanner(System.in);

        // Buat memasukkan angka
        System.out.print("Masukan angka: ");
        int n = scanner.nextInt();

        // Membuat ArrayList untuk menyimpan angka ganjil dan genap
        ArrayList<Integer> ganjil = new ArrayList<>();
        ArrayList<Integer> genap = new ArrayList<>();

        // Loop untuk mencari angka ganjil dan genap
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // Jika angka habis dibagi 2, berarti angka genap
                genap.add(i);
            } else {
                // Jika tidak bisa dibagi 2, berarti angka ganjil
                ganjil.add(i);
            }
        }

        // Menampilkan / cetak hasil angka ganjil dan genap
        System.out.println("Angka ganjil: " + ganjil);
        System.out.println("Angka genap: " + genap);

        System.out.println("------Nomer 2------");
        ArrayList<String> buah = new ArrayList<>();

        // Menambahkan beberapa nama buah ke dalam ArrayList
        buah.add("Apel");
        buah.add("Jeruk");
        buah.addLast("Mangga");
        buah.add("Pisang");
        buah.add("Durian");
        buah.addFirst("Melon");
        buah.remove("Durian");  // Nomer 3

        // Menampilkan / mencetak semua nama buah yang ada di dalam ArrayList
        System.out.println("Daftar buah: ");
        for (String item : buah) {
            System.out.println(item);

        }

        System.out.println("------Nomer 4------");
        // Membuat LinkedList untuk menyimpan angka
        LinkedList<Integer> angkaList = new LinkedList<>();

        // Menambahkan beberapa angka ke dalam LinkedList
        angkaList.add(1010);
        angkaList.add(2020);
        angkaList.add(3030);
        angkaList.add(4040);
        angkaList.add(5050);

        // Menampilkan elemen pertama dan terakhir dari LinkedList
        System.out.println("Elemen pertama: " + angkaList.getFirst());
        System.out.println("Elemen terakhir: " + angkaList.getLast());


    }
}
