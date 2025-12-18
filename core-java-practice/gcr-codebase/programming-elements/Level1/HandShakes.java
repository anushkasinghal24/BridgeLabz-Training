// Create a program to find the maximum number of handshakes among N number of students.
// Hint => 
// Get integer input for numberOfStudents variable.
// Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
// Display the number of possible handshakes.

import java.util.*;

public class HandShakes {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no. of students " );
        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents -1)) / 2 ;
        System.out.println(" The no. of possible handshakes is " + handshakes);
    }
    
}
