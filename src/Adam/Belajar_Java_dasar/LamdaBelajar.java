package Adam.Belajar_Java_dasar;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LamdaBelajar {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("adam", "majid", "adi", "tama");

        AtomicInteger i = new AtomicInteger();
        names.forEach(name -> {
            System.out.println(name + " " + i.getAndIncrement());
        });

        names.forEach(name -> {
            System.out.println(name + " " + i.getAndIncrement());
        });

    }
}
