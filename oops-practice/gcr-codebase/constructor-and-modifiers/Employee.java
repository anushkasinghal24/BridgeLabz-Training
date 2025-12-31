/*Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
 */
import java.util.*;


public  class Employee {
	 
	 public int employeeID;
	 protected String department;
	 private double salary;
	 
	 public Employee(int employeeID,String department,double salary) {
		 this.employeeID = employeeID;
		 this.department = department;
		 this.salary = salary;
		 
		 
	 }
	 
	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
	 
	 public double getSalary() {
		 return salary;
	 }
	 
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter employee id : ");
		 int id = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.println("Enter department :  ");
		 String dept = sc.nextLine();
		 
		 System.out.println("Enter salary : ");
		 double salary = sc.nextDouble();
		 
		 Manager manager=new Manager(id,dept,salary);
		 
		 manager.display();
		 
		 System.out.println("Enter new salary");
		 double newSalary = sc.nextDouble();
		 
		 manager.setSalary(newSalary);
		 
		 System.out.println("Updated salary "+ manager.getSalary());
		 
	 }
	 

}
 
 class Manager extends Employee{
	 public Manager(int employeeID,String department,double salary) {
		 super(employeeID,department,salary);
	 }
	 
	 public void display() {
		System.out.println("Employee id "+employeeID);
		System.out.println("Department "+department);
		System.out.println("Salary "+getSalary());
	 }
	 
	
 }
 

 
 