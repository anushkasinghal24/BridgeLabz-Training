/*ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List. */
import java.util.*;
class Node{
    String stage;
    Node next;

    Node(String stage){
        this.stage = stage;
        this.next = null;
    }
}

class Parcel{

    Node head;

    public void defaultStage(){
        head = new Node("Packed");
        head.next = new Node("Shipped");
        head.next.next = new Node("In transit");
        head.next.next.next = new Node("Delivered");
    }


    public void track(){
        if(head == null){
            System.out.println("No tracking available..parcel lost");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.stage);
            if(temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    
    }



    public void addCheckPoint(String afterStage,String newStage){
        Node temp = head;

        while(temp != null && !temp.stage.equalsIgnoreCase(afterStage)){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Invalid stage");
            return;
        }

        Node newNode = new Node(newStage);
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Check point added");

        }



        public void markLost(){
            if(head != null){
                head = null;
                System.out.println("Parcel lost");
            }

            }
        }
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