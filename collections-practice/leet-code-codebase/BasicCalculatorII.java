import java.util.*;
class BasicCalculatorII {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        char sgn = '+' ;
        long n = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            }


            if ((!Character.isDigit(c) && !Character.isWhitespace(c)) || i == s.length() - 1) {
                if (sgn == '+') st.push((int)n);
                else if (sgn == '-') st.push((int)(-n));
                else if (sgn == '*') st.push(st.pop() * (int)n);
                else if (sgn == '/') st.push(st.pop() / (int)n);
                
                sgn = c;
                n = 0;


            }
        }
        
        int res = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }
        return res;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        BasicCalculatorII obj = new BasicCalculatorII();

        System.out.print("Enter expression: ");
        String input = sc.nextLine();   
        int result = obj.calculate(input);

        System.out.println("Result: " + result);

       
    }
}
