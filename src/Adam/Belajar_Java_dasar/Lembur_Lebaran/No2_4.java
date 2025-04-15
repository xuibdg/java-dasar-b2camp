package Adam.Belajar_Java_dasar.Lembur_Lebaran;

import java.util.ArrayList;
import java.util.List;

public class No2_4 {
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
    }

    private static boolean isIndividu(String[][] arr, int i, int j) {
        int rows = arr.length;
        int cols = arr[0].length;

        return !(i > 0 && "X".equals(arr[i - 1][j])) &&
                !(i < rows - 1 && "X".equals(arr[i + 1][j])) &&
                !(j > 0 && "X".equals(arr[i][j - 1])) &&
                !(j < cols - 1 && "X".equals(arr[i][j + 1]));
    }
}

