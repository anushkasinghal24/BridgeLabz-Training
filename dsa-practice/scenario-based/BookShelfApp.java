import java.util.*;

/*
 * BookShelf – Library Organizer
 * Single-file implementation
 * Uses:
 * - HashMap for genre-wise catalog
 * - LinkedList for efficient insert/delete
 * - HashSet to avoid duplicate books
 */

public class BookShelfApp {

    /* ---------- Book class ---------- */
    static class Book {
        private String title;
        private String author;
        private String genre;
        private String isbn;

        public Book(String title, String author, String genre, String isbn) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.isbn = isbn;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getGenre() { return genre; }

        // Prevent duplicate books
        @Override
        public boolean equals(Object obj){
            if (this == obj) return true ;
            if (!(obj instanceof Book)) return false;
            Book b = (Book) obj;
            return isbn.equalsIgnoreCase(b.isbn);
        }

        @Override
        public int hashCode(){
            return isbn.toLowerCase().hashCode();
        }

        @Override
        public String toString(){
            return String.format("Title: %s | Author: %s | ISBN: %s",
                    title, author, isbn);
        }
    }

    /* ---------- BookShelf Manager ---------- */
    static class BookShelf{

        // genre → list of books
        private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

        // To avoid duplication
        private HashSet<Book> uniqueBooks = new HashSet<>();

        // Add / Return book
        public void addBook (String title, String author, String genre, String isbn) {
            Book book = new Book(title, author, genre, isbn);

            if (!uniqueBooks.add( book )) {
                System.out.println("Book already exists!");
                return;
            }

            catalog.putIfAbsent(genre, new LinkedList<>());
            catalog.get(genre).add(book);

            System.out.println("Book added successfully. ");
        }

        // Borrow / Remove book
        public void borrowBook(String isbn) {

            for (String genre : catalog.keySet()) {
                LinkedList<Book> list = catalog.get(genre);

                Iterator<Book> it = list.iterator();
                while (it.hasNext()) {
                    Book b = it.next();
                    if (b.isbn.equalsIgnoreCase( isbn )) {
                        it.remove();            // Efficient delete
                        uniqueBooks.remove(b);
                        System.out.println("Book borrowed successfully.");
                        return;
                    }
                }
            }

            System.out.println("Book not found. ");
        }

        // Display genre-wise catalog
        public void displayCatalog() {

            if (catalog.isEmpty()) {
                System.out.println("Library is empty. ");
                return;
            }

            for (String genre : catalog.keySet()){
                System.out.println("\nGenre: " + genre);
                for (Book b : catalog.get(genre)) {
                    System.out.println(b);
                }
            }
        }
    }

    /* ---------- Main Method ---------- */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Display Catalog");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter title : ");
                    String title = sc.nextLine();

                    System.out.print("Enter author : ");
                    String author = sc.nextLine();

                    System.out.print("Enter genre : ");
                    String genre = sc.nextLine();

                    System.out.print("Enter ISBN : ");
                    String isbn = sc.nextLine();

                    shelf.addBook(title, author, genre, isbn);
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow: ") ;
                    String borrowIsbn = sc.nextLine();
                    shelf.borrowBook(borrowIsbn);
                    break;

                case 3:
                    shelf.displayCatalog() ;
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! ");
            }
        }
    }
}
