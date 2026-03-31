package smartwarehouse;
import java.util.*;

public class WareHouse{

    public static void displayAll(List<? extends WareHouseItem> items){
        if(items.isEmpty()){
            System.out.println("No items in warehouse");
            return;
        }

        System.out.println("Warehouse item");
        for(WareHouseItem item: items){
            System.out.println(item.getName()+" ( "+item.getItemType()+" )");
        }
    
        }
    }