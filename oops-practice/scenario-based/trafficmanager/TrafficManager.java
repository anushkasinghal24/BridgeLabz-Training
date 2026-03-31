package trafficmanager;

public class TrafficManager {
 private Roundabout roundabout;
 private VehicleQueue waitingQueue;

 public TrafficManager(int roundaboutCapacity, int queueCapacity){
     this.roundabout = new Roundabout(roundaboutCapacity) ;
     this.waitingQueue = new VehicleQueue(queueCapacity);
 }

 // Car arrives: try to enter roundabout; if full, go to queue
 public void arrive(Vehicle v){
     if (!roundabout.tryEnter(v)) {
         waitingQueue.enqueue(v);
     }
 }

 // One car exits; if space becomes free, pull one from queue
 public void processExit(){
     roundabout.exit();
     if (!roundabout.isFull() && !waitingQueue.isEmpty()) {
         Vehicle next = waitingQueue.dequeue();
         if (next != null){
             roundabout.tryEnter(next) ;
         }
     }
 }

 public void printState(){
     roundabout.printState();
     waitingQueue.printQueue();
     System.out.println("-----------------------------");
 }

 // Simple demo
 public static void main(String[] args){
     TrafficManager tm = new TrafficManager(3, 5); // 3 cars inside max, 5 in waiting queue

     tm.arrive(new Vehicle(1, "UP01-AA-1111"));
     tm.arrive(new Vehicle(2, "UP01-AA-2222"));
     tm.arrive(new Vehicle(3, "UP01-AA-3333"));
     tm.arrive(new Vehicle(4, "UP01-AA-4444")); // goes to queue
     tm.arrive(new Vehicle(5, "UP01-AA-5555")); // goes to queue
     tm.arrive(new Vehicle(6, "UP01-AA-6666")); // goes to queue
     tm.arrive(new Vehicle(7, "UP01-AA-7777")); // goes to queue
     tm.arrive(new Vehicle(8, "UP01-AA-8888")); // overflow in queue

     tm.printState();

     tm.processExit(); // one exits, one from queue enters
     tm.printState();

     tm.processExit();
     tm.printState();

     tm.processExit();
     tm.printState();

     // extra exits to show underflow inside + queue empty
     tm.processExit();
     tm.processExit();
 }
}
