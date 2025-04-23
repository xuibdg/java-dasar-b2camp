package Valdi.Belajar_Java_Dasar.Task_Lebaran;

import java.util.*;

public class taskNo2 {
    static int ROWS = 20;
    static int COLS = 10;
    static String[][] mulDim = new String[ROWS][COLS];
    static boolean[][] visited = new boolean[ROWS][COLS];
    static List<List<String>> kelompokList = new ArrayList<>();
    static List<String> individuList = new ArrayList<>();

    public static void main(String[] args) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                mulDim[row][col] = "O";
            }
        }

        // Isi data "X"
        //individu
        mulDim[0][0] = "X";
        mulDim[5][2] = "X";
        mulDim[9][1] = "X";

        //kelompok 1
        mulDim[0][9] = "X";
        mulDim[1][9] = "X";
        mulDim[2][9] = "X";
        mulDim[2][8] = "X";
        mulDim[1][8] = "X";

        //kelompok 2
        mulDim[6][5] = "X";
        mulDim[7][5] = "X";
        mulDim[7][6] = "X";
        mulDim[6][6] = "X";

        //kelompok 3
        mulDim[11][7] = "X";
        mulDim[12][7] = "X";
        mulDim[13][7] = "X";
        mulDim[12][6] = "X";

        //kelompok 4
        mulDim[15][1] = "X";
        mulDim[16][1] = "X";
        mulDim[17][1] = "X";
        mulDim[17][0] = "X";
        mulDim[16][0] = "X";
        mulDim[18][0] = "X";
        mulDim[19][0] = "X";

        //kelompok 5
        mulDim[18][8] = "X";
        mulDim[18][9] = "X";
        mulDim[19][9] = "X";

        printMulDim();

        detectKelompokDanIndividu();

        System.out.println("\nJumlah individu: " + individuList.size());
        System.out.println("Jumlah kelompok: " + kelompokList.size());

        System.out.println("\nIndividu ada di index:");
        int hitung = 1;
        for (String individu : individuList){
            System.out.println("individu " + hitung + ": " + individu);
            hitung++;
        }

        System.out.println("\nKelompok ada di index:");
        int count = 1;
        for (List<String> kelompok : kelompokList) {
            System.out.println("Kelompok " + count + ": " + kelompok);
            count++;
        }
    }

    static void detectKelompokDanIndividu() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (mulDim[row][col].equals("X") && !visited[row][col]) {
                    List<String> cluster = new ArrayList<>();
                    dfs(row, col, cluster);
                    if (cluster.size() == 1) {
                        individuList.add(cluster.get(0));
                    } else {
                        kelompokList.add(cluster);
                    }
                }
            }
        }
    }

    static void dfs(int row, int col, List<String> cluster) {
        if (row < 0 || col < 0 || row >= ROWS || col >= COLS || visited[row][col] || !mulDim[row][col].equals("X"))
            return;

        visited[row][col] = true;
        cluster.add(row + "," + col);

        dfs(row - 1, col, cluster);
        dfs(row + 1, col, cluster);
        dfs(row, col - 1, cluster);
        dfs(row, col + 1, cluster);
    }

    static void printMulDim() {
        System.out.println("Tampilan (20 baris x 10 kolom):\n");
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                System.out.print(mulDim[row][col] + "     ");
            }
            System.out.println();
        }
    }
}
