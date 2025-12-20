// Write a Program to find the day of the week given the date
public class DayOfWeek {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Usage: java DayOfWeek <month> <day> <year>");
			return;
		}
		//Read month , day and year from command-line arguments
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		//Calculates year-realtes components:
		//y0 = adjusted year
		//y0/4 = leap years
		//y0/100 = century years
		// y0/400 = leap century years
		int y0 = y-(14 - m) / 12;
		int x = y0 + y0 / 4- y0 / 100 + y0 / 400;
		
		int m0 = m+ 12 * ((14-m) /12)-2;
		int d0 = (d +x+(31* m0)/ 12) % 7;
		
		//Print the calculated day number
		System.out.println("Day of the week is: " + d0);
		
		

	}

}
