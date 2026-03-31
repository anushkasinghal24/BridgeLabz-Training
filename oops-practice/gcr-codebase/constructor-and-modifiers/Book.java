//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
 
import java.util.*;
public class Book {

	
	String title;
	String author;
	double price;
	
	//default constructor
	
	Book(){
		title="Unknown";
		author="Unknown";
		price=0.0;
		
	}
	
	//parameterized
	
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
	
	void displayDetails() {
		
		System.out.println("Title: "+title+" author: "+author+" price: "+price);
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter title ");
		String title = sc.nextLine();
		
		System.out.println("Enter author ");
		String author = sc.nextLine();
		
		System.out.println("Enter price ");
		double price = sc.nextDouble();
		
		
		Book b1 = new Book();
		Book b2 = new Book(title,author,price);
		
		b1.displayDetails();
		b2.displayDetails();
	}
	
	
	
	
	
}