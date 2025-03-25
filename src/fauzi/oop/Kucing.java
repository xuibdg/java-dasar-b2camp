package fauzi.oop;

public class Kucing extends Hewan {

    Kucing(String nama){
        super.nama = nama;
    }

    public void suara() {
        super.suara();
        System.out.println("suara kucing yang bernama :" + nama);
    }
}
