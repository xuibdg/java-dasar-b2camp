package Fadhil.Belajar_Java_dasar.Lembur;
import java.util.*;

public class No_3 {
    static String[][] tabel = {
            {"X", "O", "O", "O", "O", "O", "O", "O", "O", "X"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "X", "X"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "X", "X"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "X", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "X", "X", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "X", "X", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "X", "O", "O", "X", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "X", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "X", "X", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "X", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "X", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"X", "X", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"X", "X", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"X", "O", "O", "O", "O", "O", "O", "O", "X", "X"},
            {"X", "O", "O", "O", "O", "O", "O", "O", "O", "X"},
    };

    static class Posisi {
        int row, col, distance;

        Posisi(int row, int col) {
            this.row = row;
            this.col = col;
            this.distance = row + col; // Manhattan dari [0][0]
        }

        public String toString() {
            return "[baris=" + (row+1) + ", kolom=" + (col+1) + ", jarak=" + distance + "]";
        }
    }

    public static void main(String[] args) {
        List<Posisi> xList = new ArrayList<>();

        // Cari semua X
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[i].length; j++) {
                if (tabel[i][j].equals("X")) {
                    xList.add(new Posisi(i, j));
                }
            }
        }

        // a. X terdekat dari (0,0)
        Posisi terdekat = Collections.min(xList, Comparator.comparingInt(p -> p.distance));
        System.out.println("a. X terdekat: " + terdekat);

        // b. X terjauh dari (0,0)
        Posisi terjauh = Collections.max(xList, Comparator.comparingInt(p -> p.distance));
        System.out.println("b. X terjauh: " + terjauh);

        // c. Urutkan dari terjauh ke terdekat
        xList.sort((a, b) -> Integer.compare(b.distance, a.distance));
        System.out.println("c. Dari TERJAUH ke TERDEKAT:");
        xList.forEach(System.out::println);

        // d. Urutkan dari terdekat ke terjauh
        xList.sort(Comparator.comparingInt(p -> p.distance));
        System.out.println("\nd. Dari TERDEKAT ke TERJAUH:");
        xList.forEach(System.out::println);
    }
}
