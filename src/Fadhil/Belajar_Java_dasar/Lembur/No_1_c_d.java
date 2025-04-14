package Fadhil.Belajar_Java_dasar.Lembur;

public class No_1_c_d {
    public static void main(String[] args) {
        String varA = "aku adalah seorang programmer java";

        // Memecah kalimat menjadi array kata
        String[] words = varA.split(" ");

        // Inisialisasi StringBuilder untuk menyimpan hasil
        StringBuilder vocalA = new StringBuilder();
        StringBuilder konsonanA = new StringBuilder();

        // Proses setiap kata untuk menghitung vokal dan konsonan
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Hitung jumlah vokal dan konsonan
            int vocalsCount = countVocals(word);
            int consonantCount = countConsonants(word);

            // Poin C: Jika lebih dari 1 vokal, kalikan dengan posisi kata
            if (vocalsCount > 0) {
                vocalA.append(vocalsCount * i).append(" ");
            } else {
                vocalA.append(vocalsCount).append(" ");
            }

            // Poin D: Jika lebih dari 1 konsonan, kalikan dengan posisi kata
            if (consonantCount > 0) {
                konsonanA.append(consonantCount * i).append(" ");
            } else {
                konsonanA.append(consonantCount).append(" ");
            }
        }

        // Menampilkan hasil
        System.out.println("vocalA = \"" + vocalA.toString().trim() + "\";");
        System.out.println("konsonanA = \"" + konsonanA.toString().trim() + "\";");
    }

    // Fungsi untuk menghitung jumlah vokal
    public static int countVocals(String word) {
        String vowels = "aeiouAEIOU"; // Daftar vokal
        int count = 0;

        // Menghitung vokal dalam kata
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    // Fungsi untuk menghitung jumlah konsonan
    public static int countConsonants(String word) {
        String vowels = "aeiouAEIOU"; // Daftar vokal
        int count = 0;

        // Menghitung konsonan dalam kata
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }
}
