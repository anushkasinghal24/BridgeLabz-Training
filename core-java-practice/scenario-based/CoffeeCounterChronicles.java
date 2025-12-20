//The Coffee Counter Chronicles ☕
//Ravi runs a café. Each customer orders different coffee types with quantities. Write a program
//that:
//● Asks for coffee type (switch)
//● Calculates total bill (price * quantity)
//● Adds GST using arithmetic operators
//Use while to continue for the next customer and break when "exit" is typed.

//package scenariobased;


import java.util.Scanner ;

public class CoffeeCounterChronicles {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in) ;
     // Variable to store total bill amount (without tax initially)
        int totalAmount  = 0 ;
     // Welcome message
        System.out.println("****Welcome to the coffee chronicles****");
        System.out.println() ;
        while(true){
            System.out.println("Your current total bill is (without taxes) : " + totalAmount) ;

            System.out.println("Enter the coffee type as number  :\n 1. Cold Coffee - Rs. 100  \n 2. Hot Coffee - Rs. 200 \n 3. Black Coffee - Rs. 300 \n 4. exit");
            // Take user choice
            int userResponse = sc.nextInt() ;
         // Exit the loop if user selects exit
            if(userResponse == 4 )break ;

            System.out.println("Number of Coffee : ") ;

            int quantity = sc.nextInt() ;
         // Switch case to calculate bill based on coffee type
            switch (userResponse) {
                case 1:
                    totalAmount += 100 * quantity;
                    break;

                case 2:
                    totalAmount += 200 * quantity;
                    break;

                case 3:
                    totalAmount += 300 * quantity;
                    break;
                case 4:

                	System.out.println("*****Thankyou For Visiting Our Coffee Chronicals*****");
                	break;

                default:
                    System.out.println("Please enter valid input");
            }


        }
        //Calculate GST
        float taxes = totalAmount * 0.08f ;
        System.out.println("******Your Total Amount is : "  +  ( totalAmount  + taxes ) +"******") ;



    }
}