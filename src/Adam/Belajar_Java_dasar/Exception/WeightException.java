package Adam.Belajar_Java_dasar.Exception;

public class WeightException extends Exception{
    public WeightException(String message) {
        super(message);
    }
}

class WeightExceptionCustom {
    public static void main(String[] args) {
        try {
            validateWeight(22);
        } catch (WeightException e) {
            System.out.println("warning : " + e.getMessage());
        } finally {
            System.out.println("adjust!");
        }

    }

    public static void validateWeight (int weight) throws WeightException {
        if (weight > 20) {
            throw new WeightException("weight is not appropriate");
        }
    }
}