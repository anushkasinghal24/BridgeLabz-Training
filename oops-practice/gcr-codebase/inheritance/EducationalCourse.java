/*Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
 */
import java.util.*;

class Course{
    String courseName;
    int duration;

    Course(String courseName , int duration){
        this.courseName = courseName ;
        this.duration = duration;
    }
    void displayDetails(){
        System.out.println("Course Name : " + courseName );
        System.out.println("Course Duration " + duration + "hours");

    }
}

class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    //Constructor
    OnlineCourse(String courseName , int duration , String platform , boolean isRecorded){
        super(courseName , duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    //Overriding displaydetails method 
    void displayDetails(){
        super.displayDetails();
        System.out.println("Platform : " + platform);
        System.out.println("Recorded Courses " + (isRecorded ? "Yes " : "No"));

    }

}

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;


    //Consturctor of paidOnlineCourse
    PaidOnlineCourse(String courseName , int duration , String platform, boolean isRecorded , double fee , double discount){
        super(courseName , duration , platform , isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    //Overriding 
    void displayDetails(){
        super.displayDetails();
        System.out.println("Course fee : " + fee);
        System.out.println("Discount :" + discount);
        System.out.println("Final payable Amount " + calculateFinalfee());

    }

    //Method to calculate final fee after disount 
    double calculateFinalfee(){
        return fee - (fee * discount / 100);

    }

}

public class EducationalCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter course Name ");
        String courseName = sc.nextLine();

        System.out.println("Enter course Duration (in Hours) :  ");
        int duration  = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Online Platform ");
        String platform = sc.nextLine();

        System.out.println("Is the course recorded? (true/false): ");
        boolean isRecorded = sc.nextBoolean();

        System.out.println("Enter course Fee : ");
        double fee = sc.nextDouble();

        System.out.println("Enter Discount  : ");
        double discount  = sc.nextDouble();

        PaidOnlineCourse course = new PaidOnlineCourse(courseName, duration, platform, isRecorded, fee, discount);

        System.out.println("===== Course details ======");
        course.displayDetails();
    }
    
}
