/*Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods */
import java.util.*;

class Employee{
	String name;
	int id; 
	double salary;
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Salary: "+salary);
	}
}

class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary, int teamSize){
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	@Override
	
	void display() {
		super.display();
		System.out.println("Role   : manager");
		System.out.println("Teamsize: "+teamSize);
	}
	
}

class Developer extends Employee{
	String programmingLang;
	Developer(String name,int id,double salary, String programmingLang){
		super(name, id , salary);
		this.programmingLang = programmingLang;
	}
	
	@Override
	
	void display() {
		super.display();
		System.out.println("Role        : developer");
		System.out.println("Programming language: " + programmingLang);
	}
	
}


class Intern extends Employee{
	int months;
	Intern(String name,int id,double salary, int months){
		super(name,id,salary);
		this.months = months;
	}
	
	@Override
	
	void display() {
		super.display();
		System.out.println("Role        : intern");
		System.out.println("Intern duration in months: " + months);
	}
	
}


public class EmployeeManagementSystem{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee type(manager/developer/intern):");
		String type = sc.nextLine();
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		Employee employee = null;
		
		switch (type) {
		case "manager":
			System.out.println("Enter team size");
			int teamSize=sc.nextInt();
			employee=new Manager(name,id,salary,teamSize);
			break;
		case "developer":
			System.out.println("Enter programming lanaguage");
			String programming=sc.nextLine();
			employee = new Developer(name,id,salary,programming);
			break;
		case "intern":
			System.out.println("Enter duration");
			int month = sc.nextInt();
			employee = new Intern(name,id,salary,month);
			break;
			
			default:
				System.out.println("Invaild input");break;
			
			
		}
		
		System.out.println("Employee details");
		employee.display();
		
	}
}