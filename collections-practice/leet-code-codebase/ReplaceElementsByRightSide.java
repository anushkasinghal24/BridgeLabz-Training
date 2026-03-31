import java.util.*;

class ReplaceElementsByRightSide {

    // Traverse from right and maintain running maximum
    // Time - O(n)
    // Space - O(1)
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxR = -1;

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxR;
            maxR = Math.max(maxR, current);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = replaceElements(arr);

        System.out.println("Updated array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}