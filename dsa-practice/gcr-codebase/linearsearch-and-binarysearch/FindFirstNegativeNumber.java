//Linear Search Algo
/*Problem:
You are given an integer array. Write a program that performs Linear Search to find the first negative number in the array.
If a negative number is found, return its index. 
If no negative number is found, return -1. */

import java.util.*;
public class FindFirstNegativeNumber{

    public static int findingNegative(int arr[]){
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < 0){
                
                return i;
            }
           
        }
        return -1;
        


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        
        

        System.out.println("index having first negative number: "+findingNegative(arr));
    }
    
    
}