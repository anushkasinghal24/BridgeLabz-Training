
/*Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
*/
package dynamiconlinemarketplace;

import java.util.*;

public class OnlineMarketMain{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Catalouge catalogue=new Catalouge();

        while(true){
            System.out.println("1. Add book");
            System.out.println("2. Add gadget");
            System.out.println("3. Add clothing");
            System.out.println("4. Display all");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice >= 1 && choice <= 3){

                System.out.println("Enter product name");
                String name = sc.nextLine();

                System.out.println("Enter product price");
                double price = sc.nextDouble();
                sc.nextLine();

                Product <?> product = null;

                if(choice == 1){
                    product = new Product<>(name,price,new BookCategory());
                
                }

                else if(choice == 2){
                    product = new Product<>(name,price,new GadgetCategory());
                }
                else{
                    product = new Product<>(name,price,new ClothingCategory());
                }

                Discount.applyDiscount(product,10);

                catalogue.addProduct(product);




            }


            else if(choice==4){
                catalogue.displayAll();
            }
            else if(choice==5){
                System.out.println("exiting");
                break;
            }
            else{
                System.out.println("invalid choice");
                break;
            }
        
        }
    }
}