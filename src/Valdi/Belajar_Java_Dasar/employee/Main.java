package Valdi.Belajar_Java_Dasar.employee;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = DataEmployee.getEmployees();

        try {
            System.out.println("Daftar Nama karyawan dan gaji :");
            for (Employee emp : employees) {
                printEmployeeInfo(emp);
            }

            double totalSalary = employees.stream()
                    .mapToDouble(Employee::getSalary)
                    .sum();
            System.out.println(String.format("\nTotal gaji semua karyawan : Rp%.1f", totalSalary));

            Employee high = employees.stream()
                    .max(Comparator.comparingDouble(Employee::getSalary))
                    .orElseThrow(() -> new Exception("Tidak ada karyawan."));
            System.out.println("\nKaryawan dengan gaji tertinggi :");
            printEmployeeInfo(high);

            Employee low = employees.stream()
                    .min(Comparator.comparingDouble(Employee::getSalary))
                    .orElseThrow(() -> new Exception("Tidak ada karyawan."));
            System.out.println("\nKaryawan dengan gaji terendah :");
            printEmployeeInfo(low);

            System.out.println("\nKaryawan diurutkan berdasarkan gaji (tertinggi ke terendah):");
            employees.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                    .forEach(Main::printEmployeeInfo);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("\nProgram selesai dijalankan.");
        }
    }

    private static void printEmployeeInfo(Employee e) {
        System.out.println(e.getName() + " (ID: " + e.getId() + ") - Gaji: Rp" + e.getSalary());
    }
}
