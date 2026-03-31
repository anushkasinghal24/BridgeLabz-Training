package examproctor;

import java.util.HashMap;
import java.util.Stack;

public class ExamData {

    // Stack to track question navigation
    public static Stack<Integer> navigationStack = new Stack<>();

    // questionId → student answer
    public static HashMap<Integer, String> answers = new HashMap<>();

    // questionId → correct answer
    public static HashMap<Integer, String> answerKey = new HashMap<>();

    // Initialize answer key
    static {
        answerKey.put(1, "A");
        answerKey.put(2, "B");
        answerKey.put(3, "C");
        answerKey.put(4, "D");
        answerKey.put(5, "E");
    }
}

