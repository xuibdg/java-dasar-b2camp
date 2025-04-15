package Fadhil.Belajar_Java_dasar.Tugas_Discuss;

public class Account {
    // Field
    private String nama;
    private String norek;
    private double saldo;

    public Account(String nama, String norek, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.saldo = saldo;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNorek() {
        return norek;
    }

    public void setNorek(String norek) {
        this.norek = norek;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
