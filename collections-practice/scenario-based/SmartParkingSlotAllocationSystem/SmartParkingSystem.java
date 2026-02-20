package SmartParkingSlotAllocationSystem;

import java.util.*;

class NoParkingSlotAvailableException extends Exception{
	public NoParkingSlotAvailableException(String message) {
		super(message);
	}
}
//Abstract class 



abstract class Vehicle{
	String vehicleNumber;
	
	public Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
		
	}
	public String getVehicleNumber() {
        return vehicleNumber;
    }
	
	public abstract String getType();
}
//   class car
class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    public String getType() {
        return "Car";
    }
}
// class bike
class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    public String getType() {
        return "Bike";
    }
}

//Parking Slot CLass 
class ParkingSlot{
	int slotId;
	boolean isOccupied;
	Vehicle vehicle;
	
	public ParkingSlot(int slotId) {
		this.slotId = slotId;
		this.isOccupied = false;
	}
	
	public boolean isFree() {
		return !isOccupied;
	}
	public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }
	
	public void removeVehicle() {
		this.vehicle = null;
		this.isOccupied = false;
		
	}
	
	

}

//Main Class

public class SmartParkingSystem{

	static Map<Integer, ParkingSlot> slotMap = new TreeMap<>();
    static Queue<Vehicle> waitingQueue = new LinkedList<>();
    
    public static void allocateSlot(Vehicle vehicle) throws NoParkingSlotAvailableException {
        for (ParkingSlot slot : slotMap.values()) {
            if (slot.isFree()) {
                slot.parkVehicle(vehicle);
                System.out.println("Allocated Slot " + slot.slotId + " to " + vehicle.getType() +
                        " [" + vehicle.getVehicleNumber() + "]");
                return;
            }
        }
        throw new NoParkingSlotAvailableException("No Parking Slot Available!");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of parking slots: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            slotMap.put(i, new ParkingSlot(i));
        }
        
        while (true) {
            System.out.println("\n1. Add Vehicle");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter vehicle type (car/bike): ");
                String type = sc.next();
                System.out.print("Enter vehicle number: ");
                String number = sc.next();

                Vehicle vehicle;
                if (type.equalsIgnoreCase("car"))
                    vehicle = new Car(number);
                else
                    vehicle = new Bike(number);

                try {
                    allocateSlot(vehicle);
                } catch (NoParkingSlotAvailableException e) {
                    System.out.println(e.getMessage());
                    waitingQueue.add(vehicle);
                    System.out.println("Vehicle added to waiting queue.");
                }
            } else {
                break;
            }
        }
       
    }

}