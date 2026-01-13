package OnlineExam;

public class Question{
    private String text;
    private String correctAnswer;
    private int marks;
   

    public Question(String text, String correctAnswer, int marks) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.marks = marks;
   
    }

    public String getText() {
        return text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getMarks() {
        return marks;
    }

   

    
}