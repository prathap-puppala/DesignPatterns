package behavioral.iterator;

import java.util.Iterator;

// Iterator pattern allows us to access the elements of a collection sequentially without exposing its underlying representation.
public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Java Programming"));
        bookCollection.addBook(new Book("Python"));
        bookCollection.addBook(new Book("JavaScript"));

        Iterator<Book> iterator = bookCollection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
