package Fadhil.Belajar_Java_dasar.Tugas_16_April_2025;

// ServiceManager.java
public class ServiceManager {
    private int totalHandled = 0;

    public synchronized void logCustomerDone(int customerId) {
        totalHandled++;
        System.out.println("[Log] Total pelanggan selesai: " + totalHandled + " (termasuk ID " + customerId + ")");
    }
}

