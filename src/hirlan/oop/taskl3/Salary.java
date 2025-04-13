package hirlan.oop.taskl3;

import hirlan.oop.Account;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Salary {
    public static void main(String[] args) {
        List<Account> salaries =
                Arrays.asList(
                new Account("Hirlan","12345",900_000));


//        // Hitung total gaji (pokok )
//        int total = salaries.stream()
//                .map(g -> g.getSaldo()*30)
//                .reduce(0, Integer::sum);
//        System.out.println(salaries);
//        System.out.println("Gaji bulan ini "+total);



        int salaryPerDay = 500_000; // Gaji tetap programmer per hari (Rp 500 ribu)

        // Hitung total gaji 30 hari (gaji perhari * 30)
        int totalSalary = IntStream.rangeClosed(1, 30)
                .reduce(0, (totals, hari) -> totals + salaryPerDay);
       // int totalSaldo = salaryPerDay+totalSalary;

        System.out.println(salaries);
        System.out.println("Gaji Harian : Rp "+salaryPerDay);
        System.out.println("Total gaji selama 30 hari: Rp " + totalSalary);


        System.out.println("---------------------------------------------");
        int gajiAwal = 400_000; // Gaji hari pertama (Rp 400 ribu)
        int kenaikanPerHari = 10_000; // Naik Rp 10 ribu per hari

        // Hitung dengan kenaikan harian: gajiAwal + (kenaikanPerHari * (hari-1))
        int totalGaji = IntStream.rangeClosed(1, 30)
                .map(hari -> gajiAwal + (kenaikanPerHari * (hari)))
                .reduce(0, Integer::sum);

        System.out.println("Total gaji 30 hari dengan kenaikan: Rp " + totalGaji);
    }
}
