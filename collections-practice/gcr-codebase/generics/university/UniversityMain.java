/*Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
*/
package university;

import java.util.ArrayList;
import java.util.List;

public class UniversityMain {

    public static void main(String[] args) {
        // Evaluation strategies
        ExamCourse examType = new ExamCourse();
        AssignmentCourse assignmentType = new AssignmentCourse();
        ResearchCourse researchType = new ResearchCourse();

        // Courses
        Course<ExamCourse> algo = new Course<>("CS101", "Algorithms", examType);
        Course<AssignmentCourse> oopsLab
                = new Course<>("CS102", "OOP Lab", assignmentType);
        Course<ResearchCourse> mlResearch
                = new Course<>("CS201", "ML Research", researchType);

        // Departments with different evaluation focus
        Department<ExamCourse> csDept = new Department<>("Computer Science");
        csDept.addCourse(algo);

        Department<AssignmentCourse> itDept = new Department<>("Information Technology");
        itDept.addCourse(oopsLab);

        Department<ResearchCourse> aiDept = new Department<>("AI & Research");
        aiDept.addCourse(mlResearch);

        // Work with departments via wildcards
        List<Department<? extends CourseType>> departments = new ArrayList<>();
        departments.add(csDept);
        departments.add(itDept);
        departments.add(aiDept);

        UniversityMain.printAllDepartments(departments);

        // Evaluate a student in one course
        double score = algo.evaluateStudent(90, 70, 80);
        System.out.println("Student final score in " + algo.getTitle() + " = " + score);
    }

    private static void printAllDepartments(
            List<Department<? extends CourseType>> departments) {
        for (Department<? extends CourseType> dept : departments) {
            dept.printCourses();
        }
    }
}