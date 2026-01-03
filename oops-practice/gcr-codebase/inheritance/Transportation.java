/*Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
 */
import java.util.*;
class Vehicle{
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed,String model){
        this.maxSpeed = maxSpeed;


        this.model = model;
    }

void display(){
    System.out.println();

    System.out.println("Max speed in kmph: " + maxSpeed);


    System.out.println("Model: " + model);

}

}



interface Refuelable{
    void refuel();

}

class Electric extends Vehicle{
    Electric(int maxSpeed,String model){
        super(maxSpeed,model);


    }

    void charge(){
        System.out.println("Charging the electric vehicle");
    }

    }


    class Petrol extends Vehicle implements Refuelable{
    Petrol(int maxSpeed,String model){
        super(maxSpeed,model);


    }

    public void refuel(){
        System.out.println("Refueling the petrol vehicle");
    }

    }


    


public class Transportation{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle type(electric/petrol)");
        String type = sc.nextLine().toLowerCase();

        System.out.println("Enter model");
        String model = sc.nextLine();

        System.out.println("Enter max speed");
        int speed = sc.nextInt();

        if(type.equals("Electric")){
            Electric ev = new Electric(speed,model);
            ev.display();
            ev.charge();
        }

        else if(type.equals("Petrol")){
            Petrol pv = new Petrol(speed,model);
            pv.display();
            pv.refuel();

        }

        else{
            System.out.println("Invalid input");
        }


    
    }
    
}