/*Circular Buffer Simulation
Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
 */
import java.util.*;


class CircularBuffer{
    private int[] buffer;
    private int size;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public CircularBuffer(int size){
        this.size = size;
        buffer = new int[size];
    }

public void insert(int val){
    buffer[rear] = val;

    if(count == size){
        front = (front+1)%size;
    }else{
        count++;
    }
    rear = (rear+1) % size;
    System.out.println(val+" inserted");


    }

    public void display(){
        if(count==0){
            System.out.println("Buffer is empty");
            return;
        }
        System.out.println("Buffer: ");
        for(int i = 0; i<count; i++){
            System.out.println(buffer[(front+i)%size]+" ");
        }
        System.out.println();
    }


} 
 
public class CircularBufferSimulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of buffer: ");
        int size = sc.nextInt();
        CircularBuffer cb = new CircularBuffer(size);

        while(true){
            System.out.println("\n1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter value to insert: ");
                    int val=sc.nextInt();
                    cb.insert(val);
                    break;
                case 2:
                    cb.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}

    