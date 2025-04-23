package rafie.belajar_java_dasar.Task_15_April_2025;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
//        System.out.println("Method increment membuat bilangan bertambah: " + count++);
    }

    public synchronized int getCount() {
        return count;
//        System.out.print("Method getCount mengembalikan : " );
    }

}
