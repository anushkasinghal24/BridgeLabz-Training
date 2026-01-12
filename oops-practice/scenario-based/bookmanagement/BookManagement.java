package bookmanagement;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    public static void main(String[] args){
        SmartShelf shelf = new SmartShelf();

        // users add books one by one (list stays mostly sorted)
        shelf.addBook(new Book("Clean Code", "Robert C. Martin"));
        shelf.addBook(new Book("Algorithms", "Robert Sedgewick"));
        shelf.addBook(new Book("Design Patterns", "GoF"));
        shelf.addBook(new Book("Clean Architecture", "Robert C. Martin"));
        shelf.addBook(new Book("Algorithm Design Manual", "Steven S. Skiena"));

        shelf.printReadingList();
    }
}
