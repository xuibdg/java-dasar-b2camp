package Ichsan.belajar_java_Dasar.oop;

//NO.1Menggunakan Encapsulation untuk menjaga keamanan data
// agar tidak bisa diubah langsung dari luar kelas.

public class Account_I {

    //Menggunakan Encapsulation untuk menjaga keamanan data
    // agar tidak bisa diubah langsung dari luar kelas.

   private String nama;
    private String  norek;
    private double saldo;

//constuktor untuk menginisialkan objek

    public Account_I(String nama,String norek,double saldo){
        this.nama=nama;
        this.norek=norek;
        this.saldo=saldo;

        //getter untuk menggambil nilai dari atibut private
    }
    public String getNama(){
        return nama;
    }
    public String getNorek(){
        return norek;
    }
    public double getSaldo(){
        return saldo;
    }
    //setter untuk mengubah saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

