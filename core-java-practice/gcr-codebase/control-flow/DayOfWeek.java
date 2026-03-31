// Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. 
// Your program should take three command-line arguments: m (month), d (day), and y (year). 
// For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. 
// Use the following formulas, for the Gregorian calendar (where / denotes integer division):

public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }
		//parse input

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
		

        if (m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("Invalid date");
            return;
        }

		//Adjust month and year for january and february

        if (m == 1 || m == 2) {

            m += 12;
            y -= 1;

        }

		//Calculate century and year of century
        int century = y / 100;

        int yearOfCentury = y % 100;

        //calculate the day of the week
        int dayOfWeek = (d + (13 * (m + 1) / 5) + yearOfCentury + (yearOfCentury / 4) + (century / 4) - (2 * century)) % 7;

        //Adjust for 0-6 range 
        dayOfWeek = (dayOfWeek + 7) % 7;

        //Convert to 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        dayOfWeek = (dayOfWeek + 1) % 7;

        System.out.println(dayOfWeek);
    }
}