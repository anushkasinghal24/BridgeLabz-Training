import java.util.*;

class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        System.out.println("Operations:");
        System.out.println("1 x -> push x");
        System.out.println("2   -> pop");
        System.out.println("3   -> top");
        System.out.println("4   -> empty");

        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    int x = sc.nextInt();
                    stack.push(x);
                    System.out.println("Pushed " + x);
                    break;

                case 2:
                    if (!stack.empty())
                        System.out.println("Popped: " + stack.pop());
                    else
                        System.out.println("Stack is empty");
                    break;

                case 3:
                    if (!stack.empty())
                        System.out.println("Top: " + stack.top());
                    else
                        System.out.println("Stack is empty");
                    break;

                case 4:
                    System.out.println(stack.empty());
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }
        sc.close();
    }
}
