//package methods;

import java.util.*;
public class FactorAnalysis{
    static int[] getFactor(int num){
        int count = 0;
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0) count++ ;
        }

        int[] fact = new int[count];
        int index = 0;
        for(int i = 1; i <= num; i++)
            if(num%i == 0) fact[index++] =i;
        
        return fact;

    }


    static int greatest(int[] fact){
        return fact[fact.length-1];
    }

    static int sum(int [] fact){
        int sum = 0;
        for(int i:fact) sum = sum+i;
        return sum;
    }

    static int product(int[] fact){
        int prod = 1;
        for(int i:fact) 
            prod = prod*i;
        return prod;



    }

    static double productOfCubes(int[] fact){
        double prod = 1;
        for(int i:fact)
            prod = prod*Math.pow(i,3);
        return prod;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int[] fact = getFactor(num);

        System.out.println("Factors are " + Arrays.toString(fact));
        System.out.println("Greatest factor is " + greatest(fact));
        System.out.println("Sum is " + sum(fact));
        System.out.println("Product is" + product(fact));
        System.out.println("Product of cubes is " + productOfCubes(fact));


    }
}