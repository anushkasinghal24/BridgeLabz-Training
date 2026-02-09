package employee_leave_management_system;
import java.util.*;

public class LeaveManager{

    private Map<Integer,Employee> employeeMap = new HashMap<>();
    private List<LeaveRequest> leaveRequests = new ArrayList<>();


    public void addEmployee(Employee emp){
        employeeMap.put(emp.getEmpId(),emp);
        System.out.println("Employee added: "+emp);
    }


    public void applyLeave(int empid,int days) throws InsufficientLeaveBalanceException{
        Employee emp=employeeMap.get(empid);
        if(emp == null){
            System.out.println("Employee not found.");
            return;
        }

        if(days>emp.getLeaveBalance()){
            throw new InsufficientLeaveBalanceException("Not enough leave balance");
        }

        leaveRequests.add(new LeaveRequest(empid,days));
        System.out.println("Leave request submitted");
    }


    public void approveLeave(int index){
        LeaveRequest request=leaveRequests.get(index);
        Employee emp = employeeMap.get(request.getEmpId());

        emp.deductLeave(request.getDays());
        request.approve();
        System.out.println("Leave approved");
    }

    public void rejectLeave(int index){
        leaveRequests.get(index).reject();
        System.out.println("Leave rejected");
    }


    public void showLeaveRequest(){
        for(int i = 0;i<leaveRequests.size();i++){
            System.out.println((i+1)+". "+leaveRequests.get(i));
        }
    }


}
