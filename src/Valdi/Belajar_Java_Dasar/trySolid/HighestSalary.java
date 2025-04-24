package Valdi.Belajar_Java_Dasar.trySolid;

import java.util.List;

public class HighestSalary {
    public Employee find(List<Employee> employees){
        return employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);
    }

    public void printHigh (List<Employee> employees) {
        Employee  highest = find(employees);
        System.out.println("\nKaryawan dengan Gaji tertinggi :" + "| ID : " + highest.getId() + " | Nama : " + highest.getName() + " | Gaji : Rp." + highest.getSalary());
    }
}
