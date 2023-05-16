import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/16 12:57
 */
public class No_104 {
   public int maxDepth(TreeNode root) {
      // 借助队列来进行层序遍历
      if (root == null) {
         return 0;
      }
      Queue<TreeNode> que = new LinkedList<>();
      que.offer(root);
      int sum = 0;
      while (!que.isEmpty()) {
         int size = que.size();
         for (int i = 0; i < size; i++) {
            TreeNode node = que.poll();
            if (node.left != null) {
               que.offer(node.left);
            }
            if (node.right != null) {
               que.offer(node.right);
            }
         }
         sum++;
      }
      return sum;
   }
}
