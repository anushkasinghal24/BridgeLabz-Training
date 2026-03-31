import java.util.Scanner;

class Solution {

    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        // Built-in method to find substring
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the haystack string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter the needle string: ");
        String needle = sc.nextLine();

        int result = solution.strStr(haystack, needle);

        if (result != -1) {
            System.out.println("Needle found at index: " + result);
        } else {
            System.out.println("Needle not found (-1)");
        }

        sc.close();
    }
}
