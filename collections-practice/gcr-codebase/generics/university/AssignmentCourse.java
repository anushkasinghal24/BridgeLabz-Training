package university;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignment Based");
    }

    @Override
    public double calculateFinalScore(double examMarks,
            double assignmentMarks,
            double researchMarks) {
        return assignmentMarks; // 100% assignment
    }
}