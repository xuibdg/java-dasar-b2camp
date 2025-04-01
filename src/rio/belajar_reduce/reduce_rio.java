package rio.belajar_reduce;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class reduce_rio {
    public static void main(String[] args) {

        int a = 10;
        Integer b = 0;
        for (int i = 1; i <= 30; i++) {
            b = a + b;
            System.out.println(b);
        }
    }
}