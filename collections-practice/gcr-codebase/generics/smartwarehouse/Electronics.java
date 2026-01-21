package smartwarehouse;

public class Electronics extends WareHouseItem{
    public Electronics(String name){
       super(name);
   }

   @Override
   public String getItemType(){
       return "Electronics";
   }

}
