import java.util.LinkedList;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/14 19:29
 */
public class MyStack {
   Queue<Integer> q1;// 队列
   Queue<Integer> q2; // 辅助队列
   public MyStack() {
      q1 = new LinkedList<>();
      q2 = new LinkedList<>();
   }
   public void push(int x) {
       // 过程：比如你一开始添加了一个1在q2中，然后q1 和 q2 交换，然后你再添加一个2添加到q2中，
       // 但是q2是空的，所以下一步，将q1中的元素加入到q2中，这样q2中顺序就是 2 1 了，
       // 所以这样就和栈是一样的了，所以下面的方法直接操作q1就可以了。
     q2.offer(x);// 先放在辅助队列中
      while (!q1.isEmpty()) {
         q2.offer(q1.poll());
      }
      Queue<Integer> temp;
      temp = q1;
      q1 = q2;
      q2 = temp; // 最后交换q1 和 q2 ，将元素都放到q1中
   }
   public int pop() { //获取栈顶元素并且删除
      return q1.poll(); // 因为queue1中的元素和栈中的保持一致，所以这个和下面两个的操作只看q 1即可
   }
   public int top() {
     return q1.peek();
   }
   public boolean empty() {
     return q1.isEmpty();
   }
}
