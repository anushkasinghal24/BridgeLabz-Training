/*Create a program to take input marks of students in 3 subjects: physics, chemistry, and maths. Compute the total, average, and the percentage score 

Hint => 
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method. 
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t". 
*/

//package methods;

import java.util.*;

public  class StudentMarks{

    static  Random random = new Random();

    static int[][] generateScores(int students){
        int[][] scores = new int[students][3];

        for(int i = 0 ; i<students ;i++){
            scores[i][0] = random.nextInt(90)+10;
            scores[i][1] = random.nextInt(90)+10;
            scores[i][2] = random.nextInt(90)+10;
                }
                return scores;
    }

    static double [][] calculateResult(int[][] scores){
        int students = scores.length;
        double[][] results = new double[students][3];

        for(int i = 0;i<students;i++){
            int total = scores[i][0]+scores[i][1]+scores[i][2];
            double average=total/3.0;
            double percentage=(total/300.0)*100;

            results[i][0] = Math.round(total*100.0)/100.0;
            results[i][1] = Math.round(average*100.0)/100.0;
            results[i][2] = Math.round(percentage*100.0)/100.0;

        }
        
        return results;
    }

    static void display(int[][] scores,double[][] results){
        System.out.println("Student\tphysics\tchemistry\tmaths\ttotal\taverage\tpercentage");

        for(int i=0;i<scores.length;i++){
            System.out.println(
                (i+1)+"\t\t"+
                scores[i][0]+"\t\t"+
                scores[i][1]+"\t\t"+
                scores[i][2]+"\t"+
                scores[i][0]+"\t"+
                scores[i][1]+"\t"+
                scores[i][2]
            );
        }
    }

    public static void main(String args[]){
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("enter students");
        
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        
        double[][] results = calculateResult(scores);

        System.out.println("Results");
        display(scores, results);
    }
}
    