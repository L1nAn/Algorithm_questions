import java.util.Stack;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/14 18:57
 */
public class MyQueue {
   Stack<Integer> s1;// 负责进栈
   Stack<Integer> s2;// 负责出栈

   public MyQueue(Stack<Integer> s1, Stack<Integer> s2) {
      s1 = new Stack<>();
      s2 = new Stack<>();
   }
   public void push(int x) {
      s1.push(x);
   }
   public int pop() { // 获取头部元素并删除
      /*if (!s2.isEmpty()) {// 首先还是要确定出栈是否为空，如果不为空，直接返回pop()即可。
         return s2.pop();
      }
      while (!s1.isEmpty()) {
         s2.push(s1.pop());
      }*/
      dumpstackIn();
      return s2.pop();
   }
   public int peek() {
      /*if (!s2.empty()) {
         return s2.peek();
      }
      while (!s1.isEmpty()) {
         s2.push(s1.pop());
      }*/
      dumpstackIn();
      return s2.peek();
   }
   public boolean empty() {
      if (s1.isEmpty() && s2.isEmpty()) {
         return true;
      }
      return false;
   }
   private void dumpstackIn() {
      if (!s2.isEmpty()) {// 首先还是要确定出栈是否为空，如果不为空，直接返回pop()即可。
         return;
      }
      while (!s1.isEmpty()) {
         s2.push(s1.pop());
      }
   }
}
