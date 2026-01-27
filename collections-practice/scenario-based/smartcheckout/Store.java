package smartcheckout;

import java.util.*;

public class Store{
    private HashMap<String, Item> inventory = new HashMap<>();

    public void addItem(String name, double price, int quantity){
         inventory.put(name.toLowerCase(), new Item(name, price, quantity));
    }

    public Item getItem(String name){
        return inventory.get(name.toLowerCase());
    }

    


}
