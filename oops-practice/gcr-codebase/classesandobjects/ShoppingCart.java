//package classesandobjects;

//Class to represent a Cart Item
class CartItem {
	 // Attributes
	 String itemName;
	 double price;
	 int quantity;

 // Constructor to initialize an item
 CartItem(String itemName, double price, int quantity) {
	 
     this.itemName = itemName;
     this.price = price;
     this.quantity = quantity;
 }

 // Method to add quantity to the cart
 void addItem(int qty) {
     this.quantity += qty;
     System.out.println("Added " + qty + " of " + itemName + " to the cart.");
 }

 // Method to remove quantity from the cart
 void removeItem(int qty){
     if (qty > this.quantity){
         System.out.println("Cannot remove " + qty + " of " + itemName + " Only " + this.quantity + " in cart.");
     } else{
         this.quantity -= qty;
         System.out.println("Removed " + qty + " of " + itemName + " from the cart");
     }
 }

 // Method to calculate total cost for this item
 double getTotalCost(){
     return this.price * this.quantity;
 }

 // Method to display item details
 void displayItem(){
     System.out.println("Item: " +itemName + ", Price: $" + price + ", Quantity: " + quantity);
 }
}

//Main class to simulate Shopping Cart
public class ShoppingCart {
	 public static void main(String[] args) {
	     
	     CartItem laptop = new CartItem("Laptop", 999.99, 1);
	
	     laptop.displayItem();
	
	     
	     laptop.addItem(2);
	
	     
	     laptop.removeItem(1);
	
	     
	     System.out.println("Total cost: $" + laptop.getTotalCost());
	 }
}

