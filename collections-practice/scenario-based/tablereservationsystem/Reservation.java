package tablereservationsystem;

public class Reservation{

    private int tableNumber;
    private String timeslot;
    private String customerName;

    public Reservation(int tableNumber, String timeslot, String customerName){
        this.tableNumber = tableNumber;
        this.timeslot = timeslot;
        this.customerName = customerName;
    }

    public int getTableNumber(){
        return tableNumber;
    }

    public String getTimeslot(){
        return timeslot;
    }

    public String getCustomerName(){
        return customerName;
     }

     public void setTableNumber(int tableNumber){
        this.tableNumber = tableNumber;
    }

    public void setTimeslot(String timeslot){
        this.timeslot = timeslot;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }


}