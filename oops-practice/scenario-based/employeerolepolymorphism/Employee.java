/*A corporate HR system manages employee profiles with fixed attributes like name and salary, 
requiring distinct role-based bonus calculations for payroll efficiency. 
Create an abstract class Employee with private final fields for name and salary to promote immutability. 
Subclasses Manager and Developer should override a method double getBonus() to compute bonuses (Manager: 10% of salary, Developer: 5% if salary > 50000). 
Optimize performance by caching computed bonuses in final fields where possible.  */

package employeerolepolymorphism;
import java.util.Scanner;

//Abstract Employee class
public abstract class Employee{
 private final double salary;
 private final String name;

 public Employee(String name, double salary){
     this.name = name;
     this.salary = salary;
 }

 public double getSalary(){
     return salary;
 }

 public String getName(){
     return name;
 }

 // Abstract method
 public abstract double getBonus();
}