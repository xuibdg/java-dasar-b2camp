package rafie.belajar_java_dasar.Task_26_March_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskReduce {
    public static void main(String[] args) {
        String name = "Adam";
        int age = 23;
        int rateEachDay = 10;
//        int rateUSD = 10;
//        int sumSallary = rateUSD + 10;

//        for (int i = 0; i <= 30; i++) {
//            System.out.println("Hari ke- " + i + " gaji " + name + " dengan umur " + age + " bergaji per harinya adalah: " + sumSallary);
//        }

        List<Integer> daftarHari = new ArrayList<>();
        for (int i = 1; i <= 30 ; i++) {
            daftarHari.add(i);
            System.out.println("Daftar hari ke - " + i + " mendapatkan gaji: " + rateEachDay + " $");
        }
    }
}
