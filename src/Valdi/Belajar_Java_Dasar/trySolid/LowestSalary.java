package Valdi.Belajar_Java_Dasar.trySolid;

import java.util.List;

public class LowestSalary {
    public Employee find(List<Employee> employees) {
        return employees.stream()
                .min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);
    }

    public void printLow(List<Employee> employees) {
        Employee lowest = find(employees);
        System.out.println("Karyawan dengan Gaji terkecil : " + "| ID : " +lowest.getId() + " | Nama : " + lowest.getName() + " | Gaji : Rp." + lowest.getSalary());
    }
}
