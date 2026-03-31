
import java.util.*;

//Node Class for linked List 
class Node{
    int key ; 
    int value;
    Node next;

    Node(int key , int value){
        this.key = key;
        this.value = value;
        this.next = next;
    }

}

class CustomHashMap{
    private int size = 10;
    private Node[] table;
    public CustomHashMap(){
        table = new Node[size];

    }

    //Hash Function
    private int hash(int key){
        return key % size;

    }

    //insert or update
    public void put(int key , int value){
        int index = hash(key);
        Node head = table[index];
        Node current = head ; 
        while(current != null){
            if (current.key == key) {
                current.value = value; // update
                System.out.println("Key updated successfully.");
                return;
            }
            current = current.next;
        }

        

    
    Node newNode = new Node(key , value);
    newNode.next = head;
    table[index] = newNode;
    System.out.println("Key Inserted Successfully");

        

}
    

    //retrive
    public Integer get(int key){
        int index = hash(key);
        Node current = table[index];

        while(current != null){
            if(current.key == key){
                return current.value;

            } 
            
        }
        return null;

    }

    //Delete
    public void remove(int key){
            int index = hash(key);
            Node current = table[index];
            Node prev = null;

            while(current != null){
                if(current.key == key){
                    if(prev == null){
                        table[index] = current.next;

                    }else{
                        prev.next = current.next;
                    }
                    System.out.println("Key removed Successfully");
                    return;
                }
                prev = current ;
                current =current.next;
            }
            System.out.println("Key not found ");
        }

        //Display HashMap
        public void display(){
            for(int i  = 0; i < size ; i++){
                System.out.println("Index" + i + ": ");
                Node current = table[i];
                while(current != null){
                    System.out.println("Key: " + current.key + ", Value: " + current.value);
                    current = current.next;
                }
                System.out.println("null");
            }
        }
    } 
        

public class CustomHashMapDemo{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            CustomHashMap map = new CustomHashMap();

             while (true) {
            System.out.println("\n--- Custom HashMap Menu ---");
            System.out.println("1. Insert (Put) ");
            System.out.println("2. Retrieve (Get) ");
            System.out.println("3. Delete (Remove)");
            System.out.println("4. Display HashMap");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int key = sc.nextInt();
                    System.out.print("Enter value : ");
                    int value = sc.nextInt();
                    map.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter key to retrieve : ");
                    key = sc.nextInt();
                    Integer result = map.get(key);
                    if (result != null)
                        System.out.println("Value: " + result);
                    else
                        System.out.println("Key not found");
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextInt();
                    map.remove(key);
                    break;

                case 4:
                    map.display();
                    break;

                case 5:
                    System.out.println("Exiting");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

        }
    }  
}

