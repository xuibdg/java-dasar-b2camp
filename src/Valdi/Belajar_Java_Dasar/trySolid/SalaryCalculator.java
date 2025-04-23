package Valdi.Belajar_Java_Dasar.trySolid;

import java.util.List;

public interface SalaryCalculator {
    double calculate(List<Employee> employees);
    String getCalculationType();
}
