package tablereservationsystem;

import java.util.*;

public class RestaurantServiceMain{

    public static void main(String[] args) {
        RestaurantBookingService service = new RestaurantBookingService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Reserve a table");
            System.out.println("2. Cancel a reservation");
            System.out.println("3. Show available tables");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try{
                switch (choice) {
                    case 1:
                        System.out.print("Enter table number: ");
                        int tableNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter timeslot (e.g. 10:00 AM): ");
                        String timeslot = sc.nextLine();
                        System.out.print("Enter customer name: ");
                        String customerName = sc.nextLine();
                        service.reserveTable(tableNumber, timeslot, customerName);
                        break;


                        case 2:
                            System.out.print("Enter table number: ");
                            tableNumber = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter timeslot (e.g. 10:00 AM): ");
                            timeslot = sc.nextLine();
                            service.cancelReservation(tableNumber, timeslot);
                            break;

                            case 3:
                                System.out.print("Enter timeslot (e.g. 10:00 AM): ");
                                timeslot = sc.nextLine();
                                service.showAvailableTables(timeslot);
                                break;

                                case 4:
                                    System.out.println("Exiting...");
                                    System.exit(0);
                                    break;

                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                        break;  


            }




        }
        catch(TableAlreadyBookedException e){
            System.out.println(e.getMessage());
        }

    }

        }

}
