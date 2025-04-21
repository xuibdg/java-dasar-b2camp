package hirlan.summary_task;

import java.util.*;
import java.util.stream.Collectors;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> student = Arrays.asList(
                new Student("001","Citra",90),
                new Student("002","Alya",82),
                new Student("003","Eka",88),
                new Student("004","Deni",74),
                new Student("005","Budi",65));

        System.out.println("Mahasiswa dengan nilai diatas 75 : ");
        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();


        List<Student> desc = student.stream()
                .sorted(Comparator.comparingInt(Student::getNilai).reversed())
                .collect(Collectors.toList());

        int nilaiMax = student.stream()
                .mapToInt(Student::getNilai)
                .max().orElseThrow();

        Student student1 = student.stream()
                .max(Comparator.comparingInt(Student::getNilai))
                .orElseThrow();

        System.out.println("Mahasiswa dengan nilai diatas 75 : ");
        for (Student d : desc){
            if (d.getNilai()>75){
                System.out.println(d);
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Nilai Mahasiswa yang paling besar adalah : "+student1+"\n"+"Dengan angka : "+nilaiMax);
        System.out.println("-------------------------------------");
        System.out.println("Mengurutkan dari yang terbesar :");
        System.out.println(desc);


        List<Student> asc = student.stream()
                .sorted(Comparator.comparingInt(Student::getNilai))
                .collect(Collectors.toList());
        System.out.println("Mengurutkan dari yang terkecil :");
        System.out.println(asc);


    }

    }

