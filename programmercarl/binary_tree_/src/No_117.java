import java.util.LinkedList;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/16 12:57
 */
public class No_117 {
    public Node_ connect(Node_ root) {
        Queue<Node_> que = new LinkedList<>();
        if (root == null) {
            return root;
        }
        que.offer(root);
        while (!que.isEmpty()) {
            int size = que.size();
            // 先把头节点处理了
            Node_ cur = que.poll();
            if (cur.left != null) {
                que.offer(cur.left);
            }
            if (cur.right != null) {
                que.offer(cur.right);
            }
            // 在处理剩余的节点
            for (int i = 1; i < size; i++) {
                Node_ next = que.poll();
                if (next.left != null) {
                    que.offer(next.left);
                }
                if (next.right != null) {
                    que.offer(next.right);
                }
                cur.next = next;
                cur = next;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node_ node = new Node_(1);
        node.left = new Node_(2);
        node.right = new Node_(3);
        node.left.left = new Node_(4);
        node.left.right = new Node_(5);
        node.right.left = new Node_(6);
        node.right.right = new Node_(7);
        Node_ connect = new No_117().connect(node);
        System.out.println(connect);
    }
}
