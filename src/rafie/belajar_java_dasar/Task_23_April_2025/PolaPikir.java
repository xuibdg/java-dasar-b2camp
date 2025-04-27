package rafie.belajar_java_dasar.Task_23_April_2025;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PolaPikir {
    public static void main(String[] args) {
        int tinggi = 7;
        String filePath = "polaRafie.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < tinggi; i++) {
                String r = cetakR(i);
                String a = cetakA(i);
                String f = cetakF(i);
                String iStr = cetakI(i);
                String e = cetakE(i);
                System.out.print(r + a + f + iStr + e);
                System.out.println();
                writer.write(r + a + f + iStr + e);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String replacing(String s) {
        return s.replace("a", "#");
    }

    static String cetakR(int i) {
        String[] rTemplate = {"aaaaa  ", "a    a ", "a    a ", "aaaaa  ", "a   a  ", "a    a ", "a    a "};
        return replacing(rTemplate[i]) + " ";
    }

    static String cetakA(int i) {
        String[] aTemplate = {"  a    ", " a a   ", "a   a  ", "aaaaaa ", "a   a  ", "a   a  ", "a   a  "};
        return replacing(aTemplate[i]) + " ";
    }

    static String cetakF(int i) {
        String[] fTemplate = {"aaaaaa ", "a      ", "a      ", "aaaaaa ", "a      ", "a      ", "a      "};
        return replacing(fTemplate[i]) + " ";
    }

    static String cetakI(int i) {
        String[] iTemplate = {"aaaaaa ", "  aa   ", "  aa   ", "  aa   ", "  aa   ", "  aa   ", "aaaaaa "};
        return replacing(iTemplate[i]) + " ";
    }

    static String cetakE(int i) {
        String[] eTemplate = {"aaaaaa ", "a      ", "a      ", "aaaaaa ", "a      ", "a      ", "aaaaaa "};
        return replacing(eTemplate[i]) + " ";
    }
}