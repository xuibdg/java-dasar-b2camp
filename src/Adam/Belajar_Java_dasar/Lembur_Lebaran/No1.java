package Adam.Belajar_Java_dasar.Lembur_Lebaran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class No1 {
    public static void main(String[] args) {
        String varA = "aku adalah seorang programmer java";
        ArrayList<String> kalimat = new ArrayList<>(Arrays.asList(varA.split(" ")));
        System.out.println(kalimat);

        System.out.println("..................................................................");

        long jumlahHV = varA.chars().filter(c -> "aiueo".indexOf(c) != -1).count();
        System.out.println("Jumlah Huruf Vokal : " + jumlahHV);

        System.out.println("..................................................................");

        long jumlahH = varA.chars().filter(Character::isLetter).count();
        System.out.println("Jumlah Huruf : " + jumlahH);

        System.out.println("..................................................................");
        long jumlahK = jumlahH - jumlahHV;
        System.out.println("Jumlah Huruf Konsonan : " + jumlahK);
        System.out.println("..................................................................");

        String[] kataKalimat = varA.split(" ");
        String hurufVokal = "aiueoAIUEO";

        String vocalA = IntStream.range(0, kataKalimat.length).mapToObj(i -> {
            String kata = kataKalimat[i];
            long jumlahVokal = kata.chars().filter(c -> hurufVokal.indexOf(c) != -1).count();
            return (jumlahVokal > 1) ? String.valueOf(i * jumlahVokal) : "0";
        }).collect(Collectors.joining(" "));

        System.out.println("vocalA = \"" + vocalA + "\"");

        System.out.println("..................................................................");

        String konsonanA = IntStream.range(0, kataKalimat.length).mapToObj(i -> {
            String kata = kataKalimat[i];
            long jumlahKonsonan = kata.chars().filter(c -> Character.isLetter(c) && hurufVokal.indexOf(c) == -1).count();
            return (jumlahKonsonan > 1) ? String.valueOf(i * jumlahKonsonan) : "0";
        }).collect(Collectors.joining(" "));

        System.out.println("konsonanA = \"" + konsonanA + "\"");





    }

}
