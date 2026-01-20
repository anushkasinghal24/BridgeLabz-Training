package trafficmanager;

/*TrafficManager – Roundabout Vehicle Flow Story: A smart city roundabout allows vehicles to enter and exit dynamically. 
Each vehicle is a node in a Circular Linked List. A Queue manages vehicles waiting to enter. */
import java.util.*;
public class TrafficManager{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircularRoundAbout roundabout = new CircularRoundAbout();
        VehicleQueue queue = new VehicleQueue(5);

        while(true){
            System.out.println("1.Add vehicle to roundabout");
            System.out.println("2.Move vehicle from queue to roundabout");
            System.out.println("3.Remove vehicle from roundabout");
            System.out.println("4.Display roundabout");
            System.out.println("5.Display queue");
            System.out.println("6.Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter vehicle number");
                    String number = sc.next();
                    queue.enqueue(number);
                    break;

                    case 2:
                        String vehicle = queue.dequeue();
                        if(vehicle!=null){
                            roundabout.addVehicle(vehicle);
                        }
                        break;

                        case 3:
                            roundabout.removeVehicle();
                            break;

                            case 4:
                                roundabout.display();
                                break;

                                case 5:
                                    queue.display();
                                    break;

                                    case 6:
                                        System.exit(0);
                                        break;

                                        default:
                                            System.out.println("Invalid choice");
                                            break;
                        
            }

            


        }

        




    }
}