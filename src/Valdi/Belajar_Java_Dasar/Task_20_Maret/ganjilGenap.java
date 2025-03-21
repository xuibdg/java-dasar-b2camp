package Valdi.Belajar_Java_Dasar.Task_20_Maret;

import java.util.Scanner;

public class ganjilGenap {

//    1. Buatlah program yang mencetak angka ganjil dan genap, masing-masing di baris baru. gunakan scanner
//    Contoh:
//    Masukan angka:10
//    Angka ganjil : [1,3,5,7,9]
//    Angka genap : [2,4,6,8,10]

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = scanner.nextInt(); //"scanner.nextInt()" untuk membaca yang diinput scanner

    System.out.print("Angka ganjil : ");
    for (int i = 1; i <= angka; i += 2) System.out.print(i + ",");
    //mulai dari 1 dan menambah 2 untuk melompati angka genap
    //berhenti kalau i lebih besar dari angka yang diinput

    System.out.print("\nAngka genap  : "); //fungsi "\n" agar membuat baris baru
    for (int i = 2; i <= angka; i += 2) System.out.print(i + ",");
    //kebalikan dari ganji mulai dari 2 dan menambah 2 untuk melompati angka ganjil
    //berhenti kalau i lebih besar dari angka


    scanner.close(); //menutup scanner
}


}
