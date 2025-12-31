/*Design a Course class with:
Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).
Methods:
An instance method displayCourseDetails() to display the course details.
A class method updateInstituteName() to modify the institute name for all courses.
 */
import java.util.Scanner;

class OnlineCourse {
	String courseName;
	int courseDuration;
	double courseFee;
	
	
	static String instituteName = "BridgeLabz";
	
	OnlineCourse(String title , int duration ,double fee){
		courseName = title;
		courseDuration = duration;
		courseFee = fee;
		
		
		
	}
	void displayCourseInfo() {
		System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + courseDuration + " months");
        System.out.println("Fee         : " + courseFee);
        System.out.println("Institute   : " + instituteName);
	}
	static void changeInstitutionName (String newName) {
		instituteName = newName ;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Duration in months: ");
		int duration =sc.nextInt();
		
		System.out.print("Enter Course Fee: ");
		double fee = sc.nextDouble();
		sc.nextLine();
		
		OnlineCourse course = new OnlineCourse(name , duration , fee);
		System.out.println("Enter Updated institute name : ");
		String newInstitute = sc.nextLine();
		course.changeInstitutionName(newInstitute);
		
		course.displayCourseInfo();
		
		
	}
	

}