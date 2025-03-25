package Revi.Belajar_Java_Dasar;

class Account {
    private String nama;
    private String nomorRekening;
    private double saldo;

    public Account(String nama, String nomorRekening, double saldo) {
        this.nama = nama;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}



