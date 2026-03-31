package examproctor;

public class ExamService {

    // Calculate score
    public static int scoreCalculation() {

        int score = 0;

        for (int questionId : ExamData.answerKey.keySet()) {
            if (ExamData.answers.containsKey(questionId)
                    && ExamData.answers.get(questionId)
                    .equals(ExamData.answerKey.get(questionId))) {
                score++;
            }
        }
        return score;
    }

    // Visit a question
    public static void visitQuestion(int questionId) {
        ExamData.navigationStack.push(questionId);
        System.out.println("Visited question: " + questionId);
    }

    // Answer a question
    public static void answerQuestion(int questionId, String answer) {
        ExamData.answers.put(questionId, answer);
        System.out.println("Answer saved");
    }

    // Go back to previous question
    public static void goBack() {
        if (!ExamData.navigationStack.isEmpty()) {
            System.out.println(
                "Went back from question: " + ExamData.navigationStack.pop()
            );
        } else {
            System.out.println("No question to go back");
        }
    }
}

