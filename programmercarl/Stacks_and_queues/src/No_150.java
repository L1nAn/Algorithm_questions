import java.util.Stack;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/14 21:06
 */
public class No_150 {
   public int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<>();
      for (int i = 0; i < tokens.length; i++) {
         if (tokens[i].equals("+")) {
            stack.push(stack.pop() + stack.pop());
         } else if (tokens[i].equals("*")) {
            stack.push(stack.pop() * stack.pop());
         } else if (tokens[i].equals("-")) {
            stack.push(-stack.pop() + stack.pop());
         } else if (tokens[i].equals("/")) {
            int i1 = stack.pop();
            int i2 = stack.pop();
            stack.push(i2 / i1);
         } else {
            stack.push(Integer.valueOf(tokens[i]));
         }
      }
      return stack.pop();
   }
}
