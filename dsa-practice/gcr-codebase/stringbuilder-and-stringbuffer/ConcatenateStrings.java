/*You are given an array of strings.
Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
 */
import java.util.*;
public class ConcatenateStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sbf = new StringBuffer();
        System.out.println("Enter number of Strings : ");
        int len = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[len];
        System.out.println("Enter String : ");
        

        
        for(int i = 0; i< len; i++){
            arr[i] = sc.nextLine();
            
            

        }
        //Concatenate using Stringbuffer
        for (int i = 0; i< len; i++) {
            sbf.append(arr[i]);
            
        }
        System.out.println("Output is : " + sbf);


        
    }
}