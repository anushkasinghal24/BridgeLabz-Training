//package scenariobased;
import java.util.Scanner;
public class LineComparisonProblem {
	
	//UC -1 Method to calculate line length
	
	static Double calculateLength(int x1 , int x2 , int y1 , int y2 ) {
		return Math.sqrt(
				Math.pow(x2 - x2,  2) + Math.pow(y2 - y1,  2)
				
				);
	}
	
	//UC- 2 Method to check equality of two lines
	
	static void checkEquality(Double length1 , Double length2) {
		if(length1.equals(length2)) {
			System.out.println("Use Case 2 : Both lines are equal");
			
		}else {
			System.out.println("Use Case 2 : Lines are not Equal");
		}
	}
	
	
	//UC - 3 : Method to compare two lines 
	static void compareLines(Double length1 , Double length2) {
		int result = length1.compareTo(length2);
		
		
		if(result == 0) {
			System.out.println("Use Case 3 : Both lines are equal");
		}else if (result > 0) {
			System.out.println("Use Case 3 : Line 1 is greater than line 2");
		}else {
			System.out.println("Use Case 3 : Line 1 is smaller than Line 2");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter for line 1 - ");
		System.out.println("\nEnter x1 : ");
		int x1 = sc.nextInt();
		System.out.println("Enter y1 : ");
		int y1 = sc.nextInt();
		System.out.println("Enter x2 : ");
		int x2 = sc.nextInt();
		System.out.println("Enter y2 : ");
		int y2 = sc.nextInt();
		System.out.println("Enter for line2 - ");
		System.out.println("\nEnter x3 : ");
		int x3 = sc.nextInt();
		System.out.println("Enter y3 : ");
		int y3 = sc.nextInt();
		System.out.println("Enter x4 : ");
		int x4 = sc.nextInt();
		System.out.println("Enter y4 : ");
		int y4 = sc.nextInt();
		
		
		//Calculate length using method (use Case 1)
		
		Double lengthOfLine1 = calculateLength(x1 , y1 , x2 , y2);
		Double lengthOfLine2 = calculateLength(x3, y3 , x4, y4);
		

		
		System.out.println("Use case 1 : Length of line 1 is : " + lengthOfLine1);
        System.out.println("Use case 1 : Length of line 2 is : " + lengthOfLine2);
		
        checkEquality(lengthOfLine1 , lengthOfLine2);
        compareLines(lengthOfLine1 , lengthOfLine2);
		

		
		

	}

}
