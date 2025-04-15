package jauhari.belajar_java_dasar.Task14April2025_Exception;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UnmetReqirementsException extends Exception {
    public UnmetReqirementsException(String warning) {super(warning);}
}

class PurchasingRequirements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Input DP amount (example: 100000) : ");
            int DP = scanner.nextInt();
            System.out.println("Input Date of flight, format YYYYMMDD : ");
            LocalDate flightDate = LocalDate.ofEpochDay(scanner.nextInt());
            System.out.println("Input Date of Expired Passport, format YYYYMMDD : ");
            LocalDate expiredPaspor = LocalDate.ofEpochDay(scanner.nextInt());
            long difference = ChronoUnit.MONTHS.between(flightDate,expiredPaspor);
            Requirements(difference, flightDate, expiredPaspor, DP);

        } catch (UnmetReqirementsException e) {
            System.out.println("warning : " + e.getMessage());
        } finally {
            System.out.println("End of checking");
        }
    }

    private static void Requirements(long difference, LocalDate flightDate, LocalDate expiredPaspor, double DP) throws UnmetReqirementsException {
        if (difference < 6) {
            throw new UnmetReqirementsException("Passport less than 6 months, cannot purchasing the flight ticket! ");
        }if (DP < 500000)
            throw new UnmetReqirementsException("Insufficient DP");
    }
}


