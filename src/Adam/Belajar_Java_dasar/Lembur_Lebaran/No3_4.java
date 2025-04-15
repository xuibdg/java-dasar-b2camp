package Adam.Belajar_Java_dasar.Lembur_Lebaran;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class No3_4 {
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

        List<Point> titikX = new ArrayList<>();

        for (int i = 0; i < mulDim.length; i++) {
            for (int j = 0; j < mulDim[0].length; j++) {
                if ("X".equals(mulDim[i][j])) {
                    int distance = i + j; //
                    titikX.add(new Point(i, j, distance));
                }
            }
        }

        titikX.sort(Comparator.comparingInt(Point::getDistance));

        System.out.println("Titik X dari yang terdekat ke yang terjauh:");
        for (Point p : titikX) {
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
