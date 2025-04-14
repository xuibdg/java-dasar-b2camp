package Adam.Belajar_Java_dasar.Lembur_Lebaran;

public class No3_2 {
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
        mulDim[9][4] = "X";
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

        int maxDistance = Integer.MIN_VALUE;
        int[] farthest = {-1, -1};

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if ("X".equals(mulDim[i][j])) {
                    int distance = i + j;
                    if (distance > maxDistance) {
                        maxDistance = distance;
                        farthest[0] = i;
                        farthest[1] = j;
                    }
                }
            }
        }

        System.out.println(".............................................");

        System.out.println("X terjauh dari (0,0): (" + farthest[0] + "," + farthest[1] + ") dengan jarak: " + maxDistance);
    }
}
