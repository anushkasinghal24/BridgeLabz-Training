
/*School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
 */
import java.util.*;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
}


class Teacher extends Person{
	String subject;
	Teacher(String name, int age, String subject){
		super(name,age);
		this.subject=subject;
		
	}
	
	void display() {
		System.out.println(name+ " Teacher teaches "+subject);
	}
	
}

class Student extends Person{
	String grade;
	Student(String name, int age, String grade){
		super(name,age);
		this.grade = grade;
		
	}
	
	void display() {
		System.out.println(name+ " student got grade "+grade);
	}
	
}
class Staff extends Person{
	String department;
	Staff(String name, int age, String department){
		super(name,age);
		this.department = department;
		
	}
	
	void display() {
		System.out.println(name+ " Staff has department "+department);
	}
	
}

public class SchoolSystem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter role(teacher/student/staff):");
		String type = sc.nextLine();
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		
		sc.nextLine();
		
		Person person = null;
		
		switch (type) {
		case "teacher":
			System.out.println("Enter subject");
			String subject = sc.nextLine();
			person = new Teacher(name,age,subject);
			((Teacher)person).display();
			break;
		case "student":
			System.out.println("Enter grade");
			String grade = sc.nextLine();
			person = new Student(name,age,grade);
			((Student)person).display();
			break;
		case "staff":
			System.out.println("Enter department");
			String dept = sc.nextLine();
			person = new Staff(name,age,dept);
			((Staff)person).display();
			break;
			
			default:
				System.out.println("Invaild input");break;
			
			
		}
		
	
		
		
	}
}