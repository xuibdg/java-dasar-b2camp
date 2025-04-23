package Revi.Belajar_Java_Dasar.SOLID;

public class StrukPembelian {
    public void print (Baju baju, double totalBayar) {
        System.out.println("Struk Pembelian : " + baju.getId());
        System.out.println("Baju : " + baju.getNama());
        System.out.println("Harga : " + baju.getHarga());
        System.out.println("Total Bayar : " + totalBayar );
    }
}
