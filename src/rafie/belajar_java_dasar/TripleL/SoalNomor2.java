package rafie.belajar_java_dasar.TripleL;

public class SoalNomor2 {
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
//        multDimm[13][6] = "X";

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
                System.out.print("|" + multDimm[i][j] + "|");
            }
            System.out.println();
        }

        System.out.print("Individu ada di index array: ");

        for (int baris = 0; baris < 20; baris++) {
            for (int kolom = 0; kolom < 10; kolom++) {

                if (multDimm[baris][kolom].equals("X")) {
                    boolean adaTetangga = false;

                    // Atas
                    if (baris > 0 && multDimm[baris - 1][kolom].equals("X")) {
                        adaTetangga = true;
                    }

                    // Bawah
                    if (baris < 19 && multDimm[baris + 1][kolom].equals("X")) {
                        adaTetangga = true;
                    }

                    // Kiri
                    if (kolom > 0 && multDimm[baris][kolom - 1].equals("X")) {
                        adaTetangga = true;
                    }

                    // Kanan
                    if (kolom < 9 && multDimm[baris][kolom + 1].equals("X")) {
                        adaTetangga = true;
                    }

                    // Kiri atas
                    if (baris > 0 && kolom > 0 && multDimm[baris - 1][kolom - 1].equals("X")) {
                        adaTetangga = true;
                    }

                    // Kanan atas
                    if (baris > 0 && kolom < 9 && multDimm[baris - 1][kolom + 1].equals("X")) {
                        adaTetangga = true;
                    }

                    // Kiri bawah
                    if (baris < 19 && kolom > 0 && multDimm[baris + 1][kolom - 1].equals("X")) {
                        adaTetangga = true;
                    }

                    // Kanan bawah
                    if (baris < 19 && kolom < 9 && multDimm[baris + 1][kolom + 1].equals("X")) {
                        adaTetangga = true;
                    }

                    if (!adaTetangga) {
                        System.out.print(baris + "," + kolom + " ");
                        jumlahIndividu++;
                    }
                }
            }
        }
        System.out.println("\nJumlah Individu: " + jumlahIndividu);
    }
}
