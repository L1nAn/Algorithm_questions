import java.util.LinkedList;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/18 13:40
 */
public class No_559 {
   public int maxDepth(Node root) {
      // 最大深度，只要他有节点就证明深度就存在。所以使用层序遍历更好一些。
      Queue<Node> que = new LinkedList<>();
      if (root == null) {
         return 0;
      }
      que.offer(root);
      int sum = 0;
      while (!que.isEmpty()) {
         int size = que.size();
         for (int i = 0; i < size; i++) {
            Node node = que.poll();
            if (node.children != null) {
               for (Node child : node.children) {
                  que.offer(child);
               }
            }
         }
         sum++;
      }
      return sum;
   }
}
