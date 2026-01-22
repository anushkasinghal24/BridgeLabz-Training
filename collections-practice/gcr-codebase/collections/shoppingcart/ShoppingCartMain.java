package shoppingcart;
import java.util.*;
public class ShoppingCartMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		
		System.out.println("Enter number of Products: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i< n ; i++) {
			System.out.println("\nEnter Product " + (i + 1));
			System.out.print("Product Name : ");
			String name = sc.nextLine();
			System.out.print("Product Price : ");
			double price = sc.nextDouble();
			sc.nextLine();
			Product product = new Product(name, price);
            cart.addProduct(product);
        }

        cart.displayCart();
        cart.displaySortedByPrice();
		
		
	}

}
