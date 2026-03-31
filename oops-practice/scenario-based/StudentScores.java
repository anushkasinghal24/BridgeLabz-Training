import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        int sum = 0 ;

        for (int i = 0; i < n; i++){
            while (true) {
                try {
                    System.out.print("Enter score for student " + (i + 1) + " : ");
                    int score = sc.nextInt();

                    if (score < 0){
                        throw new IllegalArgumentException();
                    }

                    scores[i] = score;
                    sum += score;
                    break;
                } catch (Exception e){
                    System.out.println("Invalid input! Enter a valid non-negative number");
                    sc.nextLine();
                }

            }

        }

        double average = (double) sum / n;

        System.out.println("Average Score: " + average);

        int max = scores[0], min = scores[0];

        for (int s : scores){
            if (s > max) max = s;
            if (s < min) min = s;
        }

        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);

        System.out.println("Scores above average:");
        for (int s : scores){
            if (s > average){
                System.out.println(s);
            }
        }

    }
}