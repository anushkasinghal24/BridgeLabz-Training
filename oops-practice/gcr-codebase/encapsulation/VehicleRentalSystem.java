/*3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
 */

import java.util.*;
//Interface for insurance 
interface Insurable{
    double calculateInsurance(int days);
    String getInsuranceDetails();

}
//Abstract vehicle class
abstract class Vehicle{
    private String vehicleNumber;
    private String vehicleType;
    private double rentalRate;
    private String insurancePolicyNumber;

    //Sensitive Data encapsulated 
    public Vehicle(String vehicleNumber , String vehicleType, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;

    }
    //Abstract Method
    public abstract double calculateRentalCost(int days);
    public String getVehicleNumber(){
        return vehicleNumber;

    }
    public String getVehicleType(){
        return vehicleType;

    }
    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate = rentalRate;
    }

    //sensitive field access
    public void setInsurancePolicyNumber(String policyNumber){
        this.insurancePolicyNumber = policyNumber;
    }
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

}

//Car Class
class Car extends Vehicle implements Insurable{
    public Car(String vehicleNumber , double rentalRate){
        super(vehicleNumber , "Car" , rentalRate);

    }
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
    public double calculateInsurance(int days){
        return 200 * days;
    }
    public String getInsuranceDetails(){
        return "Car Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}
class Bike extends Vehicle implements Insurable{

    public Bike(String vehicleNumber, double rentalRate){
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days){
        return 100 * days;
    }

    @Override
    public String getInsuranceDetails(){
        return "Bike Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}

// Truck class
class Truck extends Vehicle implements Insurable{

    public Truck(String vehicleNumber, double rentalRate){
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days){
        return (getRentalRate() * days)  + 500;
    }

    @Override
    public double calculateInsurance(int days) {

        return 300 * days;
    }

    @Override
    public String getInsuranceDetails() {

        return " Truck Insurance : Policy No: " + getInsurancePolicyNumber();
    }
}


//Main Class
public class VehicleRentalSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int totalVehicles = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= totalVehicles; i++) {

            System.out.println("\nVehicle " + i);
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Truck");
            System.out.print("Choose vehicle type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine();

            System.out.print("Enter Rental Rate per day: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Insurance Policy Number: ");
            String policy = sc.nextLine();

            Vehicle vehicle = null;

            if (choice == 1){
                vehicle = new Car(number, rate);
            } else if (choice == 2){
                vehicle = new Bike(number, rate);
            } else if (choice == 3){
                vehicle = new Truck(number, rate);
            } else{
                System.out.println("Invalid choice!") ;
                continue;
            }

            vehicle.setInsurancePolicyNumber(policy);
            vehicleList.add(vehicle);
        }

        System.out.print("\nEnter number of rental days : ");
        int days = sc.nextInt();

        System.out.println("\n===== Vehicle Rental Details =====");

        for (Vehicle vehicle : vehicleList) {

            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0 ;

            if (vehicle instanceof Insurable) {

                insuranceCost = ((Insurable) vehicle).calculateInsurance(days);
            }

            System.out.println("\nVehicle Number : " + vehicle.getVehicleNumber());
            System.out.println("Vehicle Type   : " + vehicle.getVehicleType());
            System.out.println("Rental Cost   : " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);

            if (vehicle instanceof Insurable){
                System.out.println("Insurance Info: " +
                        ((Insurable) vehicle).getInsuranceDetails());
            }

            System.out.println("------------------------------");
        }
    }
}