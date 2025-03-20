package Adam.Belajar_Java_dasar;

import java.util.ArrayList;
import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nilai = ");
        int a = scanner.nextInt();

        ArrayList<Integer> angkaGanjil = new ArrayList<>();
        ArrayList<Integer> angkaGenap = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                angkaGenap.add(i);
            } else {
                angkaGanjil.add(i);
            }
        }
        System.out.println("Angka Ganjil : " + angkaGanjil);
        System.out.println("Angka Genap : " + angkaGenap);

        scanner.close();
    }
}
