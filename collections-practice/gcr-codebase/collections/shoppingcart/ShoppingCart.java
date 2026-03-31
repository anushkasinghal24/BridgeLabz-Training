package shoppingcart;
import java.util.*;

public class ShoppingCart {
	//HashMap - for fast access
	private Map<String , Double> priceMap = new HashMap<>();
	//LinkedHashMap - maintain insertion order 
	private Map<String, Double> cart = new LinkedHashMap<>();
	
	//Add product to cart 
	public void addProduct(Product product) {
		priceMap.put(product.getName(), product.getPrice());
		cart.put(product.getName(), product.getPrice());
		
	}
	// Display items in insertion order
    public void displayCart() {
        System.out.println("\nItems in Cart (Insertion Order):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }
    }
    //Display items sorted by price usign TreeMap
    public void displaySortedByPrice() {
    	TreeMap<Double, List<String>> sortedMap = new TreeMap<>();
    	for(Map.Entry<String , Double > entry : cart.entrySet()) {
    		sortedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
            .add(entry.getKey());
    	}
    	System.out.println("\nItems Sorted by price : ");
    	for(Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
    		for (String product : entry.getValue()) {
                System.out.println(product + " : ₹" + entry.getKey());
            }
    	}
    }

}
