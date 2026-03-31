/*Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.
 */

import java.util.*;

interface Discountable{
    void applyDiscount(double percentage);

    String getDiscountDetails();

}


abstract class FoodItem implements Discountable{

    private String itemName;
    private double price;

    private int quantity;
     private double discountAmount = 0;

     public FoodItem(String itemName,double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
     }


     public abstract double calculateTotalBill();

     public void getItemDetails(){
        System.out.println("Item name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discountAmount);
     }

     protected double getBasePrice(){
        return price*quantity;
     }

     protected void setDiscountAmount(double discountAmount){
        this.discountAmount = discountAmount;
     }

     protected double getDiscountAmount(){
        return discountAmount;
     }

     @Override

     public void applyDiscount(double percentage){
        double total = calculateTotalBill();

        discountAmount = total*(percentage/100);
     }

     @Override
     public String getDiscountDetails(){
        return "Discount applied: " + discountAmount;
     }
}



class VegItem extends FoodItem{
     
    public VegItem(String itemName,double price,int quantity){
        super(itemName,price,quantity);
    }

    @Override

    public double calculateTotalBill(){
        return (getBasePrice() ) - getDiscountAmount();
    }
}


class NonVegItem extends FoodItem{

    private static final double EXTRA_CHARGE = 50;
    public NonVegItem(String itemName,double price,int quantity){
        super(itemName,price,quantity);
    }

    @Override

    public double calculateTotalBill(){
        return (getBasePrice() + EXTRA_CHARGE ) - getDiscountAmount();
    }
}

public class OnlinefoodDeliveringSystem{
    public static void processOrder(FoodItem item){
        item.getItemDetails();
        System.out.println(item.getDiscountDetails());
        System.out.println("Total payable: " + item.calculateTotalBill());

        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        List<FoodItem> orderList = new ArrayList<>();

        System.out.println("Enter number of food item :");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i<n;i++){
        System.out.println("Enter details for item: "+(i+1));

            System.out.println("Item name: ");
            String name = sc.nextLine();
           // sc.nextLine();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

                System.out.println("Enter type(1-veg/2-non-veg) : ");
                int type = sc.nextInt();

                sc.nextLine();

               FoodItem item;

                if(type == 1){
                  item = new VegItem(name,price,quantity);

                    
                }
                else{
                    item = new NonVegItem(name,price,quantity);
                }
               

              System.out.println("Apply discount: ");
              double discount = sc.nextDouble();
              sc.nextLine();

              item.applyDiscount(discount);
              orderList.add(item);
            }


              System.out.println("----order summary----");
              for(FoodItem item:orderList){
                processOrder(item);
              }


        }
    }