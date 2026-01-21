package university;

import java.util.List;

class UniversityUtils {

    // Accept any list of courses, no matter their concrete evaluation type
    public static void printAnyCourses(
            List<? extends CourseType> courseTypes) {

        for (CourseType type : courseTypes) {
            System.out.println("Course type: " + type.getEvaluationName());
        }
    }

    // Example: process any department's courses using wildcard on CourseType
    public static void printDepartmentsCourses(
            List<? extends Department<? extends CourseType>> departments) {

        for (Department<? extends CourseType> dept : departments) {
            dept.printCourses();
        }
    }
}