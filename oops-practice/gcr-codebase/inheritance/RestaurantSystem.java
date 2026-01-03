/*Hybrid Inheritance (Simulating Multiple Inheritance)
Since Java doesn’t support multiple inheritance directly, hybrid inheritance is typically achieved through interfaces.
Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
 */
import java.util.*;

//Super class
class Person{
    String name;
    int id;

    //Constructor of person 
    Person(String name , int id){
        this.name = name;
        this.id = id;

    }
    //method to dosplay basic details
    void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);

    }


}

//interface
interface Worker{
    //Abstract method 
    void performDuties();
    
}

class Chef extends Person implements  Worker{
    String speciality;

    public Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;

    }

    //implementing performduties 
    public void performDuties(){
        System.out.println("Role : Chef");
        System.out.println("Speciality : " + speciality);
        System.out.println("Duties: Preparing and cooking meals.");

    }

    
}

class Waiter extends Person implements  Worker{

    int countTable;

    //constructor of waiter
    Waiter (String name , int id , int countTable){
    super(name , id);
    this.countTable = countTable;
    }

    //Implementing performDuties()

    public void performDuties(){
        System.out.println("Role : Waiter");
        System.out.println("Table Assignes : " + countTable);
        System.out.println("Duties : Serving food and assisting customers");

    }

}
public class RestaurantSystem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Chef Details ");
        System.out.println("Name : ");
        String chefName = sc.nextLine();

        System.out.println("Id : ");
        int chefId = sc.nextInt();

        sc.nextLine();

        System.out.println("Specialilty : ");
        String speciality = sc.nextLine();

        Chef chef = new Chef(chefName , chefId , speciality);


        //Waiter input 
        System.out.println("\nEnter Waiter Details");
        System.out.println("Name : ");
        String waiterName = sc.nextLine();

        System.out.println("Id : ");
        int waiterId = sc.nextInt();

        System.out.println("Number of tables assignes : ");
        int countTable = sc.nextInt();

        Waiter waiter = new Waiter(waiterName , waiterId , countTable);

        System.out.println("\n ======= CHef Information =======");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\n ++++++ Waiter Information +++++++");
        waiter.displayDetails();
        waiter.performDuties();




    }
    
}