/*1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
 */
import java.util.*;
//Interface 
interface Department{
    void assignDepartment(String departemtNAme);
    String getDepartmentDetails();

}

//Abstract Employee Class 
abstract class Employee implements Department{
    private int empID;
    private String empName;
    private double baseSalary;
    private String department;

    //Constructor 
    public Employee(int empID, String empName, double baseSalary){
        this.empID = empID;
        this.empName = empName;
        this.baseSalary = baseSalary;



    }
    //Abstract Method
    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee Id : " +empID);
        System.out.println("Employee Name  : " + empName);
        System.out.println("Department : " + department);
        System.out.println("Final Salary : " + calculateSalary());
    }

    //Getetrs and Setters 
    public int getEmployeeId(){
        return empID;

    }
    public String getEmployeeName(){
        return empName;
    }
    public double getBaseSalary(){
        return baseSalary;

    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //Interface methods 
    //Override 
    public void assignDepartment(String departmentName){
        this.department = departmentName;
    }
    public String getDepartmentDetails(){
        return department;
    }



}

//Full time employee class 
class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int empID , String empName , double baseSalary){
        super(empID, empName, baseSalary);

    }
    public double calculateSalary(){
        return getBaseSalary();

    }
}

//Part time emp class
class PartTimeEmployee extends Employee{
    private int workingHours;
    private double hourlyRate;

    public  PartTimeEmployee(int empID, String empName , int workingHours, double hourlyRate){
        super(empID, empName , 0);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;

    }
    public double calculateSalary(){
        return workingHours * hourlyRate;
    }
}

// Main class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int totalEmployees = scanner.nextInt();

        for (int i = 1; i <= totalEmployees; i++){

            System.out.println("\nEmployee " + i);
            System.out.println("1. Full Time Employee ");
            System.out.println("2. Part Time Employee ");
            System.out.print("Choose employee type : ");
            int choice = scanner.nextInt();

            System.out.print("Enter Employee ID : ");

            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Employee Name : ");

            String name = scanner.nextLine();

            System.out.print("Enter Department Name : ");

            String department = scanner.nextLine();

            if (choice == 1){
                System.out.print("Enter Base Salary: ");
                double salary = scanner.nextDouble();

                Employee fullTimeEmployee = new FullTimeEmployee(id, name, salary);
                fullTimeEmployee.assignDepartment(department);
                employeeList.add(fullTimeEmployee);

            } else if (choice == 2){
                System.out.print("Enter Working Hours: ");

                int hours = scanner.nextInt();

                System.out.print("Enter Hourly Rate: ");

                double rate = scanner.nextDouble();

                Employee partTimeEmployee = new PartTimeEmployee(id, name, hours, rate);
                partTimeEmployee.assignDepartment(department);
                employeeList.add(partTimeEmployee);

            } else{
                System.out.println("Invalid choice !!!!");
            }
        }

        System.out.println("\n===== Employee Details =====");
        for (Employee employee : employeeList){
            employee.displayDetails(); // Polymorphism
        }

        scanner.close();
    }
}



