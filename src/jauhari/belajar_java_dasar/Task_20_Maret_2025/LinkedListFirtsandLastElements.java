package jauhari.belajar_java_dasar.Task_20_Maret_2025;

import java.util.LinkedList;

public class LinkedListFirtsandLastElements {
    public static void main(String[] args) {
        System.out.println("Urutan Nomor Finish Atlet Marathon");

        LinkedList<Integer> nomorPunggung = new LinkedList<>();
        nomorPunggung.add(10);
        nomorPunggung.add(25);
        nomorPunggung.add(33);
        nomorPunggung.add(45);
        nomorPunggung.add(76);
        nomorPunggung.add(22);
        nomorPunggung.add(12);
        nomorPunggung.add(6);
        nomorPunggung.add(1);
        System.out.println("Urutan pertama: " + nomorPunggung.get(0));
        System.out.println("Urutan terakhir: " + nomorPunggung.getLast());

    }
}
