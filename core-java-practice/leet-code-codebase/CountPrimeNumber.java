/* Count Primes
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 

Constraints:

0 <= n <= 5 * 106*/

package leetcode;
import java.util.*;

public class CountPrimeNumber {

    public static int countPrimes(int n){
        if( n <= 2) 
        	return 0;
        boolean[] isPrime =new boolean[n];

        for(int i = 2 ; i <n ; i++){
            isPrime[i] = true;
        }
        
        for(int i = 2 ; i*i <n ; i++){
            if(isPrime[i]){
            	 
                for(int j = i*i; j<n; j = j+i){
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i<n; i++){
            if(isPrime[i]){
                count++;

            }
        }
        return count;


    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int result = countPrimes(number);
        System.out.println(result);

    }
}