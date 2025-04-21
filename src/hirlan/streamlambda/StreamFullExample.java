package hirlan.streamlambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamFullExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("eman","otang", "acep", "daseng", "nggeng");

        // Stream Pipeline
        List<String> result = names.stream()
                .map(String::toUpperCase) // Transformation: Mengubah ke huruf besar
                .distinct() // Filtering: Menghapus duplikat
                .sorted() // Ordering: Mengurutkan sesuai abjad
                .limit(3) // Retrieving: Mengambil 3 data pertama
                .collect(Collectors.toList()); // Terminal: Mengubah ke List
        System.out.println(result);

        //Filtering Operation
        List<Integer> numbers = Arrays.asList(10, 25, 30, 40, 50, 30, 70, 80);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 30) // Mengambil angka > 30
                .distinct() // Menghapus duplikat
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);

        //Retrieving Operations
        List<Integer> limitedNumbers = numbers.stream()
                .skip(2) // Menghiraukan 2 data pertama
                .limit(2) // Mengambil 2 data setelah skip
                .collect(Collectors.toList());
        System.out.println(limitedNumbers);

        //Retrieving Single Element
        Optional<Integer> firstNumber = numbers.stream()
                .findFirst(); // Mengambil elemen pertama
        Optional<Integer> anyNumber = numbers.stream()
                .findAny(); // Mengambil elemen secara acak
        System.out.println("First: " + firstNumber.orElse(-1));
        System.out.println("Any: " + anyNumber.orElse(-1));

        //Ordering Operation
        List<String> words = Arrays.asList("banana", "apple", "cherry");
        List<String> sortedWords = words.stream()
                .sorted() // Mengurutkan berdasarkan abjad
                .collect(Collectors.toList());
        System.out.println(sortedWords); // Output: [apple, banana, cherry]
        List<String> sortedByLength = words.stream()
                .sorted(Comparator.comparing(String::length)) // Mengurutkan berdasarkan panjang string
                .collect(Collectors.toList());
        System.out.println(sortedByLength);

        //Aggregate Operations
        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50);
        long count = numbers2.stream().count();
        Optional<Integer> max = numbers2.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers2.stream().min(Integer::compareTo);

        System.out.println("Count: " + count);
        System.out.println("Max: " + max.orElse(-1));
        System.out.println("Min: " + min.orElse(-1));

        //Manual Aggregate menggunakan reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Menjumlahkan semua angka
        System.out.println("Sum: " + sum);

        //Check Operation
        boolean anyAbove40 = numbers.stream().anyMatch(n -> n > 40);
        boolean allAbove10 = numbers.stream().allMatch(n -> n >= 10);
        boolean noneBelow10 = numbers.stream().noneMatch(n -> n < 10);
        System.out.println(anyAbove40); // true
        System.out.println(allAbove10); // true
        System.out.println(noneBelow10); // true

        //For Each & Peek
        System.out.println("--------------------------------For Each & Peek");
        numbers.stream()
                .peek(n -> System.out.println("Before: " + n)) // Tidak menjalankan terminal operation
                .map(n -> n * 2)
                .forEach(n -> System.out.println("After: " + n)); // Terminal operation

        //Primitive Stream
        System.out.println("--------------------------------Primitive Stream");
        IntStream.range(1, 5).forEach(System.out::println); // Output: 1 2 3 4


        //Collect Operation
        System.out.println("--------------------------------Collect Operation");
        Set<String> nameSet = names.stream()
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(nameSet);

        //Mengonversi Stream ke Map
        System.out.println("--------------------------------Mengonversi Stream ke Map");
        Map<String, Integer> nameLengthMap = names.stream()
                .distinct()
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(nameLengthMap);

        // Grouping
        System.out.println("--------------------------------Grouping");
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);

        // Partitioning
        System.out.println("--------------------------------Partitioning");
        Map<Boolean, List<String>> partitioned = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 3));
        System.out.println(partitioned);

        //Parallel Stream
        System.out.println("--------------------------------Parallel Stream");
        numbers.parallelStream()
                .forEach(System.out::println); // Proses berjalan secara paralel

    }
}
