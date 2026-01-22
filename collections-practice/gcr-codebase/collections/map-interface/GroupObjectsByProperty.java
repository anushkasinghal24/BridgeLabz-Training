/*Group Objects by Property
Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].
 */
import java.util.*;

// Enum for Department
enum Department{
    HR, IT, FINANCE, SALES
}

// Employee class
class Employee {

    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment(){
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}


// Main class
public class GroupObjectsByProperty{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // List to store employees
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees : ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Take employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter department (HR / IT / FINANCE / SALES): ");

            String deptInput = sc.nextLine().toUpperCase();

            Department department = Department.valueOf(deptInput);

            employees.add(new Employee(name, department));
        }

        // Map to group employees by department

        Map<Department, List<Employee>> departmentMap = new HashMap<>();

        // Grouping logic
        for (Employee emp : employees) {
            departmentMap
                    .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                    .add(emp);
        }

        // Display result
        System.out.println("\nEmployees Grouped by Department:");
        for (Map.Entry<Department, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        
    }
}
