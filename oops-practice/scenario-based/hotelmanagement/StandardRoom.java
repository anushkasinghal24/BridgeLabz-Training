package hotelmanagement;

public class StandardRoom extends Room 
{
    public StandardRoom(int roomNumber){
        super(roomNumber,1000);
    }
    @Override
    public String getType(){
        return "Standard";
    }
}

