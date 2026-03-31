package trafficmanager;

class Vehicle{
	 int id;
	 String plate;
	 Vehicle next; // used only inside roundabout (circular linked list)

	 Vehicle(int id, String plate){
	     this.id = id;
	     this.plate = plate;
	 }

	 @Override
	 public String toString(){
	     return "Car{" + id + ", " + plate + "}";
	 }
	}