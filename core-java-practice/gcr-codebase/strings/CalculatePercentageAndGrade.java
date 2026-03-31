/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 

*/


import java.util.Scanner;
public class CalculatePercentageAndGrade {
	
	public static int[][] generateScores(int students){
		int[][] scores = new int[students][3];
		
		for(int i = 0; i< students; i++) {
			for(int j = 0; j< 3; j++) {
				scores[i][j] = (int)(Math.random() * 90 + 10);
			}
		}return scores;
}
	/*
    Method (b):
    Calculates total, average, and percentage for each student.
    Values are rounded off to 2 decimal places using Math.round().
    Returns a 2D double array.
   */
	
	public static double[][] calculateResults(int[][] scores){
		double[][] result = new double[scores.length][3];
		
		for(int i = 0; i < scores.length; i++) {
		
		int total = scores[i][0] + scores[i][1] + scores[i][2];
		double average =  total/3.0;
		double percentage = (total / 300.0 ) * 100;
		
		
		average = Math.round(average * 100.0) / 100.0;
		 percentage = Math.round(percentage * 100.0) / 100.0;

         result[i][0] = total;
         result[i][1] = average;
         result[i][2] = percentage;
		}
	return result;
	}

/*
Method (c):
Calculates grade based on percentage
and returns a 2D String array of grades.
*/
public static String[] calculateGrade(double[][] results) {

    String[] grades = new String[results.length];

    for (int i = 0; i < results.length; i++) {

        double percent = results[i][2];

        if (percent >= 80)
        	
            grades[i]  = "A";
        else if (percent  >= 70)
            grades[i] =  "B";
        
        else if (percent  >= 60)
            grades[i] =  "C";
        
        else if (percent >= 50)
            grades[i]  = "D";
        
        else if (percent >= 40)
            grades[i]  = "E";
        else
            grades[i]  = "R";
    } 
    return grades;
}

/*
 Method (d):
 Displays the complete scorecard of all students
 in a tabular format.
*/
public static void displayScoreCard(
        int[][] scores,
        double[][] results,
        String[] grades) {

    System.out.println("\nStudent Scorecard");
    
    System.out.println ("---------------------------------------------------------------");
    
    System.out.println ("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
    System.out.println ("---------------------------------------------------------------");

    for (int i = 0; i < scores.length; i++) {
        System.out.printf ("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n",
                (i + 1),
                scores[i][0],
                scores[i][1],
                
                scores[i][2],
                
                results[i][0],
                results[i][1],
                results[i][2],
                grades[i]);
    }
}

// Main method
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Input number of students
    System.out.print ("Enter number of students: ");
    
    int students = sc.nextInt();

    // Method calls as per hint
    int[][] scores = generateScores (students);
    
    double[][] results = calculateResults (scores);
    
    String[] grades = calculateGrade (results);
    
    displayScoreCard(scores,  results, grades) ;

    sc.close();
}
}
