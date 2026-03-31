package hotelmanagement;

public class DeluxRoom extends Room {
	  public  DeluxRoom(int roomNumber){
	        super(roomNumber, 2500);

	    }
	    @Override
	    public String getType(){
	        return "Delux";
	    }

	    
	}
