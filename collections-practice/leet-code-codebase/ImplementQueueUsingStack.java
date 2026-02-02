import java.util.*;

class MyQueue {
    Stack<Integer> pushStack;
    Stack<Integer> popStack;

    public MyQueue() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void push(int x) {
        pushStack.push(x);
    }

    public int pop() {
        while (!pushStack.isEmpty())
            popStack.push(pushStack.pop());

        int ans = popStack.pop();

        while (!popStack.isEmpty())
            pushStack.push(popStack.pop());

        return ans;
    }

    public int peek() {
        while (!pushStack.isEmpty())
            popStack.push(pushStack.pop());

        int ans = popStack.peek();

        while (!popStack.isEmpty())
            pushStack.push(popStack.pop());

        return ans;
    }

    public boolean empty() {
        return pushStack.isEmpty();
    }
}

public class ImplementQueueUsingStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue();

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        System.out.println("Operations:");
        System.out.println("1 x -> push");
        System.out.println("2   -> pop");
        System.out.println("3   -> peek");
        System.out.println("4   -> empty");

        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    int x = sc.nextInt();
                    q.push(x);
                    System.out.println("Pushed " + x);
                    break;

                case 2:
                    if (!q.empty())
                        System.out.println("Popped: " + q.pop());
                    else
                        System.out.println("Queue is empty");
                    break;

                case 3:
                    if (!q.empty())
                        System.out.println("Front: " + q.peek());
                    else
                        System.out.println("Queue is empty");
                    break;

                case 4:
                    System.out.println(q.empty());
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }
        sc.close();
    }
}
