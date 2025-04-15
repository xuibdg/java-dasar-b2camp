package Revi.Belajar_Java_Dasar.Exception_Task;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            Pemain pemain1 = new Pemain("Cristiano Ronaldo", 7);
            pemain1.tampilkanInfo();

            System.out.println("pemain dengan nomor tidak sah:");
            Pemain pemain2 = new Pemain("Pemain Misterius", 123); // Akan melempar exception

        } catch (InvalidJerseyNumberException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("program selesai di run (blok finally).");
        }
    }
}