package Ichsan.belajar_java_Dasar;
//NO.2 Buatlah program yang menyimpan daftar nama buah dalam ArrayList
//lalu mencetak semua elemen di dalamnya

import java.util.ArrayList;

public class ArrayBuah_task_2dan3 {
    public static void main(String[] args) {
        ArrayList<String> Buah_Buahan=new ArrayList<>();
        Buah_Buahan.add("Anggur");
        Buah_Buahan.add("Jeruk");
        Buah_Buahan.add("Semangka");
        Buah_Buahan.add("Melon");
        Buah_Buahan.add("Apel");

       // 3.nama buah tadi coba hapus salah satu nama buah nyaa

        Buah_Buahan.remove("Melon");
        System.out.println(Buah_Buahan);
    }
}