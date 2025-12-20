import java.util.*;
public class CheckTheNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number : " );
            //Take input from the user
            int number = sc.nextInt();
            //Check whether the no. is positive, negative or zero
            if(number > 0){
                System.out.println("The number " +number+ " is a positive number");

            }else if(number < 0){
                System.out.println("The number " +number+ " is a negative number");

            }else{
                System.out.println("The number " +number+ " is zero ");
            }


            


        }
    }
    

