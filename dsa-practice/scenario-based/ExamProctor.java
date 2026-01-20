/*ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: During an online exam, each student’s question navigation is recorded using a Stack
(last visited question). Answers are stored in a HashMap: questionID → answer.
A function auto-calculates the score once the student submits. */
import java.util.*;

public class ExamProctor{

    static Stack<Integer> navigate=new Stack<>();

    static HashMap<Integer,String> answers=new HashMap<>();

    static HashMap<Integer,String> answerKey=new HashMap<>();


    public static int scoreCalculation(){
        int score = 0;

        for(int questionId: answerKey.keySet()){
            if(answers.containsKey(questionId) && answers.get(questionId).equals(answerKey.get(questionId))){
                score++;
            }   
        }
        return score;
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        answerKey.put(1,"A");
        answerKey.put(2,"B");
        answerKey.put(3,"C");
        answerKey.put(4,"D");
        answerKey.put(5,"E");



        while(true){

            System.out.println("Exam proctor system");

            System.out.println("1. Visit question");
            System.out.println("2. Answer question");
            System.out.println("3. Go back");
            System.out.println("4. Submit exam");
            System.out.println("5. Exit");


            int choice=sc.nextInt();


            if(choice==1){

                System.out.println("Enter question number(1-5)");
                int questionId = sc.nextInt();

                navigate.push(questionId);

                System.out.println("Visited question: "+questionId);

            }
            else if (choice == 2){

                System.out.println("Enter question number(1-5)");
                int questionId = sc.nextInt();

                System.out.println("Enter answer (A/B/C/D/E)");
                String ans = sc.next().toUpperCase();

                answers.put(questionId,ans);

                System.out.println("Answer saved");



            }



            else if(choice == 3){
                if(!navigate.isEmpty()){
                    System.out.println("Went back from question: "+navigate.pop());
                }
                else{
                    System.out.println("No question to go back");

                }

            }

            else if(choice == 4){
                int score = scoreCalculation();

                System.out.println("Exam submitted");
                System.out.println("Final score: " + score + "/" + answerKey.size());
                break;

            }

            else{
                System.out.println("Invalid choice");
            }





            }


        }
    }