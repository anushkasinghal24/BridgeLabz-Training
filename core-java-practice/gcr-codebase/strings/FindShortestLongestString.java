/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/


//4
import java.util.Scanner;

public class FindShortestLongestString {

    static int sizeOf(String value) {
        int n = 0;
        try {
            while (true) {
                value.charAt(n);
                n++;
            }
        } 
        catch (Exception e) {
        }
        return n;
    }

    static String[] breakTheText(String sentence) {

        int len = sizeOf(sentence);
        int count =  1 ;

        for (int i = 0; i < len; i++) {
        	
            if (sentence.charAt(i) == ' ') {
            	
                count++;
            }
        }

        String[] words = new String[count];
        int start = 0, idx = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || sentence.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++) {
                    w += sentence.charAt(j);
                }
                words[idx++] = w;
                start = i + 1;
            }
        }
        return words;
    }

    static String[][] mapLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(sizeOf(words[i]));
        }
        return data;
    }

    static int[] findLimits(String[][] info) {

        int minValue = 0, maxValue = 0;

        for (int i = 1; i < info.length; i++) {
        	
            int val = Integer.parseInt(info[i][1]);

            if (val < Integer.parseInt(info[minValue][1])) {
                minValue = i;
            }
            if (val > Integer.parseInt(info[maxValue][1])) {
                maxValue = i;
            }
        }
        return new int[]{minValue, maxValue};
    }

    public static void main(String[] args) {
    	//Taking user Input
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = breakTheText(input);
        String[][] table = mapLength(words);
        int[] result = findLimits(table);
        //Display Result 
        System.out.println("Shortest Word is: " + table[result[0]][0]);
        System.out.println("Longest Word is: " + table[result[1]][0]);

        sc.close();
    }
}
