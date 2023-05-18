import java.util.LinkedList;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/18 13:57
 */
public class No_222 {
   public int countNodes(TreeNode root) {
      // 直接用层序遍历解决
      if (root == null) {
         return 0;
      }
      Queue<TreeNode> que = new LinkedList<>();
      que.offer(root);
      int sum = 0;
      while (!que.isEmpty()) {
         int size = que.size();
         TreeNode node = que.poll();
         sum++;
         if (node.left != null) {
            que.offer(node.left);
         }
         if (node.right != null) {
            que.offer(node.right);
         }
      }
      return sum;
   }
}
