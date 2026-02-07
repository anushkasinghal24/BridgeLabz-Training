
/* Online Classroom Attendance Tracker
Scenario:
 An online learning platform tracks student attendance per session.
Requirements:
Store student IDs in Set<String> to avoid duplicates
Track session-wise attendance using Map<SessionID, Set<StudentID>>
Use methods to mark, remove, and display attendance
Throw DuplicateAttendanceException if already marked

Concepts: Set, Map, OOP, Custom Exception*/
package attendancetracker;

import java.util.Scanner;

public class OnlineClassroomAppMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AttendanceService service = new AttendanceService();

        while (true) {
            System.out.println("\n1.Mark Attendance");
            System.out.println("2.Remove Attendance");
            System.out.println("3.Display Attendance");
            System.out.println("4.Exit ");
            System.out.print("Choose options : ");

            int choice = sc.nextInt() ;
            sc.nextLine(); 

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Session ID: ");
                        String sessionId = sc.nextLine() ;
                        System.out.print("Enter Student ID: ");
                        String studentId = sc.nextLine();

                        service.markAttendance(sessionId , studentId);
                        break;

                    case 2:
                        System.out.print ("Enter session ID: ");
                        sessionId = sc.nextLine();
                        System.out.print ("Enter student ID: ");
                        studentId = sc.nextLine();

                        service.removeAttendance(sessionId, studentId);
                        break;

                    case 3:
                        System.out.print("Enter session ID: ");
                        sessionId = sc.nextLine();

                        service.displayAttendance(sessionId);
                        break;

                    case 4:
                        System.out.println("Exiting Attendance Tracker...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!") ;
                }
            }catch (DuplicateAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
