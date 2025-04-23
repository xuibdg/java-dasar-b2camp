package Revi.Belajar_Java_Dasar.TaskBulanan;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        BorrowBook borrowBook = new BorrowBook(library);

        library.showAvailableBooks();
        System.out.println();

        borrowBook.borrow(3);
        System.out.println();

        borrowBook.borrow(2);
        System.out.println();

        borrowBook.borrow(10);
        System.out.println();

        System.out.println();
        library.showAvailableBooks();
        System.out.println();

        System.out.println("1 Buku Berhasil dipinjamkan :");
        for (Book book : library.getBooks()) {
            if (book.getAuthor().equals("Joshua Bloch")) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}