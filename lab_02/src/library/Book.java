package library;

public class Book {
    String title;
    String author;
    String isbn;
    int publicationYear;

    public Book(String title, String author, String isbn, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    public void displayInfo(){
        System.out.println("Ksiazka");
        System.out.println("Tytul: " + title);
        System.out.println("Autor: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Rok wydania: " + publicationYear);
        System.out.println();
    }

}
