/*Problem:
Write a program that uses StringBuilder to reverse a given string.
For example, if the input is "hello", the output should be "olleh". */
import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(sb);

    }
}