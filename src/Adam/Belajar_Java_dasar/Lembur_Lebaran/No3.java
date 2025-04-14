package Adam.Belajar_Java_dasar.Lembur_Lebaran;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class No3 {
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

        int minDistance = Integer.MAX_VALUE;
        int[] closest = {-1, -1};

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if ("X".equals(mulDim[i][j])) {
                    int distance = i + j;
                    if (distance < minDistance) {
                        minDistance = distance;
                        closest[0] = i;
                        closest[1] = j;
                    }
                }
            }
        }

        System.out.println(".....................................................");

        System.out.println("X terdekat dari (0,0): (" + closest[0] + "," + closest[1] + ") dengan jarak: " + minDistance);

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

        System.out.println(".............................................");

        List<No3.Point> titikX = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if ("X".equals(mulDim[i][j])) {
                    int distance = i + j;
                    titikX.add(new No3.Point(i, j, distance));
                }
            }
        }

        titikX.sort(Comparator.comparingInt(No3.Point::getDistance).reversed());

        System.out.println("Titik X dari yang terjauh ke yang terdekat:");
        for (No3.Point p : titikX) {
            System.out.println("→ (" + p.getRow() + "," + p.getCol() + ") dengan jarak " + p.getDistance());
        }
        System.out.println("........................................................");


        List<No3.Point> titikX1 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if ("X".equals(mulDim[i][j])) {
                    int distance = i + j; //
                    titikX1.add(new No3.Point(i, j, distance));
                }
            }
        }

        titikX1.sort(Comparator.comparingInt(No3.Point::getDistance));

        System.out.println("Titik X dari yang terdekat ke yang terjauh:");
        for (No3.Point p : titikX1) {
            System.out.println("→ (" + p.getRow() + "," + p.getCol() + ") dengan jarak " + p.getDistance());
        }

    }

    static class Point {
        private int row;
        private int col;
        private int distance;

        public Point(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }

        public int getDistance() {
            return distance;
        }

    }
}
