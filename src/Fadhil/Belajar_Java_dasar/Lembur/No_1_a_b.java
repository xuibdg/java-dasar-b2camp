package Fadhil.Belajar_Java_dasar.Lembur;

public class No_1_a_b {
    public static void main(String[] args) {
        System.out.println("aku adalah seorang programmer java");
        String varA = "aku adalah seorang programmer java";

        // Menghitung jumlah huruf vokal per kalimat
        int totalVocals = countVocals(varA);
        // Menghitung jumlah huruf konsonan per kalimat
        int totalConsonants = countConsonants(varA);

        // Menampilkan hasil
        System.out.println("Jumlah huruf vokal per kalimat: " + totalVocals);
        System.out.println("Jumlah huruf konsonan per kalimat: " + totalConsonants);
    }

    // Fungsi untuk menghitung jumlah huruf vokal
    public static int countVocals(String text) {
        String vowels = "aeiouAEIOU"; // Daftar vokal
        int count = 0;

        // Menghitung vokal dalam teks
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    // Fungsi untuk menghitung jumlah huruf konsonan
    public static int countConsonants(String text) {
        String vowels = "aeiouAEIOU"; // Daftar vokal
        int count = 0;

        // Menghitung konsonan dalam teks
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                count++;
            }
        }
        return count;

    }
}

