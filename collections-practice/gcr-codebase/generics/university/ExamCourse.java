package university;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Exam Based");
    }

    @Override
    public double calculateFinalScore(double examMarks,
            double assignmentMarks,
            double researchMarks) {
        return examMarks; // 100% exam
    }
}