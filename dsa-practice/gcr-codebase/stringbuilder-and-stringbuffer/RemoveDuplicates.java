/*Write a program that uses StringBuilder to remove all duplicate characters from a given string
while maintaining the original order. */
import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> str = new HashSet<>();
        
        System.out.println("Enter a String : ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < input.length() ; i++){
            char ch = input.charAt(i);

            if(!str.contains(ch) ){
                sb.append(ch);
                str.add(ch);

            }



        }
        System.out.println("Output is : " + sb);
        
        
    }
}