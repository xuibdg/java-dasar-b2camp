package fauzi.oop;

public class Anjing extends Hewan{

    //kontruktor
//    Anjing(String nama){
//        super.nama = nama;
//    }


    @Override
    public void suara() {
        super.suara();
        System.out.println("suara anjing yang bernama :" + nama);
    }

}
