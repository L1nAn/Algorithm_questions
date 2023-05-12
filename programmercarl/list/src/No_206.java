import java.util.List;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_206 {
   public ListNode reverseList(ListNode head) {
//      ListNode dummy = new ListNode();
//      ListNode pre = dummy; //这种方式dummy是有默认值的，为0，不是null，所以就会出错。
      ListNode pre = null;
      ListNode cur = head;
      while (cur != null) {
         ListNode temp = cur.next;
         cur.next = pre;
         pre = cur;
         cur = temp;
      }
      return pre;
   }
}
