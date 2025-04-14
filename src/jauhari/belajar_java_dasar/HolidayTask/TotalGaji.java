package jauhari.belajar_java_dasar.HolidayTask;

import java.util.*;

public class TotalGaji {
    public static void main(String[] args) {
        String name;
        int age, hariPertama, hariTerakhir, rate, rateAwal, rateAkhir, total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hari pertama = ");
        hariPertama = scanner.nextInt();
        System.out.print("Hari terakhir = ");
        hariTerakhir = scanner.nextInt();

        rate = 10;
        total = 0;
  //      total = hariPertama * rate;
        while (hariPertama <= hariTerakhir){
            total = total + (hariPertama * rate);
            System.out.println("ditambah " + hariPertama + "menjadi " + total);
            hariPertama++;

 //       for(rateAwal = 0; rateAwal <= 30;  total = total + rateAwal * 10); rateAwal++;){
   //         System.out.println("Total gaji hari ke- " + rateAwal);
        }



    }
}
