package Valdi.Belajar_Java_Dasar.employee;

import java.util.ArrayList;
import java.util.List;

public class DataEmployee {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Andi",5000000));
        list.add(new Employee(2,"Budi",6000000));
        list.add(new Employee(3,"Citra",4500000));
        list.add(new Employee(4,"Deni",5500000));
        list.add(new Employee(5,"Eka",7000000));
        return list;
    }
}
