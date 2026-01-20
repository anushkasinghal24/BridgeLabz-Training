package trafficmanager;

public class CircularRoundAbout{
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
