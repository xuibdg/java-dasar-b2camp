package Valdi.Belajar_Java_Dasar.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("==========filter");
        List<Integer> number = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(number); // Output: [2, 4, 6]


        System.out.println("==========filter");
        numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());


    }
}
