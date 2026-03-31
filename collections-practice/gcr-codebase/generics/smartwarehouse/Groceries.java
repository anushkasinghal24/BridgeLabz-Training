package smartwarehouse;

public class Groceries extends WareHouseItem{
    public Groceries(String name){
       super(name);
   }

   @Override
   public String getItemType(){
       return "Groceries";
   }

}