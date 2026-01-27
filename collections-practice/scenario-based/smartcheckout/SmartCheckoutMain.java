package smartcheckout;

import java.util.*;

public class SmartCheckoutMain{

    private static Queue<Customer> queue = new LinkedList<>();
    private static Store store = new Store();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        store.addItem("Milk",50,5);
        store.addItem("Bread",30,10);
        store.addItem("Eggs",6,20);
        store.addItem("Juice",80,7);


        while(true){   
            System.out.println("----Smart checkout----");
            System.out.println("1. Add customer");
            System.out.println("2. Process customer");
            System.out.println("3. View queue");
            System.out.println("4. Exit");

            int choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1-> addCustomer();
                case 2-> processCustomer();
                case 3-> viewQueue();
                case 4-> System.exit(0);
                default-> System.out.println("Invalid choice");
            }
        

            

        }
    }

    private static void addCustomer(){
        System.out.print("enter customer name: ");
        String name=sc.nextLine();
        Customer customer=new Customer(name);

        System.out.print("enter items to add to cart (or enter exit): ");
        while(true){
            String item=sc.nextLine();
            if(item.equalsIgnoreCase("exit")){
                break;
            }
            if(store.getItem(item)!=null){
                customer.addItem(item);
            }
            else{
                System.out.println("item not found");
            }
        }
        queue.add(customer);
        System.out.println("customer added to queue");
     }

     private static void processCustomer(){
        if(queue.isEmpty()){
            System.out.println("no customers in queue");
            return;
        }

        Customer c=queue.poll();
        System.out.println("processing customer: "+c.getName());

        double total=0;
        for(String item:c.getCart()){
            Item i=store.getItem(item);


            if(i.getQuantity()>0){
                    total+=i.getPrice();
                    i.reduceQuantity();
            }
            else{
                System.out.println("out of stock");
            }
        

        }

        System.out.println("total: "+total);
     }

     private static void viewQueue(){

        if(queue.isEmpty()){
            System.out.println("no customers in queue");
            return;
        }

        System.out.println("queue: ");
        for(Customer c:queue){
            System.out.println(c.getName());
        }

    }




            
}