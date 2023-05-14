import java.util.Stack;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/14 20:49
 */
public class No_1047 {
   public String removeDuplicates(String s) {
      char[] ch = s.toCharArray();
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < ch.length; i++) {
         if (stack.isEmpty() || ch[i] != stack.peek()) { // 一定要考虑栈为空的时候也是可以添加元素的。
                                                      // 因为最开始肯定是要入栈的。如果没有这个条件，怎么入栈，就会直接报错
            stack.push(ch[i]);
         } else {
            stack.pop();
         }
      }
      StringBuffer sb = new StringBuffer();
      while (!stack.isEmpty()) {
         sb.append(stack.pop());
      }
      return sb.reverse().toString();
   }
}
