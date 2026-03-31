/*Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
*/ 

import java.util.Scanner;

class Product {
	String productName ;
	double price;
	
	//CLass variable 
	static int totalProducts = 0;
	
	//Constructors 
	Product(String productName , double price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	//Instance Method
	
	void displayProductdetails() {
		System.out.println("Product Name : " + productName );
		System.out.println("Price: " + price);
		
	}
	
	//Class Method 
	
	static void displayTotalProducts() {
		System.out.println("Total Products : " + totalProducts);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		
		Product p = new Product(name , price);
		p.displayProductdetails();
		Product.displayTotalProducts();
		
	}
	

}
