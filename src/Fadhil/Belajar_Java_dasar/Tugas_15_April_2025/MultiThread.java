package Fadhil.Belajar_Java_dasar.Tugas_15_April_2025;

class MultiThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - Count: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - Count: " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
