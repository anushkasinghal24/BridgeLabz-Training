package bookshelfapp;

import java.util.*;

public class BookShelf {

    // genre → list of books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // To avoid duplicate books
    private HashSet<Book> uniqueBooks = new HashSet<>();

    // Add / Return book
    public void addBook(String title, String author, String genre, String isbn) {

        Book book = new Book(title, author, genre, isbn);

        if (!uniqueBooks.add(book)) {
            System.out.println("Book already exists!");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);

        System.out.println("Book added successfully.");
    }

    // Borrow / Remove book
    public void borrowBook(String isbn) {

        for (String genre : catalog.keySet()) {

            LinkedList<Book> list = catalog.get(genre);
            Iterator<Book> it = list.iterator();

            while (it.hasNext()) {
                Book b = it.next();
                if (b.getIsbn().equalsIgnoreCase(isbn)) {
                    it.remove();                 // Efficient delete
                    uniqueBooks.remove(b);
                    System.out.println("Book borrowed successfully.");
                    return;
                }
            }
        }

        System.out.println("Book not found.");
    }

    // Display genre-wise catalog
    public void displayCatalog() {

        if (catalog.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println(b);
            }
        }
    }
}
