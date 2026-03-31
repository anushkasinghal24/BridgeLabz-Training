package OnlineExam;

public class ObjectiveEvaluation implements EvaluationStrategy{
    @Override
    public int evaluate(Question q, String answer){
        return q.getCorrectAnswer().equalsIgnoreCase(answer)?q.getMarks():0;
    }
    
}