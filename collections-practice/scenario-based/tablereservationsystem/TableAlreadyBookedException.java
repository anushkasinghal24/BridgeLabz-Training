package tablereservationsystem;

public class TableAlreadyBookedException extends Exception{
    public TableAlreadyBookedException(String message){
        super(message);
    }
}