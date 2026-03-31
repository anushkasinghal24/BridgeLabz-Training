import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{

    String name;
    String dept;
    int q1,q2,q3;

    Student(String name, String dept, int q1, int q2, int q3){
        this.name=name;
        this.dept=dept;
        this.q1=q1;
        this.q2=q2;
        this.q3=q3;
    }

    int total(){
       return q1+q2+q3;
    }
}
public class QuizRankingSystem {

    public static List<Student> list=new ArrayList<>();

    public static void recordStudent(String name, String dept, int q1, int q2, int q3){
        list.add(new Student(name, dept, q1, q2,q3));
        System.out.println("Record Added: "+name);
    }

    public static void topDepartment(String dept){
        int max=-1;

        boolean found=false;

        for(Student s:list){
            if(s.dept.equals(dept)){
                found=true;
                max=Math.max(max,s.total());
            }
        }

        if(!found){
            System.out.println("Department Not Found");
            return;
        }

        for(Student s:list){
            if(s.dept.equals(dept) && s.total()==max){
                System.out.println(s.name+" "+max);
            }
        }
    }

    public static void topQuiz(String quiz){
        int max=-1;

        for(Student s:list){
            int score=0;

            if(quiz.equals("Q1")) score=s.q1;
            if(quiz.equals("Q2")) score=s.q2;
            if(quiz.equals("Q3")) score=s.q3;


            if(score==max){
                System.out.println(s.name+" "+score);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String line=sc.nextLine();
            String parts[]=line.split(" ");

            if(parts[0].equals("Record")){
                String name=parts[1];
                String dept=parts[2];
                int q1=Integer.parseInt(parts[3]);
                int q2=Integer.parseInt(parts[4]);
                int q3=Integer.parseInt(parts[5]);

                recordStudent(name, dept,q1,q2,q3);
            }

            else if(parts[0].equals("Top")){
                if(list.isEmpty()){
                    System.out.println("No Records Available");
                    continue;
                }

                String value = parts[1];

                if (value.equals("Q1") || value.equals("Q2") || value.equals("Q3")) {
                    topQuiz(value);
                } else {
                    topDepartment(value);
                }
            }
        }

            }



}