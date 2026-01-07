import java.util.*;
//Exception

class NoDriverAvailableException extends Exception{
    public NoDriverAvailableException(String msg){
        super(msg);
    }
}

//Interface 
interface FareCalculator{
    double calculateFare(double distance);
}


//Polymorphism 
class NormalFareCalculator implements FareCalculator{
    public double calculateFare(double distance){
        return distance * 10;
    }
}

class PeakFareCalculator implements FareCalculator{
    public double calculateFare(double distance){
        return distance * 15;

    }
}


//user Class 
class User{
    int userId;
    String name;
    User(int userId, String name){
        this.userId = userId;
        this.name = name;
    }
}


//Driver Class
class Driver{
    int driverId;
    String name;
    boolean available =true;


    Driver(int driverId, String name){
        this.driverId = driverId;
        this.name = name;
    }
}

//Ride class 
class Ride{
    
    int rideId;
    User user;
    Driver driver;
    double fare;

    Ride(int rideId, User user, Driver driver, double fare) {
        this.rideId = rideId;
        this.user = user;
        this.driver = driver;
        this.fare = fare;
    }

}


//Main class
public class CabBooking{
    static Scanner sc= new Scanner(System.in);
    static ArrayList<Driver> drivers = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Ride> rides = new ArrayList<>();


    //Use CRUD
    static void addUser(){
        System.out.print("Enter User ID :");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enetr User Name : ");
        String name =sc.nextLine();

        users.add(new User(id,name));
        System.out.println("User Added Successfully");
    }

    static void viewUsers(){
        System.out.println("---------Users-----------");
        for(User u : users){
            System.out.println(u.userId + "-" + u.name);

        }
    }

    static User getUser(int id ){
        for(User u:  users){
            if(u.userId == id)
                return u;
        }
        return null;
    }

    static void deleteUser(){
        System.out.println("Enetr User ID to delete : ");
        int id = sc.nextInt();
        users.removeIf(u -> u.userId == id);
        System.out.println("User Deleted ");
    }

        // ========== DRIVER CRUD ==========
    static void addDriver() {
        System.out.print("Enter Driver ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        drivers.add(new Driver(id, name));
        System.out.println("✅ Driver Added");
    }

    static void viewDrivers() {
        System.out.println("--- Drivers ---");
        for (Driver d : drivers) {
            System.out.println(d.driverId + " - " + d.name + " | Available: " + d.available);
        }
    }

    static Driver assignDriver() throws NoDriverAvailableException{
        for(Driver d : drivers){
            if(d.available){
                d.available = false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No Driver Available");
    }

    // Ride Crud
    static void bookRide(){
        try {
            System.out.print("Enter Ride ID: ");
            int rideId = sc.nextInt();

            System.out.print("Enter User ID: ");
            int userId = sc.nextInt();

            User user = getUser(userId);
            if (user == null) {
                System.out.println("User Not Found");
                return;
            }

            System.out.print("Enter Distance (km): ");
            double distance = sc.nextDouble();

            System.out.print("1. Normal Fare  2. Peak Fare : ");
            int choice = sc.nextInt();

            FareCalculator calculator =
                    (choice == 1) ? new NormalFareCalculator() : new PeakFareCalculator();

            Driver driver = assignDriver();
            double fare = calculator.calculateFare(distance);

            rides.add(new Ride(rideId, user, driver, fare));
            System.out.println("Ride Booked | Fare: " + fare);

        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

        
    static void rideHistory(){
        System.out.println("-Ride History ----");
        for(Ride r : rides){
            System.out.println("RideID: " + r.rideId +
                    " | User: " + r.user.name +
                    " | Driver: " + r.driver.name +
                    " | Fare: ₹" + r.fare);
        }
    }

    public static void main(String[] args) {
        int choice; 
        do { 
            System.out.println("\nCab Booking System");
            System.out.println("1. Add user");
            System.out.println("2. View users");
            System.out.println("3. Delete Users");
            System.out.println("4. Add Driver");
            System.out.println("5. View Drivers");
            System.out.println("6. Book ride");
            System.out.println("7. Ride History");
            System.out.println("0. Exit ");
            System.out.println("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice){
                case 1 -> addUser();
                case 2 -> viewUsers();
                case 3 -> deleteUser();
                case 4 -> addDriver();
                case 5 -> viewDrivers();
                case 6 -> bookRide();
                case 7 -> rideHistory();
                case 0 -> System.out.println("Thank You");
                default -> System.out.println("Invalid Choice");

            }

            
        } while (choice != 0);
        
    }
    

}