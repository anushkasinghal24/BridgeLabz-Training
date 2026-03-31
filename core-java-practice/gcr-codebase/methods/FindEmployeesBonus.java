/*Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/
//Q-11 : l3
//package methods;

public class FindEmployeesBonus {
	public static int[][] calculateData(int n ){
		int[][] data = new int[n][2] ;
		for(int i = 0; i< n ; i++) {
			data[i][0] = 10000 + (int)(Math.random() * 90000);
			data[i][1] = 1 + (int)(Math.random() * 10);
		}return data;
	}

	//Calculate bonus and new salary 
	public static double[][] calculateBonus(int[][] data){
		double[][] result =new double[data.length][2];
		
		for(int i = 0; i< data.length; i++) {
			double rate = (data[i][1] > 5 ) ? 0.05 : 0.02;
			result[i][1] = data[i][0] * rate;
			result[i][0] = data[i][0] + result[i][1];
			
		}return result;
	}
	
	//Display results and total;
	public static void display(int[][] oldData, double[][] newData) {
		double totalOld = 0 , totalBonus = 0,  totalNew = 0;
		System.out.println("Employee      Old Salary    years    Bonus    New Salary ");
		
		for(int i = 0 ; i<oldData.length; i++) {
			totalOld += oldData[i][0];
			totalBonus += newData[i][1];
			totalNew += newData[i][0];
			System.out.println((i+1) + "   " + oldData[i][0] + "    " + oldData[i][1] + "  " + newData[i][1] + "  " + newData[i][0]);
			
		}System.out.println("Total " + totalOld + "    " + totalBonus + "    " + totalNew);
		
	}
	public static void main(String[] args) {
		int[][] employeeData = calculateData(10);
		double[][] updatedData = calculateBonus(employeeData);
		display(employeeData, updatedData);
		

	}

}
