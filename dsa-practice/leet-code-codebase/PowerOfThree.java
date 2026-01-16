/*Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.
Example 1:
Input: n = 27
Output: true
Explanation: 27 = 33 */

import java.util.*;
public class PowerOfThree {
    public boolean isPowerOfThree(int n){
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PowerOfThree sol = new PowerOfThree();
        boolean result = sol.isPowerOfThree(n);

        if (result) {
            System.out.println(n + " is a power of 3");
        } else {
            System.out.println(n + " is NOT a power of 3");
        }

        
    }
}
