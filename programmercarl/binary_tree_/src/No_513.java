import java.util.LinkedList;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/23 13:48
 */
public class No_513 {
   public int findBottomLeftValue(TreeNode root) {
      // 用跌打法解决
      if (root == null) {
         return root.val;
      }
      Queue<TreeNode> que = new LinkedList<>();
      que.offer(root);
      int value = 0;
      while (!que.isEmpty()) {
         int size = que.size();
         for (int i = 0; i < size; i++) {
            TreeNode node = que.poll();
            if (i == 0) {
               value = node.val;
            }
            if (node.left != null) {
               que.offer(node.left);
            }
            if (node.right != null) {
               que.offer(node.right);
            }
         }
      }
      return value;
   }
}
