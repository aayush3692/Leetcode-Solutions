import java.util.Stack;

public class Solution{
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String[] ops = {"5","2","C","D","+"};
        int score = sol.calPoints(ops);
        System.out.println(score);

    }
}
class Solution1 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        return sum;
    }
}