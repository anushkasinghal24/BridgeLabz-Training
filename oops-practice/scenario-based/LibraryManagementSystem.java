/*Library Management System – Book Search and Checkout
Scenario: You’re designing a system for a small library to manage books and track checkouts.
Problem Requirements:
● Store book details (title, author, status) in a Array.
● Allow searching by partial title using String operations.
● Store book data in an Array.
● Use methods for searching, displaying, and updating book status (checked out or
available). */
import java.util.Scanner;
public class LibraryManagementSystem{

    static String[] bookTitles ={
            "Java Programming",
            "DSA",
            "OS",
            "CN",
            "DBMS"
    };

    static String[] bookAuthors ={
            "Hello world",
            "Mark Aeinstein",
            "Abrahamn",
            "Tanenbaum",
            "Raghunandan"
    };

    static boolean[] isBookAvailable ={
            true, true, true, true, true
    };

    // Method to display all books
    static void displayBooks(){
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println(
                    (i + 1) + ". " + bookTitles[i] +
                    " | Author : " + bookAuthors[i] +
                    " | Status : " + (isBookAvailable[i] ? "Available" : "Checked Out")
            );
        }
    }

    // Method to search book by partial title
    static void searchBook(String searchText){
        boolean found = false;
        System.out.println("\nSearch Results:");
        for (int i = 0; i < bookTitles.length; i++){

            if (bookTitles[i].toLowerCase().contains(searchText.toLowerCase())) {
                System.out.println(

                        (i + 1) + ". " + bookTitles[i] +
                        " | Status: " + (isBookAvailable[i] ? "Available" : "Checked Out")
                );
                found = true;
            }
        }
        if (!found){
            System.out.println("No matching books found.");
        }
    }

    // Method to checkout a book
    static void checkoutBook(int bookNumber){
        if (bookNumber < 1 || bookNumber > bookTitles.length){
            System.out.println("Invalid book number.");

            return;
        }

        if (isBookAvailable[bookNumber - 1]){
            isBookAvailable[bookNumber - 1] = false;
            System.out.println("Book checked out successfully.");
        } else{
            System.out.println("Sorry, this book is already checked out.");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        displayBooks();

        System.out.print("\nEnter part of book title to search : ");
        String searchText = input.nextLine();
        searchBook(searchText);

        System.out.print("\nEnter book number to checkout : ");
        int bookNumber = input.nextInt();
        checkoutBook(bookNumber);

        displayBooks();

        input.close();
    }
}