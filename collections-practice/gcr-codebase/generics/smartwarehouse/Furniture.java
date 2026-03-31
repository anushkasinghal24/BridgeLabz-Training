package smartwarehouse;

public class Furniture extends WareHouseItem{
	   public Furniture(String name){
	        super(name);
	    }

	    @Override
	    public String getItemType(){
	        return "Furniture";
	    }

	}
