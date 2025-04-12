package rio.TugasLiburLebran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//3.  Background Analisa Cari yang terdekat dengan ujung garis
//    a. Cari X terdekat dengan ujung garis satu jawaban
//    b. Cari X terjauh dengan ujung garis satu jawaban
//    c. urutkan dari garis yang terjauh sampe ke yang tedekat
//    d. urutkan dari garis yang terdekat sampe ke yang terjauh

public class TerdekatUjungGaris {
    static String[][] mulDIm = new String[20][10];

    public static void main(String[] args) {
        // Isi data (X dan O)
        String[] data = {
                "XOOOOOOOOX", "OOOOOOOOXX", "OOOOOOOOXX", "OOOOOOOOOO",
                "OOOOOOOOOO", "OOXOOOOOOO", "OOOOOXXOOO", "OOOOOXXOOO",
                "OOOOOOOOOO", "OXOOOOOOOO", "OOOOOOOOOO", "OOOOOOOXOO",
                "OOOOOOXXOO", "OOOOOOOXOO", "OOOOOOOOOO", "OXOOOOOOOO",
                "XXOOOOOOOO", "XXOOOOOOOO", "XOOOOOOOOX", "XOOOOOOOOX"
        };

        for (int i = 0; i < 20; i++)
            for (int j = 0; j < 10; j++)
                mulDIm[i][j] = data[i].charAt(j) + "";
        System.out.println(

        );
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print("|" + mulDIm[i][j]);
            System.out.println("|");
        }

        // Kumpulkan semua koordinat 'X'
        List<int[]> xList = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            for (int j = 0; j < 10; j++)
                if (mulDIm[i][j].equals("X"))
                    xList.add(new int[]{i, j});

        // Urutkan dari jarak terjauh ke (0,0)
        xList.sort((a, b) -> distance(b) - distance(a)); //menghitung jarak suatu titik ke titik tertentu

        // a. Terdekat = terakhir
        int[] terdekat = xList.get(xList.size() - 1);
        // b. Terjauh = pertama
        int[] terjauh = xList.get(0);

        // Output
        System.out.println("\n------ HASIL ------" + "");
        System.out.println("a. X terdekat dengan ujung garis (0,0): " + format(terdekat));
        System.out.println("b. X terjauh dengan ujung garis (0,0): " + format(terjauh));

        System.out.println("\nc. Urutan dari yang terjauh ke yang terdekat:");
        for (int[] pos : xList) System.out.print(format(pos) + " ");

        System.out.println("\n\nd. Urutan dari yang terdekat ke yang terjauh:");
        Collections.reverse(xList); //membalik urutan xList
        for (int[] pos : xList) System.out.print(format(pos) + " ");
    }

    // Menghitung jarak kuadrat dari (0,0)
    static int distance(int[] pos) {
        return pos[0] * pos[0] + pos[1] * pos[1];
    }

    // Format koordinat
    static String format(int[] pos) {
        return pos[0] + "," + pos[1];
    }
}
