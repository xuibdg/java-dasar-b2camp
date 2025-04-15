package Adam.Belajar_Java_dasar.Lembur_Lebaran;

import java.util.ArrayList;
import java.util.List;

public class No2_3 {
    public static void main(String[] args) {
        String[][] mulDim = new String[20][10];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                mulDim[i][j] = "O";
            }
        }
        mulDim[0][0] = "X";
        mulDim[16][0] = "X";
        mulDim[17][0] = "X";
        mulDim[18][0] = "X";
        mulDim[19][0] = "X";

        mulDim[9][1] = "X";
        mulDim[15][1] = "X";
        mulDim[16][1] = "X";
        mulDim[17][1] = "X";

        mulDim[6][2] = "X";

        mulDim[6][5] = "X";
        mulDim[7][5] = "X";

        mulDim[6][6] = "X";
        mulDim[7][6] = "X";
        mulDim[12][6] = "X";

        mulDim[11][7] = "X";
        mulDim[12][7] = "X";
        mulDim[13][7] = "X";

        mulDim[1][8] = "X";
        mulDim[2][8] = "X";
        mulDim[18][8] = "X";

        mulDim[0][9] = "X";
        mulDim[1][9] = "X";
        mulDim[2][9] = "X";
        mulDim[18][9] = "X";
        mulDim[19][9] = "X";

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mulDim[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("..........................................................");

        List<String> individuList = new ArrayList<>();
        for (int i = 0; i < mulDim.length; i++) {
            for (int j = 0; j < mulDim[0].length; j++) {
                if ("X".equals(mulDim[i][j]) && isIndividu(mulDim, i, j)) {
                    individuList.add(i + "," + j);
                }
            }
        }

        System.out.println("Jumlah individu: " + individuList.size());
        System.out.print("Letak Individu → ");
        System.out.println(String.join(" ", individuList));

        System.out.println("..........................................................");

        boolean[][] visited = new boolean[20][10];
        List<List<String>> semuaKelompok = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if ("X".equals(mulDim[i][j]) && !visited[i][j]) {
                    List<String> satuKelompok = new ArrayList<>();
                    dfs(mulDim, visited, i, j, satuKelompok);
                    if (satuKelompok.size() > 1)
                    semuaKelompok.add(satuKelompok);
                }
            }
        }

        System.out.println("Jumlah kelompok: " + semuaKelompok.size());

        System.out.println("Letak kelompok:");
        for (int i = 0; i < semuaKelompok.size(); i++) {
            List<String> kelompok = semuaKelompok.get(i);
            System.out.println("Kelompok " + (i + 1) + ": " + String.join(" - ", kelompok));
        }
        System.out.println();
    }

    private static boolean isIndividu(String[][] arr, int i, int j) {
        int rows = arr.length;
        int cols = arr[0].length;

        return !(i > 0 && "X".equals(arr[i - 1][j])) &&
                !(i < rows - 1 && "X".equals(arr[i + 1][j])) &&
                !(j > 0 && "X".equals(arr[i][j - 1])) &&
                !(j < cols - 1 && "X".equals(arr[i][j + 1]));
    }

    private static void dfs(String[][] arr, boolean[][] visited, int i, int j, List<String> kelompok) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (i < 0 || j < 0 || i >= rows || j >= cols || !"X".equals(arr[i][j]) || visited[i][j]) return;

        visited[i][j] = true;
        kelompok.add(i + "," + j);

        dfs(arr, visited, i - 1, j, kelompok);
        dfs(arr, visited, i + 1, j, kelompok);
        dfs(arr, visited, i, j - 1, kelompok);
        dfs(arr, visited, i, j + 1, kelompok);

    }
}
