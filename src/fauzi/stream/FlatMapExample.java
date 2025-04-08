package fauzi.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> names = List.of(
                List.of("ikam", "valdi"),
                List.of("farhan", "David"),
                List.of("uye")
        );

        List<List<Integer>> numbers = List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(7,8,9)
        );

        List<String> flatNames = names.stream()
                .flatMap(List::stream) // Menggabungkan List<List<String>> menjadi List<String>
                .collect(Collectors.toList());

        List<Integer> flatMapNumbers = numbers.stream()
                .flatMap(Collection::stream) // Menggabungkan List<List<Integer>> menjadi List<Integer>
                .collect(Collectors.toList());

        System.out.println("before : " + names);
        System.out.println("after flatmap : " + flatNames);
        System.out.println("before : " + numbers);
        System.out.println("after flatmap : " + flatMapNumbers);
    }
}
