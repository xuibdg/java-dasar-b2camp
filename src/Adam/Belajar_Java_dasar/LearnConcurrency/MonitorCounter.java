package Adam.Belajar_Java_dasar.LearnConcurrency;

public class MonitorCounter {
    private int count = 0;
    public synchronized void increment() { count++; }
    public synchronized int getCount() { return count; }
}
