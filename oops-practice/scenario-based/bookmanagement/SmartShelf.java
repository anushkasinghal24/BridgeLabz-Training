package bookmanagement;

import java.util.ArrayList;
import java.util.List;

class SmartShelf {

    // internal reading list kept sorted by title
    private final List<Book> readingList = new ArrayList<>();

    // online/real-time insertion sort behavior
    public void addBook(Book newBook){
        // find correct position using insertion sort logic
        int i = readingList.size() - 1;

        // shift books with title > newBook.title to the right
        while (i >= 0 &&
               readingList.get(i).getTitle().compareToIgnoreCase(newBook.getTitle()) > 0) {
            i--;
        }

        // insert just after the last smaller/equal title
        // equal titles keep original order
        readingList.add(i + 1, newBook);
    }

    public List<Book> getReadingList(){
        return readingList;
    }

    public void printReadingList(){
        System.out.println("Current SmartShelf reading list (sorted by title):");
        for (Book b : readingList) {
            System.out.println(" - " + b);
        }
    }
}
