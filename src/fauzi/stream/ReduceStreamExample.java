package fauzi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ReduceStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("1","2","3","4");
        String reduce = names.stream()
                .reduce("1", (a, b) -> a + b);
        System.out.println(reduce);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int sum = numbers.parallelStream()
                .reduce(1, (a,b) -> a * b + a / b );
        System.out.println(sum);

        int a = 10;
        Integer b = 0;
        for (int i = 0; i < 30; i++) {
            b  = b + (b + a);
        }
        System.out.println(b);

    }
}
