/*Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20]. */
import java.util.*;

public class RotateList{

    static void reverse(int[] arr, int start, int end){
        while(start<end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of elements  :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements : ");
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();


        }


        System.out.print("Rotate by positions : ");
        int pos = sc.nextInt();

        pos = pos%n;

        reverse(arr, 0, pos-1);
        reverse(arr, pos, n-1);
        reverse(arr, 0, n-1);

        System.out.println("Rotated array is : ");
        System.out.println(Arrays.toString(arr));
    }
}