package Revi.Belajar_Java_Dasar;

public class LiburLemburLebaran {
    public static void main(String[] args) {

        //===================================================== SOAL NO 1 =============================================
        /*String varA = "aku adalah seorang programmer java";

        String[] kata = varA.split(" ");

        String vocalA = "";
        String konsonanA = "";


        int totalVokal = 0;
        int totalKonsonan = 0;


        for (int i = 0; i < kata.length; i++) {
            String k = kata[i];
            int vokal = 0;
            int konsonan = 0;

            // Loop tiap huruf dalam kata
            for (char c : k.toCharArray()) {
                if (Character.isLetter(c)) {
                    if ("aiueoAIUEO".indexOf(c) != -1) {
                        vokal++;
                        totalVokal++;
                    } else {
                        konsonan++;
                        totalKonsonan++;
                    }
                }
            }


            vocalA += (vokal * i) + " ";


            konsonanA += (konsonan * i) + " ";
        }

        vocalA = vocalA.trim();
        konsonanA = konsonanA.trim();


        System.out.println("A. Ada berapa huruf vokal : " + totalVokal);
        System.out.println("B. Ada berapa huruf konsonan : " + totalKonsonan);
        System.out.println("C. String vocalA = " + vocalA + " ");
        System.out.println("D. String konsonanA = " + konsonanA + " ");*/


        // ========================================== SOAL NO 2 =======================================================
        /*String[][] mulDIm = new String[20][10];

        for (int b = 0; b < 20; b++) {
            for (int k = 0; k < 10; k++) {
                mulDIm[b][k] = "O";
            }
        }
        mulDIm[0][0] = "X"; mulDIm[5][2] = "X"; mulDIm[9][1] = "X"; mulDIm[0][9] = "X";
        mulDIm[1][9] = "X"; mulDIm[2][9] = "X"; mulDIm[2][8] = "X"; mulDIm[1][8] = "X";
        mulDIm[6][5] = "X"; mulDIm[7][5] = "X"; mulDIm[7][6] = "X"; mulDIm[6][6] = "X"; mulDIm[11][7] = "X";
        mulDIm[12][7] = "X"; mulDIm[13][7] = "X"; mulDIm[12][6] = "X"; mulDIm[15][1] = "X"; mulDIm[16][1] = "X";
        mulDIm[17][1] = "X"; mulDIm[17][0] = "X"; mulDIm[16][0] = "X"; mulDIm[18][0] = "X"; mulDIm[19][0] = "X";
        mulDIm[18][8] = "X"; mulDIm[18][9] = "X"; mulDIm[19][9] = "X";

        System.out.println("Tabel 20x10:");
        for (int b = 0; b < 20; b++) {
            System.out.print("|");
            for (int k = 0; k < 10; k++) {
                System.out.print(mulDIm[b][k] + "|");
            }
            System.out.println();
        }

        // Deteksi individu dan kelompok
        boolean[][] visited = new boolean[20][10];
        int individu = 0;
        int kelompok = 0;
        StringBuilder indexIndividu = new StringBuilder();
        StringBuilder indexKelompok = new StringBuilder();

        for (int b = 0; b < 20; b++) {
            for (int k = 0; k < 10; k++) {
                if (mulDIm[b][k].equals("X") && !visited[b][k]) {
                    if (isIndividu(mulDIm, b, k)) {
                        individu++;
                        visited[b][k] = true;
                        indexIndividu.append(b).append(",").append(k).append(" ");
                    } else {
                        kelompok++;
                        StringBuilder satuKelompok = new StringBuilder();
                        dfs(mulDIm, visited, b, k, satuKelompok);
                        if (!satuKelompok.isEmpty()) {
                            if (indexKelompok.length() > 0) indexKelompok.append(" ");
                            indexKelompok.append(satuKelompok.toString().trim().replace(" ", "-"));
                        }
                    }
                }
            }
        }


        System.out.println("A. Ada berapa individu? " + individu);
        System.out.println("B. Ada berapa kelompok? " + kelompok);
        System.out.println("C. Individu ada di index array berapa? " + indexIndividu.toString().trim() + " ");
        System.out.println("D. Kelompok ada di index array berapa? " + indexKelompok.toString().trim() + " ");
    }

    public static boolean isIndividu(String[][] grid, int b, int k) {
        for (int db = -1; db <= 1; db++) {
            for (int dk = -1; dk <= 1; dk++) {
                if (db == 0 && dk == 0) continue;
                int nb = b + db;
                int nk = k + dk;
                if (nb >= 0 && nb < 20 && nk >= 0 && nk < 10) {
                    if (grid[nb][nk].equals("X")) return false;
                }
            }
        }
        return true;
    }

    public static void dfs(String[][] grid, boolean[][] visited, int b, int k, StringBuilder sb) {
        if (b < 0 || b >= 20 || k < 0 || k >= 10) return;
        if (!grid[b][k].equals("X") || visited[b][k]) return;

        visited[b][k] = true;
        sb.append(b).append(",").append(k).append(" ");

        for (int db = -1; db <= 1; db++) {
            for (int dk = -1; dk <= 1; dk++) {
                if (db == 0 && dk == 0) continue;
                dfs(grid, visited, b + db, k + dk, sb);
            }
        }*/

        //======================================================= SOAL NO 3 =============================================
        String[][] mulDIm = new String[20][10];

        for (int b = 0; b < 20; b++) {
            for (int k = 0; k < 10; k++) {
                mulDIm[b][k] = "O";
            }
        }


        mulDIm[0][0] = "X";
        mulDIm[5][2] = "X";
        mulDIm[9][1] = "X";
        mulDIm[0][9] = "X";
        mulDIm[1][9] = "X";
        mulDIm[2][9] = "X";
        mulDIm[2][8] = "X";
        mulDIm[1][8] = "X";
        mulDIm[6][5] = "X";
        mulDIm[7][5] = "X";
        mulDIm[7][6] = "X";
        mulDIm[6][6] = "X";
        mulDIm[11][7] = "X";
        mulDIm[12][7] = "X";
        mulDIm[13][7] = "X";
        mulDIm[12][6] = "X";
        mulDIm[15][1] = "X";
        mulDIm[16][1] = "X";
        mulDIm[17][1] = "X";
        mulDIm[17][0] = "X";
        mulDIm[16][0] = "X";
        mulDIm[18][0] = "X";
        mulDIm[19][0] = "X";
        mulDIm[18][8] = "X";
        mulDIm[18][9] = "X";
        mulDIm[19][9] = "X";


        System.out.println("Tabel Koordinat X dan O:");
        for (int b = 0; b < 20; b++) {
            System.out.print("|");
            for (int k = 0; k < 10; k++) {
                System.out.print(mulDIm[b][k] + "|");
            }
            System.out.println();
        }
        System.out.println(); // Spasi pemisah

        // Simpan posisi dan jarak dari (0,0)
        int[][] posisiX = new int[50][3];
        int count = 0;

        for (int b = 0; b < 20; b++) {
            for (int k = 0; k < 10; k++) {
                if (mulDIm[b][k].equals("X")) {
                    posisiX[count][0] = b;
                    posisiX[count][1] = k;
                    posisiX[count][2] = b + k; // Jarak sederhana dari (0,0)
                    count++;
                }
            }
        }

        // a. X Terdekat dari (0,0)
        int minIndex = 0;
        for (int i = 1; i < count; i++) {
            if (posisiX[i][2] < posisiX[minIndex][2]) {
                minIndex = i;
            }
        }
        System.out.println("A. X Terdekat dari (0,0): (" + posisiX[minIndex][0] + "," + posisiX[minIndex][1] + ")");

        // b. X Terjauh dari (0,0)
        int maxIndex = 0;
        for (int i = 1; i < count; i++) {
            if (posisiX[i][2] > posisiX[maxIndex][2]) {
                maxIndex = i;
            }
        }
        System.out.println("B. X Terjauh dari (0,0): (" + posisiX[maxIndex][0] + "," + posisiX[maxIndex][1] + ")");

        // c. Urutkan dari TERJAUH ke TERDEKAT
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (posisiX[j][2] < posisiX[j + 1][2]) {
                    int[] temp = posisiX[j];
                    posisiX[j] = posisiX[j + 1];
                    posisiX[j + 1] = temp;
                }
            }
        }
        System.out.println("C. Urutan dari TERJAUH ke TERDEKAT:");
        for (int i = 0; i < count; i++) {
            System.out.println("(" + posisiX[i][0] + "," + posisiX[i][1] + ") - Jarak: " + posisiX[i][2]);
        }

        // d. Urutkan dari TERDEKAT ke TERJAUH
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (posisiX[j][2] > posisiX[j + 1][2]) {
                    int[] temp = posisiX[j];
                    posisiX[j] = posisiX[j + 1];
                    posisiX[j + 1] = temp;
                }
            }
        }
        System.out.println("D. Urutan dari TERDEKAT ke TERJAUH:");
        for (int i = 0; i < count; i++) {
            System.out.println("(" + posisiX[i][0] + "," + posisiX[i][1] + ") - Jarak: " + posisiX[i][2]);
        }
    }
}
