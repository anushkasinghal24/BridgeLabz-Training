package OnlineExam;

import java.util.*;
public class Exam{
    private String title;
    private ArrayList<Question> questions=new ArrayList<>();

    public Exam(String title){
        this.title = title;
    }

    public void addQuestion(Question q){
        questions.add(q);
    }  
    
    public String getTitle(){
        return title;
    }

    public ArrayList<Question> getQuestions(){
        return questions;
    }
    
}