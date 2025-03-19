package fauzi.belajar_java_dasar;

import java.math.BigDecimal;

public class Mobil {

    //field -> variable di luar method yang belur di declar
     String merk;
     String warna;
     int tahun;
     int stock = 100; //variable instance
     static String dealer ; //variable instance

     //method -> fungsi atau proses tujuan
    public void tampilkanInfoMobil(){
        BigDecimal harga = BigDecimal.valueOf(250000000); //local variable

        System.out.println("mobil : " + merk);
        System.out.println("warna : " + warna);
        System.out.println("tahun : " + tahun);
        System.out.println("stock : " + stock);
        System.out.println("harga : " + harga);
        System.out.println("dealer : " + dealer);
    }


    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.merk = "toyota";
        mobil.warna = "merah";
        mobil.tahun = 2025;

        Mobil.dealer = "denzi dealer";
        mobil.tampilkanInfoMobil();
    }




}
