package Fadhil.Belajar_Java_dasar;

public class HelloWorldFadhil {
    public static void main(String[] args) {
        System.out.println("====NO 1===="); // NO 1
        String nama = "Fadhil Rafiq Iskandar Putra";
        int umur = 22;
        double tinggiBadan = 174.5;
        char jenisKelamin = 'L';
        boolean sudahMenikah = false;
        String alamat = "Jl. Sukaasih IV No. 45A";

        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur + " tahun");
        System.out.println("Tinggi Badan = " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin = " + jenisKelamin);
        System.out.println("Sudah Menikah = " + sudahMenikah);
        System.out.println("Alamat = " + alamat);

        System.out.println("====NO 2===="); // NO 2
        String name = "Fadhil";
        String namaBalik = new StringBuilder(name).reverse().toString();

        System.out.println("Nama asli: " + name);
        System.out.println("Nama setelah dibalik: " + namaBalik);

        System.out.println("====NO 3===="); // NO 3
        String[] teman = {"Adam", "Ichsan", "Jauhari", "Rio", "Rivaldi"};

        System.out.println("Nama teman pada indeks ke-3: " + teman[3]);

        System.out.println("====NO 4====");// NO 4
        int angkaInt = 125;
        double angkaDouble = (double) angkaInt;

        double angkaDouble2 = 55.75;
        int angkaInt2 = (int) angkaDouble2;

        System.out.println("Konversi int ke double: " + angkaDouble);
        System.out.println("Konversi double ke int: " + angkaInt2);
    }
}
