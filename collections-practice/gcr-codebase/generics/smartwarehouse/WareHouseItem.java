package smartwarehouse;

public abstract class WareHouseItem{
    private String name;

    public WareHouseItem(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }
    public abstract String getItemType();
}