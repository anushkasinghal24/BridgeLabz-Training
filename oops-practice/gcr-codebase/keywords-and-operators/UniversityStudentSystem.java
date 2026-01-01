import java.util.*;


class Student{
    //Static 
    static String universityName =  "GLA University";
    static int totalStudents = 0;

    //Final
    final int rollNumber;
    String name;
    String grade;
    //Constructor 
    Student(String name , int rollNumber , String grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    //Static mathod 
    static void displayTotalStudents(){
        System.out.println("Total Students Enrolled : " + totalStudents );



    }

    //Instnace Method 
    //Display STudent Details 

    void displayStudentDetails(){
        System.out.println("University Name: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
    void updateGrade(String newGrade){
        this.grade = newGrade;
        System.out.println("Grade updated to : " + newGrade);


    }

}
public class UniversityStudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Students : ");
        int count = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[count];

        for(int i= 0 ; i < count ; i++){
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Grade: ");
            String grade = sc.nextLine();

            students[i] = new Student(name , rollNumber , grade);

        }

        Student.displayTotalStudents();
        System.out.println();

        for(Student student : students){
            if(student instanceof Student){
                student.displayStudentDetails();
            }
        }

        System.out.println("Enter roll number to update grade: ");
        int rollToUpdate = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter new Grade : ");
        String newGrade = sc.nextLine();

        for(Student student : students ){
            if(student instanceof Student && student.rollNumber == rollToUpdate){
                student.updateGrade(newGrade);
                System.out.println();
                student.displayStudentDetails();
            }
        }

        sc.close();
    }

    
}
