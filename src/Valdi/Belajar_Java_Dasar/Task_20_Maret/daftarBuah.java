package Valdi.Belajar_Java_Dasar.Task_20_Maret;

import java.util.ArrayList;

//Buatlah program yang menyimpan daftar nama buah dalam ArrayList, lalu mencetak semua elemen di dalamnya.

public class daftarBuah {
    public static void main(String[] args) {
        ArrayList<String> buahList = new ArrayList<>();
        //menandakan buahList itu daftar ArrayList yang menyimpan nilai String
        //"new ArrayList<>()" membuat nilai baru di buahlist

        buahList.add("Mangga");
        buahList.add("Apel");
        buahList.add("Anggur");
        buahList.add("Alpukat");
        buahList.add("Duren");
        buahList.add("Stroberi");
        buahList.add("Mengkudu");
        buahList.add("Jeruk");
        buahList.add("Dukuh");
        buahList.add("Nangka");
        //fungsi "add" untuk menambahkan isi didalamnya ke buahList

        buahList.remove("Duren");
//nama buah tadi coba hapus salah satu nama buah nyaa

        System.out.println("Daftar Nama Buah-Buahan:");
        for (String buah : buahList) {
            System.out.println(" - " + buah);
            //menggunakan loop for gunanya untuk mengambil setiap isi didalam buahList dan menampilkannya
        }
    }
}
