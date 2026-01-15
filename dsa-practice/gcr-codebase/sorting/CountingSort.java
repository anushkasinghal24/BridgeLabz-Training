/* Counting Sort - Sort Student Ages
Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
 */

import java.util.*;
public class CountingSort {
    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];

        // Store the count of each age
        for(int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Change count[i] so that it contains the actual position of this age in output[]
        for(int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for(int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted ages
        for(int i = 0; i < arr.length; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int[] arr = new int[5];
        System.out.println("Enter 5 student ages (between 10 and 18) : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        countingSort(arr, 10, 18);
        System.out.println("Sorted student ages: ");
        System.out.println(Arrays.toString(arr));
    }
}

/*Time Complexity:
Best Case: O(n + k)
Average Case: O(n + k)
Worst Case: O(n + k)
Space Complexity: O(k), where k is the range of the input (max - min + 1)
*/