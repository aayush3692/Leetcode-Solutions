import java.util.Stack;

public class Solution {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        String[] tokens = {"2","1","+","3","*"};
        int value = sol.evalRPN(tokens);
        System.out.println(value);

    }
}

class Solution1 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens){
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                case "+":
                    stack.push(a + b);
                    break;
                case "-":
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(a * b);
                    break;
                case "/":
                    double division = (double) a / b;
                    stack.push(division < 0 ? (int) Math.ceil(division) : (int) Math.floor(division));
                    break;
                        } 
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }


        return stack.pop();
    }
}