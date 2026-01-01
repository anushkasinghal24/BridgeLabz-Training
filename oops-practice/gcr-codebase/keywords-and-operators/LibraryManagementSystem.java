import java.util.*;
class Book {
	//Static
	private static String libraryName = "Bridge-Labz Library ";
	private  String title;
	private  String author;
	
	private static int totalBooks = 0;
    //Final
	private final  String isbn;
	
	public Book(String title,String author, String isbn ) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		
        
		totalBooks++;
		
		
	}
	
	public static void displayLibraryName() {
		System.out.println("The library name is "+ libraryName);
	}
	
	public static void displayTotalBooks() {
		System.out.println("The total number of books are " +totalBooks);
	}
	
	public void displayBookDetails() {
		if(this instanceof Book ) {
			System.out.println("Book title is: "+ title);
			System.out.println("Author name: "+ author);
			System.out.println("Isbn: "+ isbn);
		}
		else {
			System.out.println("Invalid Book Instance");
		}
	}	
	

}

public class LibraryManagementSystem{
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of books ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		Book[] book=new Book[n];
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Enter details for book "+(i+1));
			
			System.out.println("Enter title ");
			String title=sc.nextLine();
			
			System.out.println("Enter author");
			String author=sc.nextLine();
			
			System.out.println("Enter isbn");
			String isbn=sc.nextLine();
			
			book[i]=new Book(title,author,isbn);
			
			
		}
		
		System.out.println();
		Book.displayLibraryName();
		System.out.println();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Book details for book "+(i+1));
			book[i].displayBookDetails();
		}
		
		System.out.println();
		Book.displayTotalBooks();
		
		
	}
}