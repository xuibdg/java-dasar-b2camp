package jauhari.belajar_java_dasar;

public class Task_18_Maret_2025 {
    public static void main(String[] args) {
        System.out.println("Task 18 Maret 2025");

        System.out.println("Task no 1 Biodata");

        String myName = "Muhammad Jauhari Ramdhani";
        int myAge = 29;
        double myHeight = 169.00;
        char mySex = 'M';
        boolean myMarriedstatus = false;
        String myAddress = "Lembursitu, Sukabumi";

        System.out.println("Name : " + "Mr " + myName);
        System.out.println("Age : " + myAge + " Years Old");
        System.out.println("Height : " + myHeight + " cm");
        System.out.println("Sex : " + mySex);
        System.out.println("Married status : " + myMarriedstatus);
        System.out.println("Address : " + myAddress);

        System.out.println("Task no 2 Balikan Nama");

        String reversedName = new StringBuilder(myName).reverse().toString();
        System.out.println("Reversed name : " + reversedName);

        System.out.println("Task no 3 Cetak Indeks Name ke - X");

        String[] myFriends = {"Adam", "Fadhil", "Valdi", "Rio", "Revie", "Iksan", "Rafie"};
        System.out.println("Teman Indeks ke 3: " + myFriends[3]);

        System.out.println("Task no 4 Konversi int ke double");
        int a = 4;
        int b = 3;
        double c = 3.70;
        int d = (int) c;
        double divide1 = a/b;
        double divide2 = (double) a/b;

        System.out.println("nilai int ke double 1 = " + divide1);
        System.out.println("nilai int ke double 2 = " + divide2);
        System.out.println("nilai double ke int = " + d);

        System.out.println("Terimakasih Coach Fauzi dan Coach Farhan!!");




    }
}
