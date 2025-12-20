package controlflow;
import java.util.*;
public class CheckTheNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number : " );
            int number = sc.nextInt();
            if(number > 0){
                System.out.println("The number " +number+ " is a positive number");

            }else if(number < 0){
                System.out.println("The number " +number+ " is a negative number");

            }else{
                System.out.println("The number " +number+ " is zero ");
            }


            


        }
    }
    

