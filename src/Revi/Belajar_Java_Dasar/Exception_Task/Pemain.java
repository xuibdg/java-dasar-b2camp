package Revi.Belajar_Java_Dasar.Exception_Task;

public class Pemain {
    private String nama;
    private int nomor;

    public Pemain(String nama, int nomor) throws InvalidJerseyNumberException {
        this.nama = nama;
        setNomor(nomor);
    }

    public void setNomor(int nomor) throws InvalidJerseyNumberException {
        if (nomor < 1 || nomor > 99) {
            throw new InvalidJerseyNumberException("Nomor punggung harus antara 1 dan 99. Diberikan: " + nomor);
        }
        this.nomor = nomor;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pemain     : " + nama);
        System.out.println("Nomor Punggung  : " + nomor);
    }
}