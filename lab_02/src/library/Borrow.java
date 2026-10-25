package library;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Borrow {
    Book book;
    Reader reader;
    String borrowDate;
    String returnDate;

    public Borrow(Book book, Reader reader, String borrowDate, String returnDate) {
        this.book = book;
        this.reader = reader;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public Borrow(Book book, Reader reader) {
        this(
                book,
                reader,
                LocalDateTime.now().toString(),
                LocalDateTime.now().plusDays(30).toString()
        );
    }

    public void displayBorrowInfo(){
        System.out.println("Wypozyczenie");
        System.out.println("Ksiazka: " + book.title);
        System.out.println("Czytelnik: " + reader.firstName + " " + reader.lastName);
        System.out.println("Data wypozyczenia: " + borrowDate);
        System.out.println("Data zwrotu: " + returnDate);
        System.out.println();
    }
}
