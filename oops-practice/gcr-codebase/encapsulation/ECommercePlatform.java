/* E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product. */


import java.util.*;

//Interface for tax calculation
interface Taxable{
    double calculateTax();
    String getTaxDetails();

}



//Abstract product class
abstract class Product{
    private int productId;
    private String productName;
    private double price;
    //Constructor 
    public Product(int productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    //Abstract Method 
    public abstract double calculateDiscount();


    //getters and setters (Encapsulation)

    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;

    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

}

//Electronic class
class Electronics extends Product implements Taxable{
    public Electronics(int productId ,String productName, double price){
        super(productId, productName , price);
    }

    public double calculateDiscount(){
        return getPrice() * 0.10;
    }
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }
    public String getTaxDetails(){
        return "18 % GST Appliesd";
    }
}

//Clothing class
class Clothing extends Product implements Taxable{
    public Clothing(int productId, String productName, double price){
        super(productId , productName, price);
    }

    public double calculateDiscount(){
        return getPrice()* 0.20;

    }

    public double calculateTax(){
        return getPrice() * 0.12;

    }
    public String getTaxDetails(){
        return "12% GST Applied";

    }
}

//Groceries class(No Tax)

class Groceries extends Product{
    public Groceries(int productId, String productName, double price){
        super(productId, productName , price);
    }
    public double calculateDiscount(){
        return getPrice() * 0.05;
    }
}

//Main Class

public class ECommercePlatform{
    //Polymorphism method 
    public static void printFinalPrice(List<Product> productList) {
        for(Product product : productList){
            double tax = 0;
            if(product instanceof Taxable){
                tax = ((Taxable)product).calculateTax();

            }
            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("\nProduct ID : " + product.getProductId());
            System.out.println("Product Name  : " + product.getProductName());
            System.out.println("Base Price : " + product.getPrice());
            System.out.println("Discount : " + discount);
            System.out.println("Tax : " + tax);
            System.out.println("Final Price: " + finalPrice);

            if(product instanceof Taxable){
                System.out.println("Tax Info : " + ((Taxable) product).getTaxDetails());
            }

            System.out.println("========================");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.println("Enter no. of products : ");
        int totalProducts =  sc.nextInt();
        for(int i = 1; i <= totalProducts; i++){
            System.out.println("\nProduct " + i);
            System.out.println("1. Electronics ");
            System.out.println("2. Clothing ");
            System.out.println("3. Graceries ");
            System.out.println("Choose Product Type : ");
            int choice = sc.nextInt();
            System.out.println("Enter Product ID : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("enter Product NAme : ");
            String name = sc.nextLine();
            System.out.println("Enter Product Price : ");
            double price  = sc.nextDouble();

            if(choice == 1 ){
                products.add(new Electronics(id , name , price));

            }else if(choice == 2 ){
                products.add(new Clothing(id , name , price));
            }else if(choice == 3){
                products.add(new Groceries(id , name , price));

            }else{
                System.out.println("Invalid CHoice !");
            }


            


        }
        System.out.println("\n===== Final Price Details =====");
        printFinalPrice(products);


    }

}

