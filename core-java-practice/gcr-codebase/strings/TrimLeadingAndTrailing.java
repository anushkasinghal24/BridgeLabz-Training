/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/



import java.util.Scanner;

public class TrimLeadingAndTrailing{

    static int[] locateBounds(String text) {
    	//Initialize start and end index 
        int startIndex = 0;
        int endIndex = text.length() - 1;
     // Move start forward while there are leading spaces
        while (startIndex <= endIndex && text.charAt(startIndex) == ' ') {
            startIndex++;
        }

        while (endIndex >= startIndex && text.charAt(endIndex) == ' ') {
            endIndex--;
            
        }return new int[]{startIndex, endIndex};

        
    }
    /*
    This method creates a substring using charAt()
    from the given start index to end index.
   */
    static String buildSubstring(String text1, int from, int to) {

        String result = "";
        

        for (int i = from; i <= to; i++) {
            result = result + text1.charAt(i);
        }

        //Return the constructed subString
        return result;
    }

    static boolean matchStrings(String a, String b) {

        if (a.length() != b.length()) {
            return false;
            
        }
        //Compareeach character of both strings
        for (int i =  0; i  < a.length();  i++) {
            if (a.charAt(i)  !=  b.charAt(i)) {
                return false;
            }
        }return true;
        
    }
    //Main method execution starts here

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        int[] range = locateBounds(input);
        String customTrim =  buildSubstring(input ,  range[0] , range[1]);
        String builtInTrim =  input.trim(); //Trim string using Java's built-in trim() method

        boolean status =  matchStrings(customTrim, builtInTrim);

        System.out.println (customTrim);
        
        System.out.println  (status);

        sc.close();
    }
}