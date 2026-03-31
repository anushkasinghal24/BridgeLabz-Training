package dynamiconlinemarketplace;

import java.util.*;

public class Catalouge{
    private List<Product<? extends Category>> products = new ArrayList<>();
    
    public void addProduct(Product<? extends Category> product){
        products.add(product);
    }

    

    public void displayAll(){
        if(products.isEmpty()){
            System.out.println("Catalogue is empty");
        return;
        }

        for(Product<? extends Category> p: products){
            p.displayProduct();
            System.out.println();
        
        }
    }
}