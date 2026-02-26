import book.Book;
import dvd.DVD;
import management.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java Basics", "James Gosling");
        DVD d1 = new DVD("Inception", "Christopher Nolan", 148);

        library.addItem(b1);
        library.addItem(d1);

        library.borrowAll();
        library.returnAll();
    }
}