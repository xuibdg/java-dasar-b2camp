package Adam.Belajar_Java_dasar;

import java.util.Scanner;

public class NilaiUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NILAI MAHASISWA");
            int n = scanner.nextInt();

            if (n >= 85) {
                System.out.println("A");
            } else if (n >= 70) {
                System.out.println("B");
            } else if (n >= 55) {
                System.out.println("C");
            } else if (n >= 40) {
                System.out.println("D");
            } else if (n < 40) {
                System.out.println("E");

            }

        scanner.close();
    }
}
