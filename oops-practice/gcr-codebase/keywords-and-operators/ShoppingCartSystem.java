
import java.util.*;

class Product {
	
	private static double discount=10.0;
	private final String productID;
	private String productName;
	private double price;
	private int quantity;
	
	
	public Product(String productID, String productName,double price,int quantity) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		
		
	}
	
	public static void updateDiscount(double newDiscount){
		discount = newDiscount;
	}
	
	public double getAfterDiscount() {
		return price-(price*discount/100);
	}
	
	public void displayDetails() {
		if(this instanceof Product) {
			System.out.println("Product id: "+ productID );
			System.out.println("Product name: "+ productName);
			System.out.println("Price: "+ price);
			System.out.println("Quantity: "+ quantity);
			System.out.println("Discount: "+ discount+"%");
			System.out.println("Price after discount: "+ getAfterDiscount());
			
		}
		else {
			System.out.println("invalid product ");
			}
	}
	
}

public class ShoppingCartSystem{
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Product[] product=new Product[n];
		
		System.out.println("Enter discount percentage: ");
		double d = sc.nextDouble();
		
		sc.nextLine();
		
		Product.updateDiscount(d);
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter details for product "+(i+1));
			
			System.out.println("Enter product id: ");
			String id = sc.nextLine();
			
			System.out.println("Enter product name ");
			String name = sc.nextLine();
			
			System.out.println("Enter price ");
			double price = sc.nextDouble();
			
			System.out.println("Enter quantity ");
		    int qt = sc.nextInt();
			sc.nextLine();
			
			product[i] = new Product(id,name,price,qt);
			
			
			
			
		}
		
		System.out.println();
		
		for(int i = 0; i<n; i++) {
			product[i].displayDetails();
		}
		
	}
}
