package jauhari.belajar_java_dasar.Task_24_Maret_2025_OOP;

public class Account {
    private String nama;
    private String noRek;
    private double saldo;

    public Account(String nama, String noRek, double saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}