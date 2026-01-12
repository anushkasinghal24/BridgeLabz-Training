package inventorymanagement;

import java.util.HashMap;
import java.util.Map;

//ConsoleAlertService.java
class ConsoleAlertService implements AlertService{

 @Override
 public void sendLowStockAlert(Product product) {
     System.out.println("[ALERT] Low stock for product: " + product.getName() +
             " (ID: " + product.getId() + "), qty=" + product.getQuantity() +
             ", reorderLevel=" + product.getReorderLevel());
 }
}
//InventoryManagement.java
//Inventory.java


class Inventory {

 private final Map<String, Product> products = new HashMap<>();
 private final AlertService alertService;

 public Inventory(AlertService alertService){
     this.alertService = alertService;
 }

 // Add a new product or replace existing one with same id
 public void addOrUpdateProduct(Product product){
     products.put(product.getId(), product);
 }

 // Add incoming stock
 public void addStock(String productId, int amount){
     Product p = products.get(productId);
     if (p != null) {
         p.addStock(amount);
         checkAndAlertLowStock(p);
     } else {
         System.out.println("Product not found: " + productId);
     }
 }

 // Process outgoing order
 public void processOrder(String productId, int quantity) throws OutOfStockException{
     Product p = products.get(productId);
     if (p == null) {
         throw new OutOfStockException("Product with ID " + productId + " not found.");
     }
     p.reduceStock(quantity);
     checkAndAlertLowStock(p);
 }

 // Check all products for low stock
 public void checkLowStockForAll(){
     for (Product p : products.values()){
         checkAndAlertLowStock(p);
     }
 }

 private void checkAndAlertLowStock(Product p){
     if (p.isLowStock()){
         alertService.sendLowStockAlert(p);
     }
 }

 public void printAllProducts() {
     for (Product p : products.values()){
         System.out.println(p);
     }
 }
}