package library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Kordian", "Juliusz Slowacki", "83-06-00578-3", 1982);
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", "978-83-04-04568-2", 1834);

        book1.displayInfo();
        book2.displayInfo();

        Reader reader1 = new Reader("Pan", "Jezyk", 1230);
        Reader reader2 = new Reader("Adam", "Malysz", 1240);

        Borrow borrow1 = reader1.borrowBook(book1);
        Borrow borrow2 = reader2.borrowBook(book2);

        borrow1.displayBorrowInfo();
        borrow2.displayBorrowInfo();
    }
}
