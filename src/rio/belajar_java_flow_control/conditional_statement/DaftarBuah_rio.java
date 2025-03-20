package rio.belajar_java_flow_control.conditional_statement;

import java.util.ArrayList;
// 2. Buatlah program yang menyimpan daftar nama buah dalam ArrayList
// lalu mencetak semua elemen di dalamnya
public class DaftarBuah_rio {
    public static void main(String[] args) {
        ArrayList<String> buahList = new ArrayList<>();
        //sebuah wadah/tempat untuk menyimpan data yg berupa teks/string
        //dgn akses elemen yg dinamis (bisa bertambah atau dikurngi)

        buahList.add("Anggur");
        buahList.add("Apel");
        buahList.add("Pisang");
        buahList.add("Semangka");
        buahList.add("Mangga");
        buahList.add("Jeruk");
        buahList.remove("Semangka");

        System.out.println("Daftar buah-buahan:");
        for (String buah : buahList) {
            System.out.println(buah);
        }
    }
}
