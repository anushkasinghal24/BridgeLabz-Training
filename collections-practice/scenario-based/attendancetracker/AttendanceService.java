package attendancetracker;

import java.util.*;

public class AttendanceService {

    // sessionId -> set of studentIds....
    private  Map<String, Set<String>> attendanceMap = new HashMap<>();

    // Mark attendance
    public void markAttendance( String sessionId, String studentId)
            throws DuplicateAttendanceException {

        attendanceMap.putIfAbsent(sessionId, new HashSet<>());

        Set<String> students =  attendanceMap.get(sessionId);

        if (students.contains(studentId)){
            throw new DuplicateAttendanceException(
                    "Attendance already marked for Student " + studentId
                            + " in Session "  + sessionId);
        }

        students.add(studentId);
        System.out.println("Attendance marked for Student "  + studentId);
    }

    // Remove attendance
    public void removeAttendance(String sessionId, String studentId){

        if (attendanceMap.containsKey(sessionId)
                && attendanceMap.get(sessionId ).remove(studentId)){
            System.out.println("Attendance removed for Student " + studentId);
        } else {
            System.out.println("No attendance record found.");
        }
    }

    // Display attendance
    public void displayAttendance(String sessionId) {

        if (!attendanceMap.containsKey( sessionId)
                || attendanceMap.get(sessionId ).isEmpty()) {
            System.out.println("No attendance for this session.");
            return;
        }

        System.out.println("Attendance for Session " +  sessionId + ":");
        attendanceMap.get(sessionId)
                     .forEach(student ->
                             System.out.println("Student ID: "  +  student));
    }
}
