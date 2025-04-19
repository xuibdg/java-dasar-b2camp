package rafie.belajar_java_dasar.Task_24_March_2025;

// Di account gaada psvm, hanya ada attribute (nama, no rek, dan saldo).

public class Account{

    String nama;
    int noRek;
    int saldo;

    public Account(String nama, int noRek, int saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = saldo;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

//    public int getNoRek(){
//        return noRek;
//    }
//
//    public void setNoRek(int noRek){
//        this.noRek = noRek;
//    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

// Method showDetails taruh di Transaction.java atau InternalTransfer.java
    public void showDetails() {
        System.out.print("Nama: " + nama + " No Rek: " + noRek + " Saldo: " + saldo + " Rp ");
    }

}
