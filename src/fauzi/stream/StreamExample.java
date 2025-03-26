package fauzi.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("adam", "hari", "valdi", "ntun", "oyah", "ema");
        List<String> proceedNames = names.stream()
                .filter(name -> name.length() > 4)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(proceedNames);
        System.out.println(names);

        Map<String, Integer> map = new HashMap<>();
        map.put("valdi", 5);
        map.put("ikam", 3);
        map.put("hari", 2);
        map.forEach((key, value) -> value =value* 2);


        System.out.println("_______________________");
        Map<String, Integer> mapStream = map.entrySet().stream()
                .map(data -> {
                    data.setValue(data.getValue() * 2);
                    data.getKey().toUpperCase();
                    return data;
                }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(mapStream);


    }
}
