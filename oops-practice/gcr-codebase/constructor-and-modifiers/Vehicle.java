
/*Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee. */
import java.util.Scanner;

class Vehicle {
	//Instance Variable 
	String ownerFullName ;
	String vehicleCategory;
	
	//Class Variable 
	
	static double registrationAmount = 1500;
	
	Vehicle(String owner , String type){
		ownerFullName = owner;
		vehicleCategory = type;
		
	}
	void printVehicleDetails() {
		System.out.println("Owner Name : " + ownerFullName );
		System.out.println("Vehicle Type : " + vehicleCategory);
		System.out.println("Registration Fee : " + registrationAmount);
		
		
	}
	static void updateRegistrationAmount(double newAmount) {
		registrationAmount = newAmount;
		
	}
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Owner Name : ");
		String owner = input.nextLine();
		System.out.println("Enter Vehicle Type: ");
		String type = input.nextLine();
		System.out.print("Enter new Registration fee: ");
		double fee = input.nextDouble();
		
		Vehicle vehicle = new Vehicle(owner , type);
		vehicle.printVehicleDetails();
	}

}
