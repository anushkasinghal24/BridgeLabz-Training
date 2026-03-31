/*A corporate HR system manages employee profiles with fixed attributes like name and salary, 
requiring distinct role-based bonus calculations for payroll efficiency. 
Create an abstract class Employee with private final fields for name and salary to promote immutability. 
Subclasses Manager and Developer should override a method double getBonus() to compute bonuses (Manager: 10% of salary, Developer: 5% if salary > 50000). 
Optimize performance by caching computed bonuses in final fields where possible.  */
import java.util.Scanner;

// Abstract Employee class
abstract class Employee{
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

// Manager subclass
class Manager extends Employee{
    private final double bonus; // cached bonus

    public Manager(String name, double salary) {
        super(name, salary) ;
        this.bonus = salary *  0.10; // 10% bonus
    }

    @Override
    public double getBonus(){
        return bonus;
    }
}

// Developer subclass
class Developer extends Employee{
    private final double bonus ;  // cached bonus

    public Developer(String name , double salary) {
        super(name , salary);
        this.bonus = (salary > 50000) ? salary * 0.05 : 0.0;
    }

    @Override
    public double getBonus() {
        return bonus ;
    }
}

// Main class
public class EmployeeRolePolymorphism {
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
