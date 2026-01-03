/*Multilevel Inheritance
Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
 */

import java.util.*;
class Order{
    String orderId;
    String orderDate;

    //Constructorof order
    Order(String orderId ,  String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;

    }
    //Method to return order Status
    String getOrderStatus(){
        return "Order Placed";
    } 
}

//First level suubclass
class ShippedOrder extends Order{
    //Additinal attribute for shipped Order
    String trackNumber;

    ShippedOrder(String orderId , String orderDate , String trackNumber){
        super(orderId , orderDate);
        this.trackNumber = trackNumber;

    }

    //Overriding order status 

    String getOrderStatus(){
        return "Order Shipped";

    }
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    DeliveredOrder(String orderId , String orderDate , String trackNumber, String deliveryDate){
        super(orderId , orderDate , trackNumber);
        this.deliveryDate = deliveryDate;

    }

    String getOrderStatus(){
        return "Order Delivered";

    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Order ID : ");
        String orderId = sc.nextLine();

        System.out.println("Enter Order Date : ");
        String orderDate = sc.nextLine();

        System.out.println("Enter Tracking Number : ");
        String trackingNumber = sc.nextLine();
        System.out.println("Enter Delivery Date : ");
        String deliveryDate = sc.nextLine();

        DeliveredOrder order = new DeliveredOrder(orderId , orderDate, trackingNumber, deliveryDate);
        System.out.println("\n -----Order Details -----");
        System.out.println("Order ID : " + order.orderId);
        System.out.println("Order Date : " + order.orderDate);
        System.out.println("Tracking Number : " + order.trackNumber);
        System.out.println("Delivery Date : " + order.deliveryDate);
        System.out.println("Order Status : " + order.getOrderStatus());

    }

    

    
}
