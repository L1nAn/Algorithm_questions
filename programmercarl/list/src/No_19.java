import java.util.List;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_19 {
   public ListNode removeNthFromEnd(ListNode head, int n) {
      //利用快慢指针来解决这个问题。先让快指针走n步，然后快慢指针同时开始走，等到快指针到头了，慢指针 也就 到了目的地了。因为n + 慢指针 = 链表长度
      ListNode dummy = new ListNode(-1, head);
      ListNode fastNode = dummy;
      ListNode slowNode = dummy;
      for (int i = 0; i < n; i++) {
         fastNode = fastNode.next;
      }
//      while (fastNode != null) {//注意判定条件，
      while (fastNode.next != null) {//注意判定条件，一定得是fastNode.next != null，因为只有这样，slowNode.next.next 才不会空指针
         fastNode = fastNode.next;
         slowNode = slowNode.next;
      }
      slowNode.next = slowNode.next.next;
      return dummy.next;
   }
}
