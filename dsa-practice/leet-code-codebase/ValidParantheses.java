import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a parentheses string: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("The parentheses string is VALID ✅");
        } else {
            System.out.println("The parentheses string is NOT VALID ❌");
        }

        sc.close();
    }
}