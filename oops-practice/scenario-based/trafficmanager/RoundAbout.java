package trafficmanager;


//Roundabout implemented as a circular singly linked list
class Roundabout {
private Vehicle last ;          // reference to last node in circular list
private int size;
private final int maxCapacity;      // max cars allowed in roundabout

Roundabout(int maxCapacity){
   this.maxCapacity = maxCapacity;
}

public boolean isFull() {
   return size == maxCapacity;
}

public boolean isEmpty() {
   return size == 0;
}

// low-level: insert car into circular list at "end"
private void addCarInternal(Vehicle v){
   if (last == null){ // empty list
       last = v;
       v.next = v; // points to itself
       
   } else{
       v.next = last.next; // new car points to first
       last.next = v;      // old last points to new
       last = v;           // new last
   }
   size++;
}

// car exits from "front" (node after last)
private Vehicle removeCarInternal() {
   if (isEmpty()) {
	   
       return null;
   }
   Vehicle first = last.next;
   if (first == last) { // only one car
       last = null;
   } else {
       last.next = first.next; // skip the first
   }
   
   first.next = null; // detach
   size--;
   return first;
}

// API used by TrafficManager
public boolean tryEnter(Vehicle v) {
	
   if (isFull()) {
       return false;
   }
   addCarInternal(v);
   System.out.println(v + " entered roundabout.");
   return true;
}

public Vehicle exit() {
   Vehicle v = removeCarInternal();
   if (v != null) {
       System.out.println(v + " exited roundabout.");
   } else {
       System.out.println("No car inside roundabout to exit.");
   }
   return v;
}

public void printState() {
	
   if (isEmpty()) {
       System.out.println("Roundabout: EMPTY");
       return;
   }
   System.out.print("Roundabout: ");
   Vehicle curr = last.next; // first car
   do {
       System.out.print(curr + " -> ");
       curr = curr.next;
   } while (curr != last.next);
   System.out.println("(back to start)");
}
}
