package rafie.belajar_java_dasar.Task_15_April_2025;

public class ConcurrencyPlayground {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread (() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tugas pertama: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Tugas kedua: " + i);
            }
        });

        thread2.start();
        thread1.start();

        thread1.join();
        thread2.join();
    }
}
