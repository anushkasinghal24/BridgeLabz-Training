//package arrays;
import java.util.*;
public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of Students: ");
		int n = sc.nextInt(); //Take input for no. of students 
		
		
		//create arrays
		
		double[][] marks  = new double[n][3];   // 0-Physics, 1-Chemistry, 2-Math
		double[] percentage = new double[n];
		char[] grade = new char[n];
		
		
		//Take input for marks 
		
		for(int i = 0; i< n ; i++) {
			System.out.println("\nEnter marks for Students " + (i+1));
			for(int j = 0 ; j< 3 ; j++) {
				while(true) {
					if(j==0) {
						System.out.println("Physics: ");
						
					}else if(j==1) {
						System.out.println("Chemistry: ");
						
					}else {
						System.out.println("Maths: ");
					}
					marks[i][j] = sc.nextDouble();
					
					if(marks[i][j] >= 0) {
						break;
						
					}System.out.println("Invalid marks : Enter Positive value");
					
				}
			}
		}
		
		//Calculate percentage and grade
		for (int i = 0; i < n; i++) {

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }
		
		//Display Result
		
		System.out.println("\n------ Student Result Sheet ------");
        for (int i = 0; i < n; i++) {

            System.out.println(
                "Student " + (i+1) +
                " | Physics: " + marks[i][0] +
                " | Chemistry: " +  marks[i][1] +
                " | Maths: " +  marks[i][2] +
                " | Percentage: " + String.format("%.2f", percentage[i]) + "%" +
                " | Grade: " +  grade[i]
            );
        }sc.close();
		

	}

}
