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

 class Vehicle{
    String number;
    Vehicle next;

    public Vehicle(String number){
        this.number = number;
        this.next = null;
    }
    }
 class VehicleQueue{
    private String[] queue;
    private int front=0,rear=-1,size=0,capacity;


    public VehicleQueue(int capacity){
        this.capacity = capacity;

        queue = new String[capacity];
    

    }

    public void enqueue(String number){
        if(size == capacity){
            System.out.println("Queue is full");

            return;


        }
        rear=(rear+1)%capacity;
        queue[rear]=number;
        size++;
        System.out.println(number  + " entered queue");




    }


    public String dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return null;
        }

            String vehicle=queue[front];

            front = (front+1)%capacity;

            size--;
            return vehicle;

        }


        public boolean isEmpty(){

            return size == 0;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");

                return;
            }

            System.out.println("Waiting queue");
            for(int i = 0; i<size; i++){
                System.out.println(queue[(front+i)%capacity]+"->");

            }
            System.out.println();

        }

        



 }
  class CircularRoundAbout{
    private Vehicle tail = null;

    public void addVehicle(String number){
        Vehicle newVehicle = new Vehicle(number);

        if(tail == null){
            tail = newVehicle;

            tail.next = tail;
        }else{
            newVehicle.next = tail.next;

            tail.next = newVehicle;

            tail = newVehicle;
        
        }
        System.out.println(number+" entered roundabout");

    }


    public void removeVehicle(){
        if(tail == null){
            System.out.println("No vehicles in roundabout");
            return ;

        }

        Vehicle head = tail.next;

        if(head == tail){
            System.out.println(head.number+" exited roundabout");

            tail = null;

        }
        else{
            System.out.println(head.number+" exited roundabout");

            tail.next = head.next;


        }
    }

    public void display(){
        if(tail == null){
            System.out.println("Roundabout empty");
            return;
        }

        System.out.println("Roundabout");
        Vehicle temp=tail.next;

        do{


            System.out.println(temp.number+"->");
            temp = temp.next;


    }
    while(temp != tail.next);
    System.out.println("back to start");

}

public boolean isEmpty(){
    return tail == null;

}
}
