package hotelmanagement;

public abstract class Room {

    protected int roomNumber;
    protected boolean availability = true;
    protected double basePrice;


    public Room(int roomNumber,double basePrice){
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;

    }

    public int  getRoomNumber(){
        return roomNumber;
    }
    public boolean isAvailable(){
        return availability;
    }

    public void checkIn(){
        availability = false;

    }
    public void checkOut(){
        availability = true;

    }

    public abstract String getType();

    
}
