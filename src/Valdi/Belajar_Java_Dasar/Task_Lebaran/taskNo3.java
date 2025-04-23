package Valdi.Belajar_Java_Dasar.Task_Lebaran;

import java.util.*;

public class taskNo3 {

    static class Point {
        int x, y, jarak;

        public Point(int x, int y, int jarak) {
            this.x = x;
            this.y = y;
            this.jarak = jarak;
        }

        @Override
        public String toString() {
            return x + "," + y;
        }
    }

    public static void main(String[] args) {
        int rows = 20;
        int cols = 10;
        String[][] mulDim = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            Arrays.fill(mulDim[i], "O");
        }

        mulDim[0][0] = "X";
        mulDim[5][2] = "X";
        mulDim[9][1] = "X";
        mulDim[15][1] = "X";
        mulDim[16][0] = "X";
        mulDim[17][0] = "X";
        mulDim[18][0] = "X";
        mulDim[19][0] = "X";
        mulDim[16][1] = "X";
        mulDim[17][1] = "X";
        mulDim[9][4] = "X";
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
        mulDim[0][9] = "X";
        mulDim[1][9] = "X";
        mulDim[2][9] = "X";
        mulDim[18][8] = "X";
        mulDim[18][9] = "X";
        mulDim[19][9] = "X";

        System.out.println("Tampilan Grid:");
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                System.out.print(mulDim[y][x] + "   ");
            }
            System.out.println();
        }

        List<Point> list = new ArrayList<>();
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                if ("X".equals(mulDim[y][x])) {
                    int jarak = Math.min(Math.min(x, cols - 1 - x), Math.min(y, rows - 1 - y));
                    list.add(new Point(x, y, jarak));
                }
            }
        }

        list.sort(Comparator.comparingInt(p -> p.jarak));

        System.out.println("\nTitik terdekat dari garis tepi: (" + list.get(0) + ")");

        System.out.println("Titik terjauh dari garis tepi: (" + list.get(list.size() - 1) + ")");

        System.out.println("\nUrutan dari terjauh ke terdekat:");
        list.stream()
                .sorted((a, b) -> Integer.compare(b.jarak, a.jarak))
                .forEach(p -> System.out.println("(" + p + ")"));

        System.out.println("\nUrutan dari terdekat ke terjauh:");
        list.forEach(p -> System.out.println("(" + p + ")"));
    }
}
