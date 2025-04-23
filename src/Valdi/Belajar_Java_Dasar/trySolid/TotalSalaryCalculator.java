package Valdi.Belajar_Java_Dasar.trySolid;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;

public class TotalSalaryCalculator implements SalaryCalculator{

    @Override
    public double calculate(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    @Override
    public String getCalculationType() {
        return "Total Gaji : ";
    }

    public void printAll(List<Employee> employees) {
        System.out.println("Daftar Karyawan dan Gaji");
        employees.forEach(e -> System.out.println("ID :" + e.getId() + " | Nama :" + e.getName() + " | Gaji : Rp." +e.getSalary()));
    }

    public void printTotal(List<Employee> employees) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        System.out.println("\n" + getCalculationType() + "Rp." + formatter.format(calculate(employees)));
    }

    public void printHighSalary(List<Employee> employees) {
        System.out.println("\nDaftar Karyawan dan Gaji dari yang terbesar");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(e -> System.out.println("ID : " + e.getId() + "| Nama : " + e.getName() + " | Gaji : Rp." + e.getSalary()));
    }
}
