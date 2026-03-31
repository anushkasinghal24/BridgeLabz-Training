/*Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

Hint => 
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
Write a method to get the first day of the month using the Gregorian calendar algorithm

Displaying the Calendar requires 2 for loops. 
The first for loop up to the first day to get the proper indentation. As in the example above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
The Second for loop displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sat
*/
//package methods;

import java.util.*;
public class DisplayCalendar{

    public static String monthName(int month){
    	
        String[] months = {"january", "february","march","april","may","june","july","august","september","october","november","december"};
        
        return months[month-1];


    }

    public static boolean leapYear(int year){
        return (year%4 == 0 && year%100 != 0) || (year % 400 == 0);
    }


    public static int daysInMonth(int month, int year){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(leapYear(year) && month == 2){
            return 29;
        }

        return days[month-1];
    }


    public static int getDayFirst(int month, int year){
        int d = 1;
        int y = year;
        int m = month;

        if( m<3 ){
            m = m + 12;
            y--;
        }

        int i = y%100;
        int j = y/100;

        int day = (d+(13*(m+1))/5+i+(i/4)+(j/4)+(5*j))%7;
        return (day+6)%7;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();

        System.out.println("\n " + monthName(month)+" "+year);

        System.out.println("Sun Mon Tues Wed Thurs Fri Sat");
        int daysInMonth = daysInMonth(month,year);
        int firstDay = getDayFirst(month,year);


        for(int i = 0; i<firstDay ; i++){
            System.out.print("   ");
        }

        for(int day = 1;day <= daysInMonth ; day++){
            System.out.printf("%4d",day);
            
            if((day+firstDay)%7 == 0){
                System.out.println();
            }
        }
    }


} 