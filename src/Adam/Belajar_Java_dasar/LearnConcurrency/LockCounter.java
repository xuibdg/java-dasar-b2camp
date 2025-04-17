package Adam.Belajar_Java_dasar.LearnConcurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounter {

    private int count = 0;

    private final Lock lock = new ReentrantLock();

    public void increment() { count++; }

    public void incrementLock() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void locking() {lock.lock();}

    public void unlocking() { lock.unlock();}

    public int getCount() { return count; }
}
