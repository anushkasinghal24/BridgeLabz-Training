package dynamiconlinemarketplace;

public class Product <T extends Category>{
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

     public void setPrice(double price) {
        this.price = price;
    }

   

    

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category.getCategoryName());
    }

}