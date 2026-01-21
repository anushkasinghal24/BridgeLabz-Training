package smartwarehouse;

import java.util.*;

public class Storage<T extends WareHouseItem>{
    private List<T> items=new ArrayList<>();

  public void addItem(T item){
    items.add(item);
    System.out.println(item.getName()+" added to the storage");
  }

  public List<T> getItems(){
    return items;
  }

  

  }
