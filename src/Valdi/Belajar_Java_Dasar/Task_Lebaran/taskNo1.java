package Valdi.Belajar_Java_Dasar.Task_Lebaran;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class taskNo1 {
    public static void main(String[] args) {
        String kalimat = "aku adalah seorang programmer java";
        String[] kataArray = kalimat.split(" ");
        String vokalString = "aiueo";

        int totalVokal = (int) kalimat.chars()
                .filter(c -> vokalString.indexOf(c) >= 0)
                .count();

        int totalKonsonan = (int) kalimat.chars()
                .filter(Character::isLetter)
                .filter(c -> vokalString.indexOf(c) == -1)
                .count();

        String vocalA = IntStream.range(0, kataArray.length)
                .mapToObj(i -> {
                    String kata = kataArray[i];
                    int vokalCount = (int) kata.chars()
                            .filter(c -> vokalString.indexOf(c) >= 0)
                            .count();
                    return vokalCount > 1 ? String.valueOf(vokalCount * i) : "0";
                })
                .collect(Collectors.joining(" "));

        String konsonanA = IntStream.range(0, kataArray.length)
                .mapToObj(i -> {
                    String kata = kataArray[i];
                    int konsonanCount = (int) kata.chars()
                            .filter(Character::isLetter)
                            .filter(c -> vokalString.indexOf(c) == -1)
                            .count();
                    return konsonanCount > 1 ? String.valueOf(konsonanCount * i) : "0";
                })
                .collect(Collectors.joining(" "));

        System.out.println("Kalimat===============");
        System.out.println(kalimat);

        System.out.println("\nJumlah Total===============");
        System.out.println("Jumlah huruf vokal     : " + totalVokal);
        System.out.println("Jumlah huruf konsonan  : " + totalKonsonan);

        System.out.println("\nHasil Per Kata===============");
        System.out.println("String vocalA          = " + vocalA);
        System.out.println("String konsonanA       = " + konsonanA);
    }
}
