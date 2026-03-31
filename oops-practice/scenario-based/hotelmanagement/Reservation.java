package hotelmanagement;

public class Reservation{
    private Room room;
    private Guest guest;

    public Reservation(Room room,Guest guest){
        this.room=room;
        this.guest=guest;

    }

    public Room getRoom(){
        return room;
    }

    public Guest getGuest(){
        return guest;
    }
}