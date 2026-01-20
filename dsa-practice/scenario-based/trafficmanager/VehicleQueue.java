package trafficmanager;


public class VehicleQueue{
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