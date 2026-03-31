/*Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.
Example 1:
Input: n = 16
Output: true */
import java.util.Scanner;
public class PowerOfFour {
    public boolean isPowerOfFour(int n){
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PowerOfFour sol = new PowerOfFour();
        boolean result = sol.isPowerOfFour(n);

        if (result) {
            System.out.println(n +  " is a power of 4");
        } else {
            System.out.println(n +  " is NOT a power of 4");
        }

        
    }
}