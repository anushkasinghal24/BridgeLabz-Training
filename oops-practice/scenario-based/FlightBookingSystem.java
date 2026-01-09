/*Flight Booking System (CRUD)Scenario:
 Simulate a basic flight booking system where users can search flights, book them,
and view booking details. 
 Problem Requirements:
● Use Array to store available flight data.
● Store user bookings in a List.
● Use String operations to allow case-insensitive flight search.
● Use methods for searching, booking, and displaying bookings. */
import java.util.*;

class Flight{
    int flightId;
    String source;
    String destination;
    int seats;


    public Flight(int flightId, String source, String destination, int seats){
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
    }
}


class Booking{

    int bookingId;
    String passengerName;
    Flight flight;
    String status;

    public Booking(int bookingId, String passengerName, Flight flight){
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.flight = flight;
        this.status = "confirmed";
    }



}


//main

public class FlightBookingSystem{
//Array to store flights info
    static Flight[] flight={
        new Flight(101,"Delhi","Mumbai",10),
        new Flight(102,"Delhi","Hyderabad",12),
        new Flight(103,"Prayagraj","Hyderabad",15),
        new Flight(104,"Lucknow","Bangalore",29),
        new Flight(105,"Delhi","Prayagraj",12)
    };





    static List<Booking> bookings = new ArrayList<>();

    static int bookingCounter = 1;

    static void searchFlight(String src, String dest){
        
        boolean found=false;
        for(Flight f:flight){
            if(f.source.equalsIgnoreCase(src) && f.destination.equalsIgnoreCase(dest)){
                System.out.println("Flight id: "+f.flightId+" Seats available: "+f.seats);
                found =true;
            }

        }

        if(!found){
            System.out.println("No flight found on this route");
        }
    }



    static void bookFlight(int flightId,String name){
        for(Flight f:flight){
            if(f.flightId == flightId && f.seats>0){
                f.seats--;
                bookings.add(new Booking(bookingCounter++,name,f));
                System.out.println("Booking sucessfull");
                return ;
            }
        }

        System.out.println("No seats available!!!");
    }



    static void viewBookings(){

        if(bookings.isEmpty()) {
            System.out.println("No bookings found");
            return;
        }
        for(Booking b:bookings){
            System.out.println("Booking id: "+b.bookingId+" Passenger name: "+b.passengerName+" Flight id: "+b.flight.flightId+" Route: "+b.flight.source+" to "+b.flight.destination+" Status: "+b.status);

        }
    }


    static void cancelBooking(int bookingId){
        for(Booking b:bookings){
            if(b.bookingId == bookingId && b.status.equalsIgnoreCase("Confirmed")){
                b.status="Cancelled";
                b.flight.seats++;
                System.out.println("booking cancelled");
                return;
            }
        }
        System.out.println("Booking not found or already cancelled");
    }


    public static void trackstatus(int bookingId){
        for(Booking b:bookings){
            if(b.bookingId == bookingId){
                System.out.println("Booking id:"+bookingId+" Status: "+b.status);
                return;
            }
        }
        System.out.println("Booking not found");
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;

        do{

        System.out.println("----Flight booking system----");
        System.out.println("1. Search flight : ");
        System.out.println("2. Book flight :");
        System.out.println("3. View bookings : ");
        System.out.println("4. Cancel booking : ");
        System.out.println("5. Track booking status : ");
        System.out.println("0. Exit");
        System.out.println("Enter choice : ");
        choice=sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                System.out.print("Enter source: ");
                String src = sc.nextLine();
               

                System.out.print("Enter destination: ");
                String dest = sc.nextLine();

                searchFlight(src,dest);
                break;
        

        case 2:
            System.out.print("Enter flight id: ");
            int flightId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter passenger name: ");
            String name = sc.nextLine();

            bookFlight(flightId,name);
            break;

        case 3:
            viewBookings();
            break;

        case 4:
            System.out.print("Enter booking id : ");
            int bookingId = sc.nextInt();
            sc.nextLine();

            cancelBooking(bookingId);
            break;

        case 5:
            System.out.print("Enter booking id : ");
            int trackId = sc.nextInt();
            sc.nextLine();

            trackstatus(trackId);
            break;

        case 0:
            System.out.println("Thank you for using our services");
            break;

        default:
            System.out.println("Invalid choice");
            break;

            
        }


    }while(choice != 0);
}
    
    
}