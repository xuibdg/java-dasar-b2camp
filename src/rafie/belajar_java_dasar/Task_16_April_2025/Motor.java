package rafie.belajar_java_dasar.Task_16_April_2025;

import java.util.concurrent.Semaphore;

public class Motor extends Thread {
    private static final int max_motors = 3;
    private final Semaphore semaphore = new Semaphore(2);
    private int runningMotors = 0;
    private static int totalMotors = 0;
    private final Object locks = new Object();
    private final String motorUser;

    public Motor(String name) {
        this.motorUser = name;
    }

    public static int getTotalMotors() {
        return totalMotors;
    }

    public void run() {
        try {
            synchronized (locks) {
                if (runningMotors >= max_motors) {
                    throw new Exception("Jumlah motor yang menyala sudah maks!");
                }
                runningMotors++;
                totalMotors++;
            }
            semaphore.acquire();

            System.out.println(motorUser + " kontak nyala");
            Thread.sleep(300);
            System.out.println(motorUser + " mesin nyala");
            Thread.sleep(300);

            synchronized (locks) {
                System.out.println(motorUser + " adalah motor ke-" + getTotalMotors() + " yang sedang touring");
            }

            Thread.sleep(2600);
            System.out.println(motorUser + " lagi gas ke Lembang");

        } catch (Exception e) {
            System.out.println("Motor " + motorUser + " mengalami trouble: " + e.getMessage());
        } finally {
            semaphore.release();
            synchronized (locks) {
                if (runningMotors > 0) {
                    runningMotors--;
                }
            }
        }
    }
}