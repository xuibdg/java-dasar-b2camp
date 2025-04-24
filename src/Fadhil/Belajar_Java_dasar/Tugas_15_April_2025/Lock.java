package Fadhil.Belajar_Java_dasar.Tugas_15_April_2025;

import java.util.concurrent.locks.ReentrantLock;

class Gudang {
    private int stok = 5;
    private final Lock lock = new Lock();

    public void ambilBarang(String kurir) {
        lock.lock(); // Mengunci akses ke stok
        try {
            if (stok > 0) {
                System.out.println(kurir + " mengambil 1 barang. Sisa stok: " + (stok - 1));
                stok--;
            } else {
                System.out.println(kurir + " datang, tapi barang habis.");
            }
        } finally {
            lock.unlock(); // Selalu lepas kunci, walau terjadi error
        }
    }
}

class Kurir extends Thread {
    private Gudang gudang;
    private String namaKurir;

    public Kurir(Gudang gudang, String namaKurir) {
        this.gudang = gudang;
        this.namaKurir = namaKurir;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            gudang.ambilBarang(namaKurir);
            try {
                Thread.sleep(300); // Simulasi waktu antar pengambilan
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lock {
    public static void main(String[] args) {
        Gudang gudang = new Gudang();

        Thread kurir1 = new Kurir(gudang, "Kurir-A");
        Thread kurir2 = new Kurir(gudang, "Kurir-B");

        kurir1.start();
        kurir2.start();
    }

    public void lock() {
    }

    public void unlock() {
    }
}