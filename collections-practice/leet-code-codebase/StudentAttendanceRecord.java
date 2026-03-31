import java.util.*;
public class StudentAttendanceRecord {
    public boolean checkRecord(String s) {
        int lateCount = 0;
        int absentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                absentCount++;
                if (absentCount >= 2) return false;
            }
            if (c == 'L') {
                lateCount++;
                if (lateCount == 3) return false;
            } else {
                lateCount = 0;
            }
        }
        return absentCount < 2 && lateCount < 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter attendance record (P, A, L): ");
        String input = sc.nextLine();

        StudentAttendanceRecord obj = new StudentAttendanceRecord();
        boolean result = obj.checkRecord(input);

        if (result) {
            System.out.println("Student is Eligible for reward");
        } else {
            System.out.println("Student is NOT Eligible for reward");
        }

        
    }

    
}