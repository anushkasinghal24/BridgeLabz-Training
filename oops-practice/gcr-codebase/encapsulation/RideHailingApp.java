/*Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
 */

import java.util.*;

interface GPS{
    String getCurrentLocation();
    void updateLocation(String newLocation);
}


abstract class Vehicle implements GPS{

    private int vehicleId;
    private String driverName;
    protected double ratePerKm;
    private String currentLocation;


    public Vehicle(int vehicleId, String driverName, double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "unknown";



    }


    public abstract double calculateFare(double distance);

    public void getVehicleDetails(){

        System.out.println("Vehicle id: "+ vehicleId);
        System.out.println("Driver name: "+ driverName);
        System.out.println("Current location: "+ currentLocation);
        System.out.println("Rate per km: "+ ratePerKm);


    }


    @Override
    public String getCurrentLocation(){
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation){
        this.currentLocation = newLocation;
    
    }

}


class Car extends Vehicle{
    public Car (int id, String driverName){
        super(id,driverName,20.0);
    }

    @Override
    public double calculateFare(double distance){
        return distance*ratePerKm;
    }
}

class Bike extends Vehicle{
    public Bike (int id, String driverName){
        super(id,driverName,10);
    }

    @Override

    public double calculateFare(double distance){
        return distance*ratePerKm;
    }
}

class Auto extends Vehicle{

    public Auto(int id,String driverName){
        super(id,driverName,8);
    }

    @Override

    public double calculateFare(double distance){
        return distance*ratePerKm;
    }
}


public class RideHailingApp{

    public static void calculateRidingFare(Vehicle vehicle, double distance){
        vehicle.getVehicleDetails();
        System.out.println("Distance in km : "+distance);
        System.out.println("Fare : "+vehicle.calculateFare(distance));
        System.out.println();
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        List<Vehicle> vehicles=new ArrayList<>();

        System.out.println("Enter number of rides : ");
        int n = sc.nextInt();
        sc.nextLine();


        for(int i = 0;i<n;i++){
            System.out.println("Enter ride details for ride number : "+(i+1) );

            System.out.println("Vehicle id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Driver name: ");
            String driver = sc.nextLine();

            System.out.println("Vehicle type(1-car, 2-bike, 3-auto) : ");
            int type = sc.nextInt();

            sc.nextLine();


            Vehicle vehicle;


            if(type == 1){
                vehicle = new Car(id,driver);


            }
            else if(type == 2){
                vehicle = new Bike(id,driver);

            }else{
                vehicle = new Auto(id, driver);
            }


            sc.nextLine();


            System.out.println("Current Location : ");
            String location = sc.nextLine();
            vehicle.updateLocation(location);

            vehicles.add(vehicle);
        }

        System.out.println("Enter distance : ");
        double distance = sc.nextDouble();

        System.out.println("Ride fare details: ");
        for(Vehicle v:vehicles){
            calculateRidingFare(v,distance);
        }

    }


}