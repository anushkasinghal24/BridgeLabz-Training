package employeerolepolymorphism;
import java.util.*;
//Main class
public class EmployeeRole {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter employee role (Manager/Developer) : ");
     String role = sc.next();

     System.out.print("Enter employee name : ");
     String name = sc.next();

     System.out.print("Enter salary : ");
     double salary = sc.nextDouble();

     Employee employee;

     if (role.equalsIgnoreCase("Manager")) {
         employee = new Manager(name, salary);
     } else if (role.equalsIgnoreCase("Developer")) {
         employee = new Developer(name, salary);
     } else {
         System.out.println("Invalid role!!!!!!!!!");
         sc.close();
         return;
     }

     // Polymorphic call
     System.out.printf("Bonus: %.2f%n", employee.getBonus());

     sc.close();
 }
}
