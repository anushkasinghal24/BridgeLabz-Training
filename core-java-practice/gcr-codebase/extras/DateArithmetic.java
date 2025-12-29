/*Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods.*/
//package extras;

import java.util.Scanner;
import java.time.LocalDate;
 public class DateArithmetic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        LocalDate date=LocalDate.parse(str);
        LocalDate addedDate=date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("after adding 7 days, 1 month and 2 years"+addedDate);
        LocalDate finalDate=addedDate.minusWeeks(3);
        System.out.println("after subtracting 3 weeks"+finalDate);

        sc.close();

    }
 }