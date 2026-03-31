// Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
// Hint => 
// Spring Season is from March 20 to June 20


//package controlflow;
import java.util.*;
public class SpringSeason {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month : ");
        int month = sc.nextInt();
        System.out.println("Enter day : ");
        int day = sc.nextInt();
        //Spring season is from March 20 to June 20
        if((month >= 3 && day >=20) && (month <=6 && day >=20) ){
            System.out.println("It's a Spring season");

        }else{
            System.out.println("Not a Spring season");
        }
    }
    
}
