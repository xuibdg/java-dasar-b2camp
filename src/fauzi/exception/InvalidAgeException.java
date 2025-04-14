package fauzi.exception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validateUmur(15);
        } catch (InvalidAgeException e) {
            System.out.println("kesalahan: " + e.getMessage());
        }
    }

    public static void validateUmur(int umur) throws InvalidAgeException {
        if (umur < 18) {
            throw new InvalidAgeException("umur harus lebih dari 18 tahun");
        }
    }
}


