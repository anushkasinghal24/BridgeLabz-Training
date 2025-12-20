// Creating class with name Grade indicating the purpose is to
// calculate percentage and determine grade based on marks
package controlflow;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics Marks: ");
		double physics = sc.nextDouble();
		System.out.println("Enter Chemistry Marks: ");
		double chemistry = sc.nextDouble();
		System.out.println("Enter maths Marks: ");
		double maths = sc.nextDouble();
		//Calculate average percentage of the three subjects 
		double percentage = (physics + chemistry + maths) / 3;
		
		String grade;
		String remarks;
		
		if(percentage >= 80) {
			grade = "A";
			remarks = "Level 4, above agency-normalized standards";
		}
		else if(percentage >= 70) {
			grade = "B";
			remarks = "Level 3, at agency-normalized standards";
		}else if(percentage >= 60) {
			grade = "C";
			remarks = "Level 2, below but approaching agency-normalized standards";
		}else if(percentage >= 50) {
			grade = "D";
			remarks = "Level 1, well below agency-normalized standards";
		}else if(percentage >= 40) {
			grade = "E";
			remarks = "Level -1, too below agency-normalized standards";
		}
		else {
			//// Assign remedial grade if percentage is below 40
			grade = "R";
			remarks = "Remedial standards";
		}
		System.out.println("\nAverage Percentage: " + percentage + "%");
		System.out.println("Grade: " + grade);
		System.out.println("Reamrks: " + remarks);
		
		
		

	}

}
