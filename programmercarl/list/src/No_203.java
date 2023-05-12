/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_203 {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        //设置虚拟头节点
        ListNode dummy = new ListNode(-1, head);
//      ListNode cur = dummy;
//      while (cur != null && cur.next != null) {//判定条件一定要准确,这次有些错了，如果没有判断cur.next 是不是null，那么就可能报空指针
//         if (cur.next.val == val) {
//            cur.next = cur.next.next;
//         }
//         cur = cur.next;
//      }
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
