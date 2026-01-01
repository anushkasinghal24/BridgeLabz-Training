
import java.util.*;


class Employee {
	
	private static String companyName= "BridgeLabz";
	private final int id;
	private String name;
	private String designation;
	private static int totalEmployees = 0;
	
	public Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		totalEmployees++;
		
	}

	public static void displayTotalEmployees() { 
		System.out.println("the total number of employees are " + totalEmployees);
		
		
	}
	
	
	public  void displayEmployeeDetails() {
		if(this instanceof Employee) {
			System.out.println("Company name: "+ companyName);
			
			System.out.println("Employee id: "+ id);
			System.out.println("Name: "+ name);
			System.out.println("Designation: "+ designation);
			
		}else {
			System.out.println("Invalid employee");
		}
		
	}
	
	
	

	
}
public class EmployeeManagementSystem{
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of employees");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		Employee[] employee = new Employee[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter employee details "+(i+1));
			
			System.out.println("Enter employee id : ");
			int id = sc.nextInt();
			sc.nextLine();
			
			
			System.out.println("Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter designation ");
			String designation = sc.nextLine();
			
			employee[i] = new Employee(id,name,designation);
		}
		
		System.out.println();
		Employee.displayTotalEmployees();
		
		for(int i = 0;i<n;i++) {
			employee[i].displayEmployeeDetails();
		}
		
		
		
	}
}