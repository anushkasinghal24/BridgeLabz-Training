/*Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.*/ 
import java.util.*;


 class CarRental {
	 
	 String customer;
	 String model;
	 int days;
	 double cost=1200;
	 
	 
	 CarRental(){
		 customer = "Customer";
		 model = "model";
		 days = 1;
		 
	 }
	 
	 CarRental(String customer, String model, int days){
		 this.customer = customer;
		 this.model = model;
		 this.days = days;
	 }
	 
	 
	 double totalCost() {
		 return cost*days;
	 }
	 
	 void display() {
		 System.out.println("Customer name "+customer+" Model "+model +" Days "+days+" Total cost "+totalCost());
	 }
	 
	 public static void main(String args[]) {
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Enter customer name : ");
		 String name = sc.nextLine();
		 
		 System.out.println("Enter model : ");
		 String model = sc.nextLine();
		 
		 System.out.println("Enter days : ");
		 int days = sc.nextInt();
		 
		 
		 CarRental r = new CarRental(name,model,days);
		 r.display();
	 }
	 
	
	

}