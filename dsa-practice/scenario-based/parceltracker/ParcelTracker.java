/*ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List. */

package parceltracker;
import java.util.*;

public class ParcelTracker{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Parcel tracker = new Parcel();

        tracker.defaultStage();

        while(true){

            System.out.println("Parcel tracker");
            System.out.println("1. Track parcel");
            System.out.println("2. Add check point");
            System.out.println("3. Mark parcel lost");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                tracker.track();
            }
            else if(choice == 2){
                System.out.print("Enter existing stage: ");
                String after = sc.nextLine();

                System.out.print("Enter checkpoint name: ");
                String newStage = sc.nextLine();

                tracker.addCheckPoint(after,newStage);
            }
            else if(choice == 3){
                tracker.markLost();
            }
            else if(choice == 4){
                System.out.println("Exiting");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
            

        }
    }
}
