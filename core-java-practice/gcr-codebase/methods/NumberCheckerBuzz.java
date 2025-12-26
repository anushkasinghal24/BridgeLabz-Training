//package methods;

import java.util.*;
public class NumberCheckerBuzz{
    public static boolean primeCheck(int num){
        if(num <= 1) return false;
        for(int i = 2 ; i <= Math.sqrt(num) ; i++)
            if( num%i == 0 ) return false;
        return true;
    }


    public static boolean neonCheck(int num){
        int square = num*num;
        int sum = 0;
        while(square > 0){
            sum = sum + square%10;
            square = square/10;
        }

        return sum == num;
    }


    public static boolean spyCheck(int num){
        int sum = 0;
        int product = 1;
        while(num>0){
            int digit = num%10;
            sum = sum+digit;
            product = product*digit;
            num = num/10;
        }

        return sum == product;
    }


    public static boolean automorphicCheck(int num){
        int square = num*num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean buzzCheck(int num){
        return  (num%7 == 0||num%10 == 7);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter");
        int num = sc.nextInt();

        System.out.println("Prime check "+ primeCheck(num));
        System.out.println("Neon check "+ neonCheck(num));
        System.out.println("Spy check "+ spyCheck(num));
        System.out.println("Automorphic check "+ automorphicCheck(num));
        System.out.println("Buzz check "+ buzzCheck(num));
    }
}