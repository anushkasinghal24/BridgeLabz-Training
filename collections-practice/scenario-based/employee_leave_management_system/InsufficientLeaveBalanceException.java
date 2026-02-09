package employee_leave_management_system;

public class InsufficientLeaveBalanceException extends Exception{
    public InsufficientLeaveBalanceException (String message){
        super(message);
    }
}