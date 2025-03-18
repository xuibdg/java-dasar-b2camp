//1. buatkan biodata✅
//String nama
//int umur
//double tinggiBadan
//char jenisKelamin
//boolean sudahMenikah
//String alamat
//
//2. coba balikan nama anda. contoh FAUZI menjadi IZUAF✅ source: https://codegym.cc/id/groups/posts/id.1015.berbagai-cara-membalikkan-string-di-java
//3. Buat program Java yang menyimpan lima nama teman dalam sebuah array lalu mencetak indeks ke 3 nama tersebut ke layar.✅ source: https://www.petanikode.com/java-array/
//4. Konversi Tipe Data
//Buat variable untuk  konversi dari int ke double dan dari double ke int✅ source: https://codegym.cc/id/groups/posts/id.626.bagaimana-mengkonversi-int-menjadi-double-di-java


package rafie.belajar_java_dasar;

public class task18march {
    public static void main(String[] args) {
    String nama = "Rafie Safaraz";
    String namaTerbalik = new StringBuilder(nama).reverse().toString();
    String[] namaTeman = {"Ahmad", "Jack", "Restu", "Vikson", "Gogon"};
    int umur = 20;
    double umurSetelahKonversi = umur;
    double tinggiBadan = 150.0;
    char jenisKelamin = 'L';
    boolean sudahMenikah = false;
    String alamat = "Bojongsantos";

    System.out.println("Nama ku adalah: " + nama);
    System.out.println("Nama terbalik ku adalah: " + namaTerbalik);
    System.out.println("Nama teman ke 3 " + nama + " adalah: " + namaTeman[3]);
    System.out.println("Umur ku bertipe data integer, yaitu: " + umur);
    System.out.println("Umur ku setelah di konversi menjadi tipe data double, yaitu: " + umurSetelahKonversi);
    System.out.println("#Agar tidak redundant.# Umur ku setelah di konversi menjadi tipe data double, yaitu: " + (double) umur); // <- Solusi warning redundant (agar tidak redundant)
    }
}