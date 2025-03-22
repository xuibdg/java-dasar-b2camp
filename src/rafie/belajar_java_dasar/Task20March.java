package rafie.belajar_java_dasar;

//1. Buatlah program yang mencetak angka ganjil dan genap, masing-masing di baris baru. gunakan scanner
//Contoh:
//Masukan angka:10
//Angka ganjil : [1,3,5,7,9]
//Angka genap : [2,4,6,8,10]
//2. Buatlah program yang menyimpan daftar nama buah dalam ArrayList, lalu mencetak semua elemen di dalamnya.
//3. nama buah tadi coba hapus salah satu nama buah nyaa
//4. Buatlah program yang menyimpan beberapa angka dalam LinkedList, lalu mencetak elemen pertama dan terakhir dari daftar tersebut.


//1. Buatlah program yang mencetak angka ganjil dan genap, masing-masing di baris baru. gunakan scanner
//Contoh:
//Masukan angka:10
//Angka ganjil : [1,3,5,7,9]
//Angka genap : [2,4,6,8,10]✅
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task20March {
    public static void main(String[] args) {

        Scanner scannerInputan = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int inputanAngka = scannerInputan.nextInt();

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i < inputanAngka; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }

        System.out.println("Angka ganjil: " + oddNumbers);
        System.out.println("Angka genap: " + evenNumbers);
    }
}

//2. Buatlah program yang menyimpan daftar nama buah dalam ArrayList, lalu mencetak semua elemen di dalamnya.✅
//3. nama buah tadi coba hapus salah satu nama buah nyaa✅
//public class Task20March {
//    public static void main(String[] args) {
//
//        Scanner scannerInputan = new Scanner(System.in);
//
//        System.out.print("Masukkan nama Anda: ");
//        String inputanNama = scannerInputan.nextLine();
//
//        ArrayList<String> buahBuahAn = new ArrayList<>();
//
//        buahBuahAn.add("Jeruk");
//        buahBuahAn.add("Durian");
//        buahBuahAn.add("Apel");
//        buahBuahAn.add("Pisang");
//        buahBuahAn.add("Kelengkeng");
//        buahBuahAn.add("Delima");
//        buahBuahAn.add("Jeruk Bali");
//        buahBuahAn.remove("Pisang");
//
//        System.out.println("Buah-Buahan " + inputanNama + " adalah " + buahBuahAn);
//    }
//}

//4. Buatlah program yang menyimpan beberapa angka dalam LinkedList, lalu mencetak elemen pertama dan terakhir dari daftar tersebut. ✅
//public class Task20March {
//    public static void main(String[] args) {
//
//        LinkedList<Integer> simpanAngka = new LinkedList<>();
//
//        simpanAngka.add(1);
//        simpanAngka.addLast(2);
//        simpanAngka.addFirst(4);
//        simpanAngka.add(1,3);
//
//        System.out.println("Angka pertama: " + simpanAngka.getFirst());
//        System.out.println("Angka terakhir: " + simpanAngka.getLast());
//    }
//}