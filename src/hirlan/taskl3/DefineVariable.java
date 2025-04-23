package hirlan.taskl3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DefineVariable {
    public static void main(String[] args) {
        String varKal=" AKU ADALAH SEORANG PROGRAMMER JAVA";
        //jumlah huruf
        String result= String.valueOf(varKal.length());

        System.out.println("Total huruf :"+varKal+" = "+result);

        char vokalis = varKal.charAt(2);

        System.out.println(vokalis);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine().toLowerCase();

        String[] kataArray = kalimat.split("\\s+");

        for (String kata : kataArray) {
            System.out.println("\nBackground Analisis : \"" + kata + "\"");

            Map<Character, Integer> vokal = new HashMap<>();
            Map<Character, Integer> konsonan = new HashMap<>();

            for (char ch : kata.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (isVokal(ch)) {
                        vokal.put(ch, vokal.getOrDefault(ch, 0) + 1);
                    } else {
                        konsonan.put(ch, konsonan.getOrDefault(ch, 0) + 1);
                    }
                }
            }

            System.out.println("  Vokal: " + formatHasil(vokal));
            System.out.println("  Konsonan: " + formatHasil(konsonan));
            System.out.println("  Total Vokal: " + hitungTotal(vokal));
            System.out.println("  Total Pengkalian Vokal: " + hitungTotal(vokal)*hitungTotal(vokal));
            System.out.println("  Total Konsonan: " + hitungTotal(konsonan));
            System.out.println("  Total Pengkalian Konsonan: " + (hitungTotal(konsonan)*hitungTotal(konsonan)));
        }
    }

    private static boolean isVokal(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    private static String formatHasil(Map<Character, Integer> map) {
        if (map.isEmpty()) return "-";
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    private static int hitungTotal(Map<Character, Integer> map) {
        return map.values().stream().mapToInt(Integer::intValue).sum();

    }
}
