package Fadhil.Belajar_Java_dasar.Tugas_15_April_2025;

import java.util.Arrays;

class Rekening {
    private int saldo = 0;

    public synchronized void tambahSaldo(int jumlah) {
        saldo += jumlah;
        System.out.println(Thread.currentThread().getName() + " tambah saldo: " + jumlah + " | Total: " + saldo);
    }
}

class TambahSaldoThread extends Thread {
    Rekening rekening;

    public TambahSaldoThread(Rekening rekening) {
        this.rekening = rekening;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            rekening.tambahSaldo(100);
        }
    }
}

public class Synchronized {
    public static void main(String[] args)
            throws InterruptedException {
        Rekening rekening = new Rekening();

        Thread t1 = new TambahSaldoThread(rekening);
        Thread t2 = new TambahSaldoThread(rekening);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }



}
