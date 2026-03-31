package OnlineExam;

import java.util.*;
public class Main{
    public static void main(String[] args) {
        OnlineExamService service = new OnlineExamService();
        Scanner sc = new Scanner(System.in);  

        while(true){
            try{
            System.out.println("1. Create exam");
            System.out.println("2. Add question");
            System.out.println("3. Add student");
       
            System.out.println("4. Take exam");
            System.out.println("5. Show result");
         
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter exam title");
                    String title = sc.next();
                    service.createExam(title);
                    break;  

                    case 2:
                        service.listExams();
                    System.out.println("Enter exam index");
                    int examIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter question ");
                    String q = sc.nextLine();
                    System.out.println("Enter question answer");
                    String answer = sc.next();
                    System.out.println("Enter question marks");
                    int marks = sc.nextInt();
                    service.addQuestion(String.valueOf(examIndex),q,answer,marks);
                    break;  
                    case 3:
                        System.out.println("Enter student name");
                    String name = sc.next();
                    service.addStudent(name);
                    break;
                    case 4:
                       service.listStudents();
                       System.out.println("Student index");
                       int si = sc.nextInt();
                       service.listExams();
                       System.out.println("Exam index");
                       int ei = sc.nextInt();
                       sc.nextLine();

                       System.out.println("1. Objective evaluation");
                       System.out.println("2. Descriptive evaluation");
                       int mode = sc.nextInt();
                       service.setMode(mode);
                       service.takeExam(si, ei);
                       break;
                       
                case 5:
                   service.listStudents();
                   System.out.println("Enter student index");
                   int index = sc.nextInt();
                   service.showResult(index);
                   break;
                  case 0:
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid choice");
                    break;
            }
        }catch(Exception e){
            System.out.println("Invalid input");
            sc.nextLine();
        }
    
        }
                            
        }
    }

