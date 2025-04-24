package Fadhil.Belajar_Java_dasar.Tugas_23_April_2025;

import java.io.*;

public class Input_Output {
    static String[][][] patterns = new String[26][7][7];

    public static void main(String[] args) throws IOException {
        String[] words = {"FADHIL", "RAFIQ", "ISKANDAR", "PUTRA"};
        initPatterns();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Learn.txt"))) {
            for (String word : words) {
                for (int row = 0; row < 7; row++) {
                    for (int i = 0; i < word.length(); i++) {
                        char ch = word.charAt(i);
                        int index = ch - 'A';
                        for (int col = 0; col < 7; col++) {
                            writer.write(patterns[index][row][col]);
                        }
                        writer.write(" "); // pisah antar huruf
                    }
                    writer.newLine(); // baris baru untuk setiap row
                }
                writer.newLine(); // spasi antar kata
            }
        }

        System.out.println("✅ File 'Learn.csv' berhasil dibuat dalam format vertikal per kata!");
    }

    static void initPatterns() {
        for (int i = 0; i < 26; i++) {
            for (int row = 0; row < 7; row++) {
                for (int col = 0; col < 7; col++) {
                    patterns[i][row][col] = " ";
                }
            }
        }

        setA(); setD(); setF(); setH(); setI(); setL(); setQ(); setR(); setS();
        setU(); setN(); setP(); setK(); setT();
    }

    static void setA() {
        int i = 'A' - 'A';
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 7; col++) {
                if ((row == 0 && col > 0 && col < 6) ||
                        (row == 3) ||
                        (col == 0 && row > 0) ||
                        (col == 6 && row > 0)) {
                    patterns[i][row][col] = "O";
                }
            }
        }
    }

    static void setD() {
        int i = 'D' - 'A';
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 7; col++) {
                if (col == 0 || (row == 0 || row == 6) && col < 6 || (col == 6 && row > 0 && row < 6)) {
                    patterns[i][row][col] = "O";
                }
            }
        }
    }

    static void setF() {
        int i = 'F' - 'A';
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 7; col++) {
                if (col == 0 || row == 0 || row == 3) patterns[i][row][col] = "O";
            }
        }
    }

    static void setH() {
        int i = 'H' - 'A';
        for (int row = 0; row < 7; row++) {
            patterns[i][row][0] = "O";
            patterns[i][row][6] = "O";
        }
        for (int col = 0; col < 7; col++) {
            patterns[i][3][col] = "O";
        }
    }

    static void setI() {
        int i = 'I' - 'A';
        for (int col = 0; col < 7; col++) {
            patterns[i][0][col] = "O";
            patterns[i][6][col] = "O";
        }
        for (int row = 1; row < 6; row++) {
            patterns[i][row][3] = "O";
        }
    }

    static void setL() {
        int i = 'L' - 'A';
        for (int row = 0; row < 7; row++) {
            patterns[i][row][0] = "O";
        }
        for (int col = 0; col < 7; col++) {
            patterns[i][6][col] = "O";
        }
    }

    static void setQ() {
        int i = 'Q' - 'A';
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 7; col++) {
                if ((row == 0 || row == 6) && col > 0 && col < 6 ||
                        (col == 0 || col == 6) && row > 0 && row < 6) {
                    patterns[i][row][col] = "O";
                }
            }
        }
        patterns[i][5][4] = "O";
        patterns[i][6][5] = "O";
    }

    static void setR() {
        int i = 'R' - 'A';
        for (int row = 0; row < 7; row++) {
            patterns[i][row][0] = "O";
        }
        for (int col = 1; col < 6; col++) {
            patterns[i][0][col] = "O";
            patterns[i][3][col] = "O";
        }
        for (int row = 1; row < 3; row++) {
            patterns[i][row][6] = "O";
        }
        patterns[i][4][2] = "O";
        patterns[i][5][3] = "O";
        patterns[i][6][4] = "O";
    }

    static void setS() {
        int i = 'S' - 'A';
        for (int col = 0; col < 7; col++) {
            patterns[i][0][col] = "O";
            patterns[i][3][col] = "O";
            patterns[i][6][col] = "O";
        }
        patterns[i][1][0] = "O";
        patterns[i][2][0] = "O";
        patterns[i][4][6] = "O";
        patterns[i][5][6] = "O";
    }

    static void setU() {
        int i = 'U' - 'A';
        for (int row = 0; row < 6; row++) {
            patterns[i][row][0] = "O";
            patterns[i][row][6] = "O";
        }
        for (int col = 1; col < 6; col++) {
            patterns[i][6][col] = "O";
        }
    }

    static void setN() {
        int i = 'N' - 'A';
        for (int row = 0; row < 7; row++) {
            patterns[i][row][0] = "O";
            patterns[i][row][6] = "O";
            patterns[i][row][row] = "O";
        }
    }

    static void setP() {
        int i = 'P' - 'A';
        for (int row = 0; row < 7; row++) {
            patterns[i][row][0] = "O";
        }
        for (int col = 1; col < 6; col++) {
            patterns[i][0][col] = "O";
            patterns[i][3][col] = "O";
        }
        patterns[i][1][6] = "O";
        patterns[i][2][6] = "O";
    }

    static void setK() {
        int i = 'K' - 'A';
        for (int row = 0; row < 7; row++) {
            patterns[i][row][0] = "O"; // Kolom pertama
            patterns[i][row][6 - row] = "O"; // Diagonal dari atas ke bawah kanan
            patterns[i][row][row] = "O"; // Diagonal dari atas ke bawah kiri
        }
    }

    static void setT() {
        int i = 'T' - 'A';
        for (int col = 0; col < 7; col++) {
            patterns[i][0][col] = "O";
        }
        for (int row = 1; row < 7; row++) {
            patterns[i][row][3] = "O";
        }
    }
}
