package employee_leave_management_system;

public class Employee{
    private int empid;
    private String name;
    private int leaveBalance;


    public Employee(int empid, String name, int leaveBalance){
        this.empid=empid;
        this.name=name;
        this.leaveBalance=leaveBalance;
    }

    public int getEmpId(){
        return empid;
    }

    public String getName(){
        return name;
    }

    public int getLeaveBalance(){
        return leaveBalance;
    }

    public void deductLeave(int days){
        leaveBalance = leaveBalance-days;
    }

    @Override

    public String toString(){
        return empid+" - "+name+" (Balance: "+leaveBalance+")";
    }
}
