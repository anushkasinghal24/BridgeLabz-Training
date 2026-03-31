package university;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research Based");
    }

    @Override
    public double calculateFinalScore(double examMarks,
            double assignmentMarks,
            double researchMarks) {
        return 0.2 * examMarks + 0.3 * assignmentMarks + 0.5 * researchMarks;
    }
}