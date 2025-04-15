package jauhari.belajar_java_dasar.HolidayTask;

public class VokalKonsonan {
    public static void main(String[] args) {
        String[] varA = {"aku adalah seorang programmer java"};
        String kalimat = varA[0].toLowerCase();

        int totalVokal = 0;
        int totalKonsonan = 0;

        // Hitung total vokal dan konsonan semua huruf
        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (isVokal(c)) {
                totalVokal++;
            } else if (Character.isLetter(c)) {
                totalKonsonan++;
            }
        }

        System.out.println("Total Vokal: " + totalVokal);
        System.out.println("Total Konsonan: " + totalKonsonan);

        // Pisahkan jadi kata
        String[] kataArray = kalimat.split(" ");
        int[] vokalXIndex = new int[kataArray.length];
        int[] konsonanXIndex = new int[kataArray.length];

        // Hitung vokal dan konsonan per kata x indeks
        for (int i = 0; i < kataArray.length; i++) {
            String kata = kataArray[i];
            int vokal = 0;
            int konsonan = 0;

            for (int j = 0; j < kata.length(); j++) {
                char c = kata.charAt(j);
                if (isVokal(c)) {
                    vokal++;
                } else if (Character.isLetter(c)) {
                    konsonan++;
                }
            }

            vokalXIndex[i] = vokal * i;
            konsonanXIndex[i] = konsonan * i;
        }

        // Tampilkan hasil dalam satu baris
        System.out.print("\nVokal x Indeks: ");
        for (int v : vokalXIndex) {
            System.out.print(v + " ");
        }

        System.out.print("\nKonsonan x Indeks: ");
        for (int k : konsonanXIndex) {
            System.out.print(k + " ");
        }

        System.out.println(); // biar rapi
    }

    public static boolean isVokal(char c) {
        return "aiueo".indexOf(c) != -1;
    }
}

