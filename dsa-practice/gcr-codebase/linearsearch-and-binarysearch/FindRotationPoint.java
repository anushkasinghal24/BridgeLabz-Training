/*You are given a rotated sorted array. Write a program that performs Binary Search to find the index of the smallest element in the array (the rotation point).
 */
//Binay Search Algo
import java.util.*;

public class FindRotationPoint{


    public static int rotionPoint(int arr[]){

        int left = 0;
        int right = arr.length-1;

        while(left<right){

            int mid = left+(right-left)/2;

            if(arr[mid]>arr[right]){
                left = mid+1;
            }

            else{
                right = mid;
            }

        }
        return left;


    }
    

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int index = rotionPoint(arr);

         System.out.print("The array is: ");
        for(int i = 0; i<n ; i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Rotation point of the array: "+index+" with smallest element: "+arr[index]);
        
    }



}