package Fadhil.Belajar_Java_dasar.Tugas_16_April_2025;

// CustomerHandler.java
import java.util.concurrent.Semaphore;

public class CustomerHandler implements Runnable {
    private final int customerId;
    private final Semaphore semaphore;
    private final ServiceManager manager;

    public CustomerHandler(int customerId, Semaphore semaphore, ServiceManager manager) {
        this.customerId = customerId;
        this.semaphore = semaphore;
        this.manager = manager;
    }

    @Override
    public void run() {
        try {
            System.out.println("Pelanggan " + customerId + " menunggu giliran...");
            semaphore.acquire();
            System.out.println("Pelanggan " + customerId + " sedang dilayani...");

            // Simulasi proses pelayanan
            Thread.sleep(1000 + (int)(Math.random() * 2000));

            System.out.println("Pelanggan " + customerId + " selesai dilayani.");
            manager.logCustomerDone(customerId);
        } catch (InterruptedException e) {
            System.err.println("Thread pelanggan " + customerId + " terganggu.");
        } finally {
            semaphore.release();
        }
    }
}

