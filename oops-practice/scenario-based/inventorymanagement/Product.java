package inventorymanagement;


//Product.java
class Product {
 private final String id;
 private String name;
 private int quantity;
 private int reorderLevel;   // low-stock threshold

 public Product(String id, String name, int quantity, int reorderLevel) {
     this.id = id;
     this.name = name;
     this.quantity = quantity;
     this.reorderLevel = reorderLevel;
 }

 public String getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public int getQuantity() {
     return quantity;
 }

 public int getReorderLevel() {
     return reorderLevel;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setReorderLevel(int reorderLevel) {
     this.reorderLevel = reorderLevel;
 }

 // Increase stock when new items arrive
 public void addStock(int amount) {
     if (amount > 0) {
         this.quantity += amount;
     }
 }

 // Decrease stock when items are sold or dispatched
 public void reduceStock(int amount) throws OutOfStockException {
     if (amount <= 0) {
         throw new IllegalArgumentException("Quantity must be positive.");
     }
     if (amount > this.quantity) {
         throw new OutOfStockException(
             "Requested " + amount + " of " + name +
             " but only " + quantity + " in stock."
         );
     }
     this.quantity -= amount;
 }

 public boolean isLowStock() {
     return quantity <= reorderLevel;
 }

 @Override
 public String toString() {
     return "Product{id='" + id + "', name='" + name + "', qty=" + quantity +
            ", reorderLevel=" + reorderLevel + "}";
 }
}