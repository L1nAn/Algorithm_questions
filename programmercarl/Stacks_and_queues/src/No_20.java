import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/14 20:06
 */
public class No_20 {
   public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      char ch;
      for (int i = 0; i < s.length(); i++) {
         ch = s.charAt(i);
         // 碰到左括号，就把相应的右括号入栈
         if (ch == '(') {
            stack.push(')');
         } else if (ch == '{') {
            stack.push('}');
         } else if (ch == '[') {
            stack.push(']');
         } else if (stack.isEmpty() || stack.peek() != ch) { // 因为括号是按照匹配顺序进去的，所以正常情况下，s.peek() == ch 肯定是对的。
            // 如果不等于，直接返回false!
            return false;
         } else {
            // 如果是右括号判断是否和栈顶元素匹配
            stack.pop();
         }
      }
      // 最后判断栈中元素是否匹配，也就是栈是否为空。
      return stack.isEmpty();
   }
}
