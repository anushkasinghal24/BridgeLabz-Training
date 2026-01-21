/*Problem Statement:
Design a Personalized Meal Plan Generator where users can choose different meal categories like Vegetarian, Vegan, Keto, or High-Protein. 
The system should ensure only valid meal plans are generated*/
package personalizedmealplangenerator;

import java.util.*;

public class MealMain{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        while(true){

            System.out.println("Personalized meal plan generator ");
            System.out.println("----------------------------------");
            System.out.println("1.High protien meal");
            System.out.println("2.Vegetarian meal");
            System.out.println("3.Vegan meal");
            System.out.println("4.Keto Mmeal");
            System.out.println("5.Exit");


            System.out.print("Choose meal type: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    MealGenerator.generateMeal(new HighProteinMeal());
                    break;
                case 2:
                    MealGenerator.generateMeal(new VegMeal());
                    break;
                case 3:
                    MealGenerator.generateMeal(new VeganMeal());
                    break;
                case 4:
                    MealGenerator.generateMeal(new KetoMeal());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
