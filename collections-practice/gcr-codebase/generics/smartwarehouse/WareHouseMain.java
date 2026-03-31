/*Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
*/

package smartwarehouse;

import java.util.*;

public class WareHouseMain{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();

        while(true){
            System.out.println("1. Add electronics");
            System.out.println("2. Add furniture");
            System.out.println("3. Add groceries");
            System.out.println("4. Display all");
            System.out.println("5. Exit");

            int choice=sc.nextInt();
            sc.nextLine();


            if(choice >=1 && choice <=3){
                System.out.println("Enter the name of the item : ");
                String name= sc.nextLine();

                if(choice == 1){
                    electronicsStorage.addItem(new Electronics(name));
                }
                else if(choice == 2){
                    furnitureStorage.addItem(new Furniture(name));
                }
                else{
                    groceriesStorage.addItem(new Groceries(name));
                
                }
            }

                else if(choice == 4){
                    List<WareHouseItem> allItems = new ArrayList<>();
                    allItems.addAll(electronicsStorage.getItems());
                    allItems.addAll(furnitureStorage.getItems());
                    allItems.addAll(groceriesStorage.getItems());

                    WareHouse.displayAll(allItems);

                }

                else if(choice == 5){
                    System.out.println("Exiting the program");
                    break;
                }
                else{
                    System.out.println("Invalid choice");
                }
            }

        }
    }
