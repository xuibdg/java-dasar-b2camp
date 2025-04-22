package Valdi.Belajar_Java_Dasar.Task_15_April;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

        private int count = 0;
        private final Lock lock = new ReentrantLock();

        public synchronized void increment() {
            lock.lock();
            try {
                count++;
            }finally {
                lock.unlock();
            }

        }

        public int getCount() {
            return count;
        }
        public void locking() {
            lock.lock();
        }
        public void unlocking() {
            lock.unlock();
        }
    }
