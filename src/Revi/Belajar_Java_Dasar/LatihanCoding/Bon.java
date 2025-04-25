package Revi.Belajar_Java_Dasar.LatihanCoding;

public class Bon {
    public void print (Mainan mainan, double totalBayar) {
        System.out.println("StrukPembelian : " + mainan.getId());
        System.out.println("Nama Mainan : " + mainan.getName());
        System.out.println("Harga : " + mainan.getPrice());
        System.out.println("Total Bayar : " + totalBayar);
    }
}
