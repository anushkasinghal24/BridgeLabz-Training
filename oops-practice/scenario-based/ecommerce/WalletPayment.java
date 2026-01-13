package ecommerce;

public class WalletPayment implements Payment{
    public void pay(double amount){
         System.out.println("Paid Rs. " + amount+" using wallet");
    }
    }

