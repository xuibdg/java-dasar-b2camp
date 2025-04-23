package Valdi.Belajar_Java_Dasar.trySolid;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
        new Employee(1,"valdi",3000000),
        new Employee(2,"aldo",2000000),
        new Employee(3,"ando",2500000),
        new Employee(4,"naufal",1800000),
        new Employee(5,"riki",2800000)
        );

        TotalSalaryCalculator all = new TotalSalaryCalculator();
        all.printAll(employees);

        TotalSalaryCalculator total = new TotalSalaryCalculator();
        total.printTotal(employees);

        HighestSalary high = new HighestSalary();
        high.printHigh(employees);

        LowestSalary low = new LowestSalary();
       low.printLow(employees);

        TotalSalaryCalculator highSalary = new TotalSalaryCalculator();
        highSalary.printHighSalary(employees);
    }
}
