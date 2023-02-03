
//Scenario: Create a program to manage a library

//Object-Oriented Paradigm

//Class to represent a book
public class Book {
    private String title;
    private String author;
    private int numPages;

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }
}

//Class to represent a library
public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public boolean isBookInLibrary(Book book) {
        return books.contains(book);
    }

    public void checkOutBook(Book book) {
        books.remove(book);
    }

    public void returnBook(Book book) {
        books.add(book);