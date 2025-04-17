package Revi.Belajar_Java_Dasar.Thread;

public class CounterMonitor {
    private int count = 0;

    // Increment count dengan thread safety menggunakan synchronized
    public synchronized void increment() {
        count++;
    }

    // Mendapatkan count dengan thread safety menggunakan synchronized
    public synchronized int getCount() {
        return count;
    }
}