package rio.TugasLiburLebran;

// 1. Background Analisa : String varA = “aku adalah seorang programmer java”
//     urutan kalimat dalam array
//     “aku[0] adalah[1] seorang[2] programmer[3] java[4]”
//  a. cari ada berapa huruf vocal per kalimat
//  b. cari berapa huruf konsonan per kalimat
//  c. jika 1 kata berisi lebih dari 1 huruf vocal maka dikalikan dengan berapa banyak huruf vocal nya
//     hasil String vocalA = “0 3 6 9 8”;
//  d. jika 1 kata berisi lebih dari 1 huruf konsonan maka dikalikan dengan berapa banyak huruf
//     konsonan sama seperti diatas nya String konsonanA = “?”;

public class bc_analisKalimat {
    public static void main(String[] args) {

        String varA = "aku adalah seorang programmer java";
        String[] kataArray = varA.split(" "); // Pisahkan string varA menjadi array kata, berdasarkan spasi

        int totalVokal = 0;
        int totalKonsonan = 0;

        StringBuilder vocalA = new StringBuilder(); // → Tipe data/kelas untuk menyusun dan memodifikasi string dari vocalA
        StringBuilder konsonanA = new StringBuilder();
        int index = 0;

        for (String kata : kataArray) { //setiap (kata) di dalam kataArray, lakukan perulangan Simpan di variabel bernama kata
            int jumlahVokal = 0;
            int jumlahKonsonan = 0;

            for (char c : kata.toLowerCase().toCharArray()) { //→ Ubah huruf dalam kata jadi huruf kecil
                if (isVokal(c)) {
                    jumlahVokal++;
                    totalVokal++;
                } else if (Character.isLetter(c)) {  //→ Cek apakah c adalah huruf (a–z / A–Z
                    jumlahKonsonan++;
                    totalKonsonan++;
                }

            }

            // Soal c - vocalA ada berapa setelah di x index
            int nilaiVokal = (jumlahVokal > 1) ? jumlahVokal * index : 0;
            vocalA.append(nilaiVokal).append(" ");
            // jika jumlah vokalnya lebih dari 1, maka isi nilaiVokal dari hasil perkalian jumlahVokal × index
            // kalau tidak, isi dengan 0. Lalu, tambahkan nilai itu ke dalam vocalA

            // Soal d - konsonanA ada berapa setelah di x index
            int nilaiKonsonan = (jumlahKonsonan > 1) ? jumlahKonsonan * index : 0;
            konsonanA.append(nilaiKonsonan).append(" ");
            index++;
        }

        System.out.println("Kalimat: \"" + varA + "\"");
        System.out.println("----------------------------------");
        System.out.println("a. Total huruf vokal    : " + totalVokal);
        System.out.println("b. Total huruf konsonan : " + totalKonsonan);
        System.out.println("c. String vocalA        : \"" + vocalA.toString().trim() + "\"");
        System.out.println("d. String konsonanA     : \"" + konsonanA.toString().trim() + "\"");
    }

    private static boolean isVokal(char c) {
     return "aiueo".indexOf(c) != -1;
    }
}
