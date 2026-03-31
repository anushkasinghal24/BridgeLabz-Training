package tablereservationsystem;

public class Table{

    private int tableNumber;
    private int tableCapacity;


    public Table(int tableNumber, int tableCapacity){
        this.tableNumber = tableNumber;
        this.tableCapacity = tableCapacity;
    }


    public int getTableNumber(){
        return tableNumber;
    }

    public int getTableCapacity(){
        return tableCapacity;
    } 

    public void setTableNumber(int tableNumberumber){
        this.tableNumber = tableNumber;
    }


    public void setTableCapacity(int tableCapacity){
        this.tableCapacity = tableCapacity;
    }
}