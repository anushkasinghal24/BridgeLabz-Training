package employee_leave_management_system;

import java.util.*;
public class LeaveManagementSystem{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        LeaveManager manager=new LeaveManager();

        while(true){

            System.out.println("----Employee Leave Management----");
            System.out.println("1. Add Employee");
            System.out.println("2. Apply Leave");
            System.out.println("3. View Leave Requests");
            System.out.println("4. Approve Leave");
            System.out.println("5. Reject Leave");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");


            int choice=sc.nextInt();

            switch(choice){
                case 1:

                System.out.print("Enter Employee Id: ");
                int id = sc.nextInt();

                sc.nextLine();

                 System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Leave Balance: ");
                    int balance = sc.nextInt();

                    manager.addEmployee(new Employee(id, name, balance));
                    break;

                    case 2:

                     System.out.print("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    System.out.print("Enter Leave Days: ");
                    int days = sc.nextInt();

                    try {
                        manager.applyLeave(empId, days);
                    } catch (InsufficientLeaveBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                 case 3:
                    manager.showLeaveRequest();
                    break;

                case 4:
                    System.out.print("Enter request index to approve: ");
                    manager.approveLeave(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter request index to reject: ");
                    manager.rejectLeave(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}