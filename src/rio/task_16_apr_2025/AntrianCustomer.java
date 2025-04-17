package rio.task_16_apr_2025;

// Buat kombinasi thread -> monitor, synchornize, semaphore, limit, throw, scanner

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class AntrianCustomer {

    static Semaphore kasir = new Semaphore(2);
    static Object monitor = new Object();

    static class Customer extends Thread {
        int id;
        Customer(int id) {
            this.id = id;
        }

        public void run() {
            try {
                kasir.acquire();
                Thread.sleep(1500);
                synchronized (monitor) {
                    System.out.println("Customer " + id + " Finished...");
                }
            }catch (Exception e) {
                System.out.println();
            }finally {
                kasir.release();

            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Number of customers (1-20)");
            int jumlah = input.nextInt();
            if (jumlah < 1 || jumlah > 20) throw new RuntimeException("Invalid input");

            for (int i = 1; i <= jumlah; i++) {
                new Customer(i).start();

            }
        }catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }finally {
            input.close();
        }
    }
}