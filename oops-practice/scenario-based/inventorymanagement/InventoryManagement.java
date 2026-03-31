package inventorymanagement;
import java.util.HashMap;
import java.util.Map;
// Main.java 
public class InventoryManagement {
    public static void main(String[] args) {
        AlertService alertService = new ConsoleAlertService();
        Inventory inventory = new Inventory(alertService);

        // Warehouse staff adding products
        Product p1 = new Product("P101", "Laptop", 20, 5);
        Product p2 = new Product("P102", "Mouse", 50, 10);
        inventory.addOrUpdateProduct(p1);
        inventory.addOrUpdateProduct(p2);

        inventory.printAllProducts();

        // Receiving new stock
        inventory.addStock("P101", 5);

        // Processing orders
        try {
            inventory.processOrder("P101", 18); // may trigger low-stock alert
            inventory.processOrder("P102", 45); // may trigger low-stock alert
            // This will throw OutOfStockException if quantity > available
            inventory.processOrder("P101", 10);
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        }

        System.out.println("\nFinal Inventory:");
        inventory.printAllProducts();

        // Manual low stock check
        System.out.println("\nManual low stock scan:");
        inventory.checkLowStockForAll();
    }
}



