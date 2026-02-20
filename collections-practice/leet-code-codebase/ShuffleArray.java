import java.util.*;

class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];

        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n + i];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = shuffle(nums, n);

        System.out.println("Shuffled array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}