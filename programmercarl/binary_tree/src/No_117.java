import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/28
 */
public class No_117 {
    public Node_1 connect(Node_1 root) {
      Queue<Node_1> que = new LinkedList<>();
      if(root != null) {
          que.offer(root);
      }
      while (que.size() != 0) {
          int len = que.size();
          Node_1 temp = que.poll();
          if(temp.left != null) {
              que.offer(temp.left);
          }
          if(temp.right != null) {
              que.offer(temp.right);
          }
          for (int i = 1; i < len; i++) {
              Node_1 cur = que.poll();
              if(cur.left != null) {
                  que.offer(cur.left);
              }
              if(cur.right != null) {
                  que.offer(cur.right);
              }
              temp.next = cur;
              temp = cur;
          }
      }
      return root;
    }
}
