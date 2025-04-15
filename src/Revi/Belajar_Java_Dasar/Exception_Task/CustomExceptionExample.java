package Revi.Belajar_Java_Dasar.Exception_Task;

public class CustomExceptionExample {

    public static void cekNomor(int nomor) throws InvalidJerseyNumberException {
        if (nomor < 1 || nomor > 99) {
            throw new InvalidJerseyNumberException("Nomor tidak valid: " + nomor);
        }
        System.out.println("Nomor valid: " + nomor);
    }

    public static void main(String[] args) {
        try {
            cekNomor(10);   // valid
            cekNomor(0);    // tidak valid
        } catch (InvalidJerseyNumberException e) {
            System.out.println("Exception tertangkap: " + e.getMessage());
        }
    }
}