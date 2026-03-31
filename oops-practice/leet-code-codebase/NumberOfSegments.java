//Find no. of segments in a string
/*Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.

 

Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"] */
import java.util.Scanner;
class NumberOfSegments{
    public int countSegments(String s){

        int count = 0;

        boolean inSegment = false;

        for (char c : s.toCharArray()){
            if (c != ' ' && !inSegment){
                count++;
                inSegment = true;
            }else if (c == ' ') {
                inSegment = false;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter a string : ");
        String input = sc.nextLine();

        NumberOfSegments obj = new NumberOfSegments();
        int result = obj.countSegments(input);

        System.out.println(" Number of segments : " + result);
    }
}