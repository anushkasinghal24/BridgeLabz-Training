/*
 * BookShelf – Library Organizer
 * Single-file implementation
 * Uses:
 * - HashMap for genre-wise catalog
 * - LinkedList for efficient insert/delete
 * - HashSet to avoid duplicate books
 */
package bookshelfapp;

import java.util.Scanner;

public class BookShelfApp {

    public static void main(String[] args) {

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
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    shelf.addBook(title, author, genre, isbn);
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow: ");
                    String borrowIsbn = sc.nextLine();
                    shelf.borrowBook(borrowIsbn);
                    break;

                case 3:
                    shelf.displayCatalog();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
