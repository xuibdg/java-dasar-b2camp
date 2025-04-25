package Revi.Belajar_Java_Dasar.JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReviFileWriter {
    private static final Map<Character, String[]> fontMap = new HashMap<>();

    static {
        fontMap.put('R', new String[]{
                "OOOO ",
                "O   O",
                "O   O",
                "OOOO ",
                "O O  ",
                "O  O ",
                "O   O"
        });
        fontMap.put('E', new String[]{
                "OOOOO",
                "O    ",
                "O    ",
                "OOOO ",
                "O    ",
                "O    ",
                "OOOOO"
        });
        fontMap.put('V', new String[]{
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                " O O ",
                "  O  "
        });
        fontMap.put('I', new String[]{
                "OOOOO",
                "  O  ",
                "  O  ",
                "  O  ",
                "  O  ",
                "  O  ",
                "OOOOO"
        });
        fontMap.put('S', new String[]{
                " OOOO",
                "O    ",
                "O    ",
                " OOO ",
                "    O",
                "    O",
                "OOOO "
        });
        fontMap.put('A', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "OOOOO",
                "O   O",
                "O   O",
                "O   O"
        });
        fontMap.put('T', new String[]{
                "OOOOO",
                "  O  ",
                "  O  ",
                "  O  ",
                "  O  ",
                "  O  ",
                "  O  "
        });
        fontMap.put('R', new String[]{
                "OOOO ",
                "O   O",
                "O   O",
                "OOOO ",
                "O O  ",
                "O  O ",
                "O   O"
        });
        fontMap.put('I', new String[]{
                "OOOOO",
                "  O  ",
                "  O  ",
                "  O  ",
                "  O  ",
                "  O  ",
                "OOOOO"
        });
        fontMap.put('A', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "OOOOO",
                "O   O",
                "O   O",
                "O   O"
        });
        fontMap.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });
    }

    private String toOnlyO(String s) {
        return s.replaceAll("[^ ]", "O");
    }

    public void writeNameToFile(String name, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            name = name.toUpperCase();

            for (int row = 0; row < 7; row++) {
                StringBuilder line = new StringBuilder();
                for (char c : name.toCharArray()) {
                    String[] letter = fontMap.getOrDefault(c, fontMap.get(' '));
                    line.append(toOnlyO(letter[row])).append("  ");
                }
                writer.write(line.toString());
                writer.newLine();
            }

            System.out.println("Nama berhasil ditulis ke file: " + filename);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        ReviFileWriter writer = new ReviFileWriter();
        String name = "REVI SATRIA";
        String userHome = System.getProperty("user.home");
        String filename = userHome + "/Documents/REVI_SATRIA.xlsx";
        writer.writeNameToFile(name, filename);
    }
}