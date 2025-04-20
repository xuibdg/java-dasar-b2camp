package Revi.Belajar_Java_Dasar.TaskBulanan;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book(1, "Clean Code", "Robert C. Martin", true));
        books.add(new Book(2, "-", "-", false)); // Buku kosong, tidak diketahui
        books.add(new Book(3, "Effective Java", "Joshua Bloch", true));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void showAvailableBooks() {
        System.out.println("Daftar Buku Tersedia:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }
}