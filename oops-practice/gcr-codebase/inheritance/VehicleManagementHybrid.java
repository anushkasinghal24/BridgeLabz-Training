/*Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls. */
import java.util.*;

class Vehicle{
	int maxSpeed;
	String fuelType;
	
	Vehicle(int maxSpeed,String fuelType){
	this.maxSpeed = maxSpeed;
	this.fuelType = fuelType;
	}
	
	void display() {
		System.out.println();
		System.out.println("Max speed in kmph: " + maxSpeed);
		System.out.println("FuelType: " + fuelType);
	}
}

class Car extends Vehicle{
	int seatCapacity;
	Car(int maxSpeed,String fuelType, int seatCapacity){
		super(maxSpeed,fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	
	void display() {
		System.out.println("Car details ");
		super.display();
		System.out.println("Seat capacity " + seatCapacity);
	}
}
class MotorCycle extends Vehicle{
	boolean hasCarrier;
	MotorCycle(int maxSpeed,String fuelType, boolean hasCarrier){
		super(maxSpeed,fuelType);
		this.hasCarrier = hasCarrier;
	}
	
	@Override
	
	void display() {
		System.out.println("Motorcycle details ");
		super.display();
		System.out.println("Has carrier " + (hasCarrier?"Yes":"No"));
		
		
	}
}
class Truck extends Vehicle{
	int loadCapacity;
	Truck(int maxSpeed,String fuelType, int loadCapacity){
		super(maxSpeed,fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	
	void display() {
		System.out.println("Truck details ");
		super.display();
		System.out.println("Load capacity " + loadCapacity);
	}
}

public class VehicleManagementHybrid {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of vehicles");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		Vehicle[] vehicle = new Vehicle[n];
		for(int i = 0; i<n; i++) {
			System.out.println("Enter type(car/truck/motorcycle)");
			String type = sc.nextLine().toLowerCase();
			
			System.out.println("Enter max speed");
			int speed = sc.nextInt();
			
			System.out.println("enter fuel type ");
			String fuel = sc.nextLine();
			
			switch (type) {
			case "car":
				System.out.println("Enter seat capacity");
				int seat = sc.nextInt();
				sc.nextLine();
				vehicle[i] = new Car(speed,fuel,seat);
				
				break;
				
		
			case "truck":
				System.out.println("Enter load capacity");
				int load = sc.nextInt();
				sc.nextLine();
				vehicle[i] = new Truck(speed,fuel,load);
				
				break;
			case "motorcycle":
				System.out.println("Has carrier (true/false)");
				boolean hascarrier = sc.nextBoolean();
				sc.nextLine();
				vehicle[i] = new MotorCycle(speed,fuel,hascarrier);
				
				break;
				
				default:
					System.out.println("Invalid input");
					i--;
				
			}
			
			
		}
		
		System.out.println("Vehicle Information");
		for(Vehicle v:vehicle) {
			v.display();
		}
	}

}