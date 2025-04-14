package Fadhil.Belajar_Java_dasar.Lembur;

import java.util.*;

public class No_2 {
    static final int ROWS = 20;
    static final int COLS = 10;
    static String[][] tabel = {
            {"X", "O", "O", "O", "O", "O", "O", "O", "O", "X"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "X", "X"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "X", "X"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"0", "O", "X", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "X", "X", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "X", "X", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "X", "O", "O", "O", "O", "O", "O", "O", "O"},
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

    static boolean[][] visited = new boolean[ROWS][COLS];
    static int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}}; // Atas, Bawah, Kiri, Kanan

    public static void main(String[] args) {
        int individuCount = 0;
        List<String> individuIndex = new ArrayList<>();

        int kelompokCount = 0;
        List<List<String>> kelompokIndex = new ArrayList<>();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (tabel[i][j].equals("X") && !visited[i][j]) {
                    List<String> currentGroup = new ArrayList<>();
                    dfs(i, j, currentGroup);
                    if (currentGroup.size() == 1) {
                        individuCount++;
                        individuIndex.add(currentGroup.get(0));
                    } else {
                        kelompokCount++;
                        kelompokIndex.add(currentGroup);
                    }
                }
            }
        }

        // Print hasil
        System.out.println("1. Jumlah Individu: " + individuCount);
        System.out.println("2. Jumlah Kelompok: " + kelompokCount);

        System.out.println("3. Individu ada di index:");
        for (String idx : individuIndex) {
            System.out.println("   - " + idx);
        }

        System.out.println("4. Kelompok ada di index:");
        int no = 1;
        for (List<String> group : kelompokIndex) {
            System.out.println("   Kelompok " + no++ + ": " + group);
        }
    }

    static void dfs(int i, int j, List<String> group) {
        visited[i][j] = true;
        group.add("[" + i + "," + j + "]");

        for (int[] dir : directions) {
            int ni = i + dir[0];
            int nj = j + dir[1];
            if (ni >= 0 && ni < ROWS && nj >= 0 && nj < COLS && !visited[ni][nj] && tabel[ni][nj].equals("X")) {
                dfs(ni, nj, group);
            }
        }

        
    }
}
