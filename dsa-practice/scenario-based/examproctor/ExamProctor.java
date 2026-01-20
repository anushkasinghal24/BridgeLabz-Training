/*ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits. */
package examproctor;

import java.util.Scanner;

public class ExamProctor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nExam Proctor System");
            System.out.println("1. Visit question");
            System.out.println("2. Answer question");
            System.out.println("3. Go back");
            System.out.println("4. Submit exam");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter question number (1-5): ");
                    int visitId = sc.nextInt();
                    ExamService.visitQuestion(visitId);
                    break;

                case 2:
                    System.out.print("Enter question number (1-5): ");
                    int qId = sc.nextInt();

                    System.out.print("Enter answer (A/B/C/D/E): ");
                    String ans = sc.next().toUpperCase();

                    ExamService.answerQuestion(qId, ans);
                    break;

                case 3:
                    ExamService.goBack();
                    break;

                case 4:
                    int score = ExamService.scoreCalculation();
                    System.out.println("Exam submitted");
                    System.out.println(
                        "Final score: " + score + "/" + ExamData.answerKey.size()
                    );
                    sc.close();
                    System.exit(0);

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
