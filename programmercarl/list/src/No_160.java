/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_160 {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode curA = headA;
      ListNode curB = headB;
      int lenA = 0;
      int lenB = 0;
      while (curA != null) {
         curA = curA.next;
         lenA++;
      }
      curA = headA;
      while (curB != null) {
         curB = curB.next;
         lenB++;
      }
      curB = headB;
      //让A始终成为最长链表
      if (lenA < lenB) {
         int tempLen = lenA;
         ListNode tempNode = curA;
         lenA = lenB;
         lenB = tempLen;
         curA = curB;
         curB = tempNode;
      }
      int gap = lenA - lenB;
      for (int i = 0; i < gap; i++) {
         curA = curA.next;
      }
//      while (curA.next != null) {
      while (curA != null) {//又是判定条件的问题。
         if(curA == curB) {
            return curA;
         }
         curA = curA.next;
         curB = curB.next;
      }
      return null;
   }
   //总结：只要记住一句话，涉及到node.next.next，判定条件一定是a.next != null ，如果涉及到b.next,那么判定条件就是a != null
}
