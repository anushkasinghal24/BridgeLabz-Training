package ecommerce;

import java.util.*;
public class ECommerceManagement {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product(101,"Laptop",45000);
        Product p2 = new Product(102,"Mobile",15000);
        Product p3 = new Product(103,"HeadPhones",5000);
        Product p4 = new Product(104,"Speaker",4500);
        Product p5 = new Product(105,"Television",25000);

        System.out.println("Welcome to e-commerece");

        System.out.print("Enter yout name:");
        String name=sc.nextLine();

        Customer customer=new Customer(1, name);

        System.out.println("Hello "+customer.getName());
        System.out.println("Available products...");
        System.out.println("1. Laptop: 45000");
        System.out.println("2. Mobile: 15000");
        System.out.println("3. Headphones: 5000");
        System.out.println("4. Speaker: 4500");
        System.out.println("5. Television: 25000");

        System.out.println("Select product(1-5)");

        int choice=sc.nextInt();

        Product selectProduct=null;

        if(choice==1) selectProduct=p1;
         else if(choice==2) selectProduct=p2;
          else if(choice==3) selectProduct=p3;
           else if(choice==4) selectProduct=p4;
            else if(choice==5) selectProduct=p5;
            else {System.out.println("Invalid choice"); return;}

            Order order=new Order(5001, selectProduct);

            System.out.println("Order placed for "+selectProduct.getName());

            System.out.println("Choose payment mode ");
            System.out.println("1. Card");
             System.out.println("2. Wallet");
              System.out.println("3. Upi");

              int payChoice=sc.nextInt();

              Payment payment;

              if(payChoice==1) payment=new CardPayment();
              else if(payChoice==2) payment=new WalletPayment();
              else payment=new UPIPayment();
             
              try{
                payment.pay(order.getAmount());

              }
              catch(PaymentFailedException e){
                    System.out.println("Payment failed "+e.getMessage());
              }

              System.out.println("1. Track Order");
              System.out.println("2. Cancel Order");
              System.out.println("Choose");
              int option=sc.nextInt();

              if(option==1){
                order.trackOrder();
                return;
              }
              else{
                order.cancelOrder();

              }


    }
    
}
