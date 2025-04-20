package Revi.Belajar_Java_Dasar.TaskBulanan;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class BorrowBook {
    private final Library library;
    private final ReentrantLock lock;
    private final Semaphore semaphore;

    public BorrowBook(Library library) {
        this.library = library;
        this.lock = new ReentrantLock();
        this.semaphore = new Semaphore(2);
    }

    public void borrow(int bookId) {
        try {
            semaphore.acquire();
            lock.lock();

            System.out.println("Meminjam buku dengan ID: " + bookId);

            Book book = library.findBookById(bookId);
            if (book == null) {
                throw new LibraryException("Error: Buku dengan ID tersebut tidak ditemukan.");
            }
            if (!book.isAvailable()) {
                throw new LibraryException("Error: Buku tidak tersedia.");
            }

            Thread.sleep(2000);
            book.setAvailable(false);
            System.out.println("Berhasil meminjam buku: " + book.getTitle());

        } catch (LibraryException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Error: Operasi terganggu.");
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
            semaphore.release();
        }
    }
}