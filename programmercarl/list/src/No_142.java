/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_142 {
   public ListNode detectCycle(ListNode head) {
      if (head == null) {
         return head;
      }
      ListNode fastNode = head;
      ListNode slowNode = head;
      while (fastNode != null && fastNode.next != null) {
         fastNode = fastNode.next.next;
         slowNode = slowNode.next;
         if (fastNode == slowNode) {
            //相等，说明有环
            ListNode index1 = fastNode;
            ListNode index2 = head;
            //下面这个循环代码优化后是
//            while (true) {
//               if(index1 == index2) {
//                  return index1;
//               }
//               index1 = index1.next;
//               index2 = index2.next;
//            }
            while (index1 != index2) {
               index1 = index1.next;
               index2 = index2.next;
            }
            return index1;
         }
      }
      return null;
   }
}
