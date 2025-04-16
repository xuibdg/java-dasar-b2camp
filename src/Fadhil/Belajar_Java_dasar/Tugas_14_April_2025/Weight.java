package Fadhil.Belajar_Java_dasar.Tugas_14_April_2025;

// Custom Exception
class WeightException extends Exception {
    public WeightException(String message) {
        super(message);
    }
}

public class Weight {
    public static void cekBerat(int berat) throws WeightException {
        if (berat < 45 || berat > 100) {
            throw new WeightException("Berat badan tidak normal: " + berat + " kg");
        } else {
            System.out.println("Berat badan normal: " + berat + " kg");
        }
    }

    public static void main(String[] args) {
        int beratInput = 100;

        try {
            cekBerat(beratInput);
        } catch (WeightException e) {
            System.out.println("Warning! : " + e.getMessage());
        } finally {
            System.out.println("Complete.");
        }
    }
}
