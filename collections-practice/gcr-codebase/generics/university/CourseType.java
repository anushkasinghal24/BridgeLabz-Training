package university;

public abstract class CourseType {

    private final String evaluationName;

    public CourseType(String evaluationName) {
        this.evaluationName = evaluationName;
    }

    public String getEvaluationName() {
        return evaluationName;
    }

    public abstract double calculateFinalScore(double examMarks,
            double assignmentMarks,
            double researchMarks);
}

