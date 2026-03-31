/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/
//8


import java.util.Scanner;

public class CheckAgeForVoting {

    static int[] generateAgeOfStudents (int count) {

        int[] values = new int[count] ;
        
       // using for loop to count

        for (int i = 0; i < count; i++) {
            values[i] = (int) (Math.random() * 90);
        }return values;

        
    }

    static String[][] verifyEligibilityOfAge(int[] ageList) {

        String[][] result =  new String[ageList.length][2];

        for (int i = 0; i < ageList.length; i++) {

            result[i][0]  = String.valueOf(ageList[i]);

            if (ageList[i] < 0 ) {
                result[i][1] = "false";
            } else if (ageList[i]  >=  18) {
            	
                result[i][1] = "true";
            } else{
            	
                result[i][1] = "false";
            }
            
        }return result;
        
    }

    static void showTable( String[][] info) {

        System.out.println("Age\tCan Vote ") ;

        for (int i = 0; i < info.length; i++) {
        	
            System.out.println( info[i][0] + "\t" +  info[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] ages = generateAgeOfStudents(total);
        String[][] outcome = verifyEligibilityOfAge(ages);
        showTable(outcome);
        sc.close();
    }
}
