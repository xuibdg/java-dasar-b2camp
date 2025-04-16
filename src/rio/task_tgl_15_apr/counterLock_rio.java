package rio.task_tgl_15_apr;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class counterLock_rio {
    private int count = 0;

    private final Lock lock = new ReentrantLock();

    public void increment() { count++; }

    public void incrementLock() {
        lock.lock();
        try {
             count++;
        }finally {
            lock.unlock();
        }
    }
    public void loking() { lock.lock(); }
    public void unloking() { lock.unlock(); }
    public int getcount() { return count; }

    }
