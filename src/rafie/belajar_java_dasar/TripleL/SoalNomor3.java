package rafie.belajar_java_dasar.TripleL;

import java.time.Instant;
import java.util.Date;

public class SoalNomor3 {
    public static void main(String[] args) {
        String[][] multDimm = new String[20][10];
        int jumlahIndividu = 0;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                multDimm[i][j] = "O";

            }
        }

        // Individu
        multDimm[0][0] = "X";
        multDimm[5][2] = "X";
        multDimm[9][1] = "X";

        // Kelompok 1
        multDimm[0][9] = "X";
        multDimm[1][9] = "X";
        multDimm[2][9] = "X";
        multDimm[2][8] = "X";
        multDimm[1][8] = "X";

        // Kelompok 2
        multDimm[6][5] = "X";
        multDimm[7][5] = "X";
        multDimm[7][6] = "X";
        multDimm[6][6] = "X";

        // Kelompok 3
        multDimm[11][7] = "X";
        multDimm[11][6] = "X";
        multDimm[12][8] = "X";
        multDimm[13][6] = "X";

        // Kelompok 4
        multDimm[15][1] = "X";
        multDimm[16][0] = "X";
        multDimm[16][1] = "X";
        multDimm[17][0] = "X";
        multDimm[17][1] = "X";
        multDimm[18][0] = "X";
        multDimm[19][0] = "X";

        // Kelompok 5
        multDimm[18][8] = "X";
        multDimm[18][9] = "X";
        multDimm[19][9] = "X";

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multDimm[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        System.out.println("Nomor 3 Poin A, X terdekat dengan ujung garis. Satu jawaban");
        int minJarak = Integer.MAX_VALUE;
        int xTerdekatBaris = -1;
        int xTerdekatKolom = -1;

        for (int baris = 0; baris < 20; baris++) {
            for (int kolom = 0; kolom < 10; kolom++) {
                if (multDimm[baris][kolom].equals("X")) {
                    int jarak = Math.abs(baris - 0); // dari garis atas
                    if (jarak < minJarak) {
                        minJarak = jarak;
                        xTerdekatBaris = baris;
                        xTerdekatKolom = kolom;
                    }
                }
            }
        }
        System.out.println("X terdekat ada di index: " + xTerdekatBaris + "," + xTerdekatKolom);

        System.out.println("\nNomor 3 Poin B, X terjauh dengan ujung garis. Satu jawaban");
        int maxJarak = Integer.MIN_VALUE;
        int xTerjauhBaris = -1;
        int xTerjauhKolom = -1;

        for (int baris = 0; baris < 20; baris++) {
            for (int kolom = 0; kolom < 10; kolom++) {
                if (multDimm[baris][kolom].equals("X")) {
                    int jarak = Math.abs(baris - 0);
                    if (jarak > maxJarak) {
                        maxJarak = jarak;
                        xTerjauhBaris = baris;
                        xTerjauhKolom = kolom;
                    }
                }
            }
        }
        System.out.println("X terjauh ada di index: " + xTerjauhBaris + "," + xTerjauhKolom);

        System.out.println("\nNomor 3 Poin C, Urut X terjauh ke terdekat");

        int[][] semuaX = new int[100][3];
        int jumlahX = 0;

        for (int baris = 0; baris < 20; baris++) {
            for (int kolom = 0; kolom < 10; kolom++) {
                if (multDimm[baris][kolom].equals("X")) {
                    int jarak = Math.abs(baris - 0);
                    semuaX[jumlahX][0] = baris;
                    semuaX[jumlahX][1] = kolom;
                    semuaX[jumlahX][2] = jarak;
                    jumlahX++;
                }
            }
        }

        // melakukan pengurutan dari terjauh ke terdekat
        for (int i = 0; i < jumlahX - 1; i++) {
            for (int j = 0; j < jumlahX - i - 1; j++) {
                if (semuaX[j][2] < semuaX[j + 1][2]) {
                    int[] pengurutan = semuaX[j];
                    semuaX[j] = semuaX[j + 1];
                    semuaX[j + 1] = pengurutan;
                }
            }
        }

        for (int i = 0; i < jumlahX; i++) {
            System.out.println("X di index: " + semuaX[i][0] + "," + semuaX[i][1]);
        }

        System.out.println("\nNomor 3 Poin D, Urut X terdekat ke terjauh.");

        // melakukan pengurutan dari terdekat ke terjauh
        for (int i = 0; i < jumlahX - 1; i++) {
            for (int j = 0; j < jumlahX - i - 1; j++) {
                if (semuaX[j][2] > semuaX[j + 1][2]) {
                    int[] pengurutan = semuaX[j];
                    semuaX[j] = semuaX[j + 1];
                    semuaX[j + 1] = pengurutan;
                }
            }
        }

        for (int i = 0; i < jumlahX; i++) {
            System.out.println("X di index: " + semuaX[i][0] + "," + semuaX[i][1]);
        }

        Date date = new Date();
        System.out.println("Date end: " + date);

    }
}
