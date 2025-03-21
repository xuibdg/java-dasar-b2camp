package rafie.belajar_java_dasar;

import java.util.Scanner;

//1. buatkan program Java yang meminta pengguna memasukkan nilai ujian (0-100). Program harus menampilkan kategori nilai berdasarkan skema berikut:
//gunakan scanner agar nilai dapat di input
//
//A untuk nilai ≥ 85
//B untuk nilai 70 - 84
//C untuk nilai 55 - 69
//D untuk nilai 40 - 54
//E untuk nilai < 40

//source: https://www.petanikode.com/java-input-output/

//public class Task19March {
//    public static void main(String[] args) {
//
//        Scanner scannerInputan = new Scanner(System.in);
//
//        System.out.println("Silahkan masukkan nama Anda: ");
//        String inputanNama = scannerInputan.nextLine();
//
//        System.out.println("Silahkan masukkan angka (0-100): ");
//        int inputan = scannerInputan.nextInt();
//
//        if (inputan >= 85) {
//            System.out.println("Selamat, nilai " + inputanNama + " A!");
//        } else if (inputan >=70 || inputan == 84) {
//            System.out.println("Selamat, nilai " + inputanNama + " B!");
//        } else if (inputan >= 55 || inputan == 69) {
//            System.out.println("Selamat, nilai " + inputanNama + " C!");
//        } else if (inputan >= 40 || inputan == 54) {
//            System.out.println("Selamat, nilai " + inputanNama +  " D!");
//        } else {
//            System.out.println("Selamat, nilai " + inputanNama +  " E!");
//        }
//    }
//}


//2. Buat program yang meminta input usia dan menentukan kategorinya menggunakan ternary operator bertingkat dengan ketentuan:
//gunakan scanner agar usia dapat di input
// TEMPLATE AWAL TERNARY OPERATOR: variable = (condition) ? expression_if_true : expression_if_false;
//Anak-anak jika usia < 13
//Remaja jika usia 13 - 17
//Dewasa jika usia 18 - 59
//Lansia jika usia ≥ 60

//source: https://www.google.com/search?q=ternary+operator+pada+java&oq=ter&gs_lcrp=EgRlZGdlKgkIABBFGDsY-QcyCQgAEEUYOxj5BzINCAEQABiDARixAxiABDIPCAIQRRg5GIMBGLEDGIAEMgoIAxAAGLEDGIAEMgcIBBAAGIAEMgYIBRBFGDwyBggGEEUYPTIGCAcQRRg8MgYICBBFGD3SAQgxNzI5ajBqOagCALACAQ&sourceid=chrome&ie=UTF-8

//public class Task19March {
//    public static void main(String[] args) {
//
//        Scanner scannerInputan = new Scanner(System.in);
//
//        System.out.println("Silahkan masukkan nama Anda: ");
//        String inputanNama = scannerInputan.nextLine();
//
//        System.out.println("Silahkan masukkan umur Anda: ");
//        int inputanUmur = scannerInputan.nextInt();
//
//        String kategoriUmur = (inputanUmur < 13) ? "Anak-anak" : (inputanUmur <= 17) ? "Remaja" : (inputanUmur <= 60) ? "Dewasa" : "Lansia";
//
//        System.out.println("Kategori usia " + inputanNama + " adalah: " + kategoriUmur + " yaa.");
//
//    }
//}

//3.Buat program  yang meminta pengguna memasukkan dua angka dan operator matematika (+, -, *, /, %). Gunakan switch-case untuk melakukan operasi yang sesuai dan menampilkan hasilnya. Jika operator yang dimasukkan tidak valid, tampilkan pesan error.
//        (Gunakan Scanner untuk menerima input dari pengguna.)
//Contoh output:
//Masukkan angka pertama: 10
//Masukkan operator (+, -, *, /, %): *
//Masukkan angka kedua: 5
//Hasil: 10 * 5 = 50

//source: https://www.w3schools.com/java/ref_string_charat.asp

public class Task19March {
    public static void main(String[] args) {

        Scanner scannerInputan = new Scanner(System.in);

        System.out.println("Silahkan masukkan angka pertama Anda: ");
        int inputanAngkaPertama = scannerInputan.nextInt();

        System.out.println("Silahkan masukkan operator pilihan Anda (+, -, *, /, %): ");
        char inputanOperator = scannerInputan.next().charAt(0);

        System.out.println("Silahkan masukkan angka kedua Anda: ");
        int inputanAngkaKedua = scannerInputan.nextInt();

        switch (inputanOperator) {
            case '+':
                System.out.println("Hasil penjumlahan dari " + inputanAngkaPertama + " ditambah dengan " + inputanAngkaKedua + " adalah " + (inputanAngkaPertama + inputanAngkaKedua));
                break;
            case '-':
                System.out.println("Hasil pengurangan dari " + inputanAngkaPertama + " dikurang dengan " + inputanAngkaKedua + " adalah " + (inputanAngkaPertama - inputanAngkaKedua));
                break;
            case '*':
                System.out.println("Hasil perkalian dari " + inputanAngkaPertama + " dikali dengan " + inputanAngkaKedua + " adalah " + (inputanAngkaPertama * inputanAngkaKedua));
                break;
            case '/':
                System.out.println("Hasil pembagian dari " + inputanAngkaPertama + " dibagi dengan " + inputanAngkaKedua + " adalah " + (inputanAngkaPertama / inputanAngkaKedua));
                break;
            case '%':
                System.out.println("Hasil modulus dari " + inputanAngkaPertama + " dengan " + inputanAngkaKedua + " adalah " + (inputanAngkaPertama % inputanAngkaKedua));
                break;
            default:
                System.out.println("Operator tidak valid! Cek kembali operator yang tersedia (+, -, *, /, %) ");
        }
    }
}