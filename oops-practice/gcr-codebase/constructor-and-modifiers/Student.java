/*Problem 1: University Management System
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).
Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate the use of protected members.
 */
import java.util.*;


public class Student {
	
	public int rollnumber;
	protected String name;
	private double cgpa;
	
	
	public Student(int rollnumber, String name, double cgpa) {
		this.rollnumber = rollnumber;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
		
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the roll number : ");
		 int roll = sc.nextInt();
		 
		 sc.nextLine();
		 System.out.println("Enter name : ");
		 String name = sc.nextLine();
		 
		 
		 System.out.println("Enter cgpa :");
		 double cgpa = sc.nextDouble();
		 
		 PostGraduateStudent pg = new PostGraduateStudent(roll,name,cgpa);
		 pg.display();
		 
		 System.out.println("Enter new cgpa");
		 double newCgpa = sc.nextDouble();
		 
		 pg.setCgpa(newCgpa);
		 
		 System.out.println("Updated cgpa "+pg.getCgpa());
		 
}
	
	
	

}

class PostGraduateStudent extends Student{
	public PostGraduateStudent(int rollnumber,String name,double cgpa) {
		super(rollnumber,name,cgpa);
	}
	
	public void display() {
		System.out.println("roll number "+rollnumber);
		System.out.println("name "+name);
		System.out.println("cgpa "+getCgpa());
	}
	
}