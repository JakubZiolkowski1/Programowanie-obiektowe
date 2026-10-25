package library;

public class Reader {
    String firstName;
    String lastName;
    int libraryCardId;

    public Reader(String firstName, String lastName, int libraryCardId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.libraryCardId = libraryCardId;
    }

    public Borrow borrowBook(Book book) {
        return new Borrow(book, this);
    }
}
