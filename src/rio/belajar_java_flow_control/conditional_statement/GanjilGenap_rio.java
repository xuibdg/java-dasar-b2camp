package rio.belajar_java_flow_control.conditional_statement;
import java.util.Scanner;
//1. Buatlah program yang mencetak angka ganjil dan genap
// masing-masing di baris baru. gunakan scanner

public class GanjilGenap_rio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int batas = scanner.nextInt();

        //angka genap
        System.out.println("Angka Genap:");
        for (int i = 0; i <= batas; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //angka ganjil
        System.out.println("Angka Ganjil:");
        for (int i = 0; i <= batas; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
