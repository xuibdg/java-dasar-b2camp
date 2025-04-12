package rio.TugasLiburLebran;

import java.util.ArrayList;
import java.util.List;

//2. Background Analisa Cari pengelompokan dan individu
//  ● ada berapa individu? 3
//  ● ada berapa kelompok? 5
//  ● individu ada di index array berapa -> ”0,0 9,1 5,2” pakai spasi untuk next individu
//  ● kelompok ada di index array berapa -> “16,0-17,0-18,0-19,0-15,1-16,1-17,1 ” pakai spasi untuk
//    next kelompok


public class AnalisKelompokIndividu {
    static String[][] mulDIm = new String[20][10];
    static boolean[][] visited = new boolean[20][10];

    public static void main(String[] args) {
        // Isi data (X dan O)
        String[] data = {
                "XOOOOOOOOX", "OOOOOOOOXX", "OOOOOOOOXX", "OOOOOOOOOO",
                "OOOOOOOOOO", "OOXOOOOOOO", "OOOOOXXOOO", "OOOOOXXOOO",
                "OOOOOOOOOO", "OXOOOOOOOO", "OOOOOOOOOO", "OOOOOOOXOO",
                "OOOOOOXXOO", "OOOOOOOXOO", "OOOOOOOOOO", "OXOOOOOOOO",
                "XXOOOOOOOO", "XXOOOOOOOO", "XOOOOOOOOX", "XOOOOOOOOX"
        };

        for (int i = 0; i < 20; i++)
            for (int j = 0; j < 10; j++)
                mulDIm[i][j] = data[i].charAt(j) + "";

        // Tampilkan grid
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) System.out.print("|" + mulDIm[i][j]);
            System.out.println("|");
        }

        // Hitung individu & group
        List<String> individu = new ArrayList<>();
        List<List<String>> groups = new ArrayList<>();

        for (int i = 0; i < 20; i++)
            for (int j = 0; j < 10; j++)
                if (mulDIm[i][j].equals("X") && !visited[i][j]) {
                    List<String> group = new ArrayList<>();
                    dfs(i, j, group); //digunakan untuk menjelajahi struktur data
                    if (group.size() == 1) individu.add(group.get(0));
                    else groups.add(group);
                }

        // Output akhir
        System.out.println("\n" + "total individu : " + individu.size());
        System.out.println("total kelompok : " + groups.size());
        System.out.println("individu di index array -> " + String.join(" ", individu));
        System.out.print("kelompok di index array -> ");
        for (List<String> g : groups) System.out.print(String.join("-", g) + " ");
    }

    static void dfs(int x, int y, List<String> group) {
        if (x < 0 || y < 0 || x >= 20 || y >= 10 || visited[x][y] || !mulDIm[x][y].equals("X")) return;
        visited[x][y] = true;
        group.add(x + "," + y);
        dfs(x - 1, y, group); dfs(x + 1, y, group);
        dfs(x, y - 1, group); dfs(x, y + 1, group);
    }
}
