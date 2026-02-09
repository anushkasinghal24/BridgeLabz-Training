package employee_leave_management_system;

public class LeaveRequest{
    private int empid;
    private int days;
    private String status;

    public LeaveRequest(int empid, int days){
        this.empid = empid;
        this.days = days;
        this.status = "PENDING";
    }

    public int getEmpId(){
        return empid;
    }

    public int getDays(){
        return days;
    }

    public String getStatus(){
        return status;
    }

    public void approve(){
        status = "APPROVED";
    }

    public void reject(){
        status = "REJECTED";
    }

    @Override
    public String toString(){
        return "EmpId: "+empid+" | Days: "+days+" | Status: "+status;
    }
}