/*EduQuiz – Student Quiz Grader"
Story: You’re building the grading module for a quiz app. A student answers a 10-question quiz.
You must compare their answers to the correct ones, give feedback, and calculate scores.
Requirements:
● Use two String[] arrays: correctAnswers[] and studentAnswers[].
● Implement a method calculateScore(String[] correct, String[]
student) that returns a score.
● Use string comparison with .equalsIgnoreCase() for case-insensitive matching.
● Print detailed feedback: Question 1: Correct / Incorrect.
● Bonus: Show percentage score and pass/fail message. */
import java.util.Scanner;
public class EduQuizGrader{

    // Method to calculate score
    static int calculateScore(String[] correctAnswers, String[] studentAnswers){
        int score = 0;

        for (int i = 0; i < correctAnswers.length; i++){
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i])){

                score++;
            }
        }
        return score;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] correctAnswers ={
                "A", "B", "C", "D", "A",
                "C", "B", "D", "A", "B"
        };

        String[] studentAnswers = new String[10];

        System.out.println("Enter your answers for 10 questions (A/B/C/D):");

        for (int i = 0; i < studentAnswers.length; i++){
            System.out.print("Question " + (i + 1) + ": ");
            studentAnswers[i] = input.next();
        }

        int totalScore = calculateScore(correctAnswers, studentAnswers);

        System.out.println("\n--- Quiz Feedback ---");

        for (int i = 0; i < correctAnswers.length; i++){
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i])){
                System.out.println("Question " + (i + 1) + ": Correct");
            } else{

                System.out.println("Question " + (i + 1) + ": Incorrect (Correct Answer: " + correctAnswers[i] + ")");
            }
        }

        double percentage = (totalScore / 10.0) * 100;

        System.out.println("\nTotal Score: " +  totalScore + "/10");
        System.out.println("Percentage: " +  percentage + "%");

        if (percentage >= 50){
            System.out.println("Result: PASS ");
        } else {
            System.out.println("Result: FAIL ");
        }

        input.close();
    }
}
