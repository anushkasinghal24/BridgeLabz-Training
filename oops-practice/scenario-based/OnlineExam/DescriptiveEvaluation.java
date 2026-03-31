package OnlineExam;

public  class DescriptiveEvaluation implements EvaluationStrategy{
    @Override
    public int evaluate(Question q, String answer){
        return answer.length()>20?q.getMarks():0;
    
    }

}