
/*A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. 
A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.
Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28. */
import java.util.Scanner;
class PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) { // optimized loop
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PerfectNumber obj = new PerfectNumber();

        if (obj.checkPerfectNumber(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }

        sc.close();
    }
}
