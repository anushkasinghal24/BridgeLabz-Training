package ecommerce;

public class UPIPayment implements Payment{
    public void pay(double amount){
         System.out.println("paid Rs. " + amount+" using upi");
    }
    }
