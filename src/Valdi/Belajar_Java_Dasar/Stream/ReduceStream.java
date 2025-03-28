package Valdi.Belajar_Java_Dasar.Stream;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        int number = numbers.stream()
//                .reduce(1,( c, d) -> c * d);
//        System.out.println(number);

        int a = 10;
        Integer b = 0;
        for (int i = 1; i <= 30 ; i++) {
            b = a + b;
            System.out.println(b);
        }


//        String Name = "Valdi";
//        Integer Age = 20;
//        Integer Rate;
//
//        List<Integer> rates = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
//        int rate = rates.stream()
//                .reduce(10,( a, b) -> a + b);
//        System.out.println(rate);
    }
}
