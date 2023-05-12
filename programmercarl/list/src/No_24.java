import java.util.List;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1, head);//创建虚拟头节点
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            ListNode temp = cur.next.next;
            pre.next = cur.next;
            pre.next.next = cur;
            cur.next = temp;
            pre = cur;
            cur = temp;
        }
        return dummy.next;
    }
}
