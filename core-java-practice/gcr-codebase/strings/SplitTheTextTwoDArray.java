/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/


import java.util.Scanner;

public class SplitTheTextTwoDArray {

    static int measure(String data) {
        int c = 0;
        
        try {
        	//Continue accessing characters until index goes out pf bounds
            while (true) {
                data.charAt (c);
                c++;
            }
        } catch (Exception e) {
        	//Exception indicates end of String
        }
        return c; //Return calculates length
    }

    static String[] extractTheWords(String text) {
    	//Get length of text without using length();
    	int size = measure(text);
        int total = 1;

        for (int i = 0; i < size; i++) {
            if (text.charAt(i) ==  ' ') {
                total++;
            }
        }

        String[] list =  new String[total];
        int begin = 0, pos = 0;

        for (int i = 0; i <= size; i++) {
            if (i == size || text.charAt(i) == ' ') {
                String temp = "";
                for (int j = begin; j < i; j++) {
                    temp += text.charAt(j);
                }
                list[pos++]  = temp;
                begin = i + 1;
            }
        }
        return list;
    }
    //Create array to store words 
    static String[][] createMatrix(String[] items) {
    	//Create 2D array with 2 columns 
        String[][] grid = new String[items.length][2];

        for (int i = 0; i < items.length; i++) {
            grid[i][0] = items[i];
            grid[i][1] = String.valueOf(measure (items[i] ));
        }
        return grid;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine() ;
        //Split text into words 
        String[] words = extractTheWords(line);
        //Create 2D array of words and their length
        String[][] table = createMatrix(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < table.length; i++) {
        	//Convert length from string to Integer
            int len = Integer.parseInt(table[i][1]);
            
            System.out.println (table[i][0] + "\t" +  len);
        }  sc.close();

      
    }
}