package Valdi.Belajar_Java_Dasar.Task_18_Maret;

public class Nama {
    public static void main(String[] args) {
        String Nama = "VALDI"; //variabel tipe string yang dalamnya VALDI
        String Balik = new StringBuilder(Nama).reverse().toString();
        //"new StringBuilder(Nama)" fungsinya untuk membuat objek stringbuilder dari string valdi
        //"reverse()" untuk membalikkan karakter
        //".toString()" untuk mengubah objek StringBuilder jadi String biar bisa disimpan di reversed

        System.out.println("Nama Asli : " + Nama);
        System.out.println("Nama Balik : " + Balik);
    }
}
