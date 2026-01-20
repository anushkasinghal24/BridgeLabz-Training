package parceltracker;

public class Parcel{

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
