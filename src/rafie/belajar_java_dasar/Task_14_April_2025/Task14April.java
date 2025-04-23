package rafie.belajar_java_dasar.Task_14_April_2025;

import java.util.Scanner;

public class Task14April extends Exception{
    public Task14April(String message) {
        super(message);
    }
}

class LicensePlateException {
    public static void main(String[] args) throws Task14April {
        System.out.println("Selamat datang di Program Cek Plat Nomor Kendaraan");
        Scanner inputanUser = new Scanner(System.in);

        try{
            System.out.print("Silahkan masukan huruf pertama plat nomor kendaraan Anda: ");
            String inputanPlat = inputanUser.next();
            validatePlat(inputanPlat);
        } catch (Task14April e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program Cek Plat Nomor Kendaraan, telah selesai.");
            inputanUser.close();

        }
    }

    public static void validatePlat(String plat) throws Task14April {
        String lowerPlat = plat.toLowerCase();
        if (lowerPlat.equals("D")) {
            throw new Task14April("Kendaraan Anda terdata di Bandung");
        } else {
            throw new Task14April("Kendaraan Anda terdata diluar Bandung");
        }
    }
}
