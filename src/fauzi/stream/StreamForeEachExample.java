package fauzi.stream;

import java.util.Arrays;
import java.util.List;

public class StreamForeEachExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream().forEach(number -> System.out.println(number));
    }
}
