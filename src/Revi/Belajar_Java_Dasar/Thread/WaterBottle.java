package Revi.Belajar_Java_Dasar.Thread;

public class WaterBottle {

    private int liter = 0;


    public boolean fill(String threadName) {
        final int MAX_LITER = 25;
        if (liter < MAX_LITER) {
            liter++;
            System.out.println(threadName + " mengisi botol, total air: " + liter + " liter.");
            return true;
        }
        System.out.println(threadName + " gagal mengisi botol, botol sudah penuh.");
        return false;
    }

    public int getLiter() {
        return liter;
    }
}