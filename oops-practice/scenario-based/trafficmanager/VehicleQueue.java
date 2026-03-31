package trafficmanager;

class VehicleQueue {
	 private Vehicle[] arr;
	 private int front;
	 private int rear;
	 private int size;
	 private final int capacity;

	 VehicleQueue(int capacity) {
	     this.capacity = capacity;
	     this.arr = new Vehicle[capacity];
	     this.front = 0;
	     this.rear = -1;
	     this.size = 0;
	 }

	 public boolean isFull() {
	     return size == capacity;
	 }

	 public boolean isEmpty() {
	     return size == 0;
	 }

	 public void enqueue(Vehicle v) {
	     if (isFull()) {
	         System.out.println("Queue overflow: cannot add " + v);
	         return;
	     }
	     rear = (rear + 1) % capacity;
	     arr[rear] = v;
	     size++;
	     System.out.println(v + " joined waiting queue.");
	 }

	 public Vehicle dequeue() {
	     if (isEmpty()) {
	         System.out.println("Queue underflow: no waiting vehicles.");
	         return null;
	     }
	     Vehicle v = arr[front];
	     front = (front + 1) % capacity;
	     size--;
	     return v;
	 }

	 public void printQueue() {
	     if (isEmpty()) {
	         System.out.println("Waiting Queue: EMPTY");
	         return;
	     }
	     System.out.print("Waiting Queue: ");
	     for (int i = 0; i < size; i++) {
	         int idx = (front + i) % capacity;
	         System.out.print(arr[idx] + (i < size - 1 ? " <- " : ""));
	     }
	     System.out.println();
	 }
	}