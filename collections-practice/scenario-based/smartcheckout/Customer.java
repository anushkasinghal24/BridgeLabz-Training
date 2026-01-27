package smartcheckout;

import java.util.*;

public class Customer{
    private String name;
    private List<String> cart = new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }

    public void addItem(String item){
        cart.add(item);
    }

    public String getName(){
        return name;
    
        }

    public List<String> getCart(){
        return cart;
    
    }
}