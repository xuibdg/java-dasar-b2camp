package Valdi.Belajar_Java_Dasar.Task_24_Maret.OOP;

//1.buat class namanya account (encapsulation) ada field nama, norek, saldo

public class Account {
    private String nama;
    private String norek;
    private double saldo;
//menggunakan private agar tidak bisa diakses langsung
    //constructor
    public Account(String nama, String norek, int saldo){
        this.nama = nama;
        this.norek = norek;
        this.saldo = saldo;
    }

    //getter, setter untuk mendapatkan atau mengubah data
    //    ----------------------------------

    public String getNama(){
        return nama;
    }

//    ----------------------------------

    public String getNorek(){
        return norek;
    }

//    ----------------------------------

    public double getSaldo(){
        return saldo;
    }// cuma saldo yang menggunakan setter karna dia di ubah. kalo nama sama norek itu engga
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void informasi(){
        System.out.println("Nama : " + nama);
        System.out.println("Nomor Rekening : " + norek);
        System.out.println("Total Saldo : Rp " + saldo);
    }

}
