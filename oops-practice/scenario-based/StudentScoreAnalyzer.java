/*Student Score Analyzer
Focus: Arrays, Methods, Exception Handling.
Scenario:
You're building a tool for teachers to analyze scores from a recent Math exam.
Requirements:
Accept array of student scores as input (int[])

Compute:
- Average score
- Highest & lowest scores
If any score is below 0 or above 100, throw InvalidScoreException
Use methods like calculateAverage(), findMax(), findMin(). */


import java.util.Scanner;

// Custom exception for invalid scores

class InvalidScoreException extends Exception{

    public InvalidScoreException(String message){

        super(message);
    }
}

public class StudentScoreAnalyzer{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        try {

            // Ask for number of students

            System.out.print("Enter number of students: ");

            int numberOfStudents = userInput.nextInt();

            int[] scores =  new int[numberOfStudents];

            // Take scores input
            for (int i = 0; i  < numberOfStudents; i++){
                System.out.print(" Enter score for student " + (i + 1) + ": ");
                scores[i] = userInput.nextInt();

                // Validate score
                if (scores[i] < 0 || scores[i]  > 100){
                    throw new InvalidScoreException(

                            " Invalid score detected: " + scores[i] +
                            ". Score must be between 0 and 100."
                    );
                }
            }

            // Calculate results

            double averageScore =  calculateAverage(scores);
            int highestScore = findMax(scores) ;
            int lowestScore = findMin(scores);

            // Display analysis
            System.out.println("\n----- Score Analysis -----");
            System.out.println("Average Score:" + averageScore);

            System.out.println("Highest Score: " + highestScore);

            System.out.println("Lowest Score: " + lowestScore);

        } catch (InvalidScoreException exception){

            System.out.println("Error: " + exception.getMessage());

        } catch (Exception exception){
            System.out.println(" Unexpected error occurred. Please enter valid input.");

        } finally {
            userInput.close();
        }
    }

    // Method to calculate average score
    public static double calculateAverage(int[] scores){
        

        int sumOfScores = 0;

        for (int score : scores) {
            sumOfScores += score;
        }

        return (double) sumOfScores / scores.length;
    }

    // Method to find highest score
    public static int findMax(int[] scores){

        int maxScore = scores[0];

        for (int score : scores){
            if (score > maxScore){
                maxScore = score;
            }
        }

        return maxScore;
    }

    // Method to find lowest score
    public static int findMin(int[] scores){

        int minScore = scores[0];

        for (int score : scores){
            if (score < minScore){
                minScore = score;
            }
        }

        return minScore;
    }
}