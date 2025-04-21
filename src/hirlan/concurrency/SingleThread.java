package hirlan.concurrency;

public class SingleThread {

    public static void main(String[] args) {
        System.out.println("tugas 1 dimulai");
        for (int i = 0; i < 5; i++) {
            System.out.println("tugas 1" + i);
        }

        System.out.println("tugas 2 dimulai");
        for (int i = 0; i < 5; i++) {
            System.out.println("tugas 2" + i);
        }
    }
}
