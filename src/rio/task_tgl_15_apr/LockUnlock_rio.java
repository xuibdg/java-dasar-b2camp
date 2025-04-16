package rio.task_tgl_15_apr;

import java.util.concurrent.locks.Lock;
public class LockUnlock_rio {
    public static void main(String[] args) throws InterruptedException {
        counterLock_rio counterLockRio = new counterLock_rio();

        Thread thread1 = new Thread(() -> {
            counterLockRio.loking();
            for (int i = 0; i < 10; i++) {
                counterLockRio.increment();
                System.out.println(counterLockRio.getcount() + " t1 -> " + i);
            }
            counterLockRio.unloking();
        });
        Thread thread2 = new Thread(() -> {
            counterLockRio.loking();
            for (int i = 0; i < 10; i++) {
                counterLockRio.increment();
                System.out.println(counterLockRio.getcount() + " t2 -> " + i);
            }
            counterLockRio.unloking();
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Jumlah count : " + counterLockRio.getcount());
    }
}
