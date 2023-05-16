import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/16 12:57
 */
public class No_515 {
   public List<Integer> levelOrder(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      // 借助队列来进行层序遍历
      if (root == null) {
         return res;
      }
      Queue<TreeNode> que = new LinkedList<>();
      que.offer(root);
      while (!que.isEmpty()) {
         int size = que.size();
         int cur = Integer.MIN_VALUE;
         for (int i = 0; i < size; i++) {
            TreeNode node = que.poll();
            if (node.left != null) {
               que.offer(node.left);
            }
            if (node.right != null) {
               que.offer(node.right);
            }
            cur = Math.max(cur, node.val);
         }
         res.add(cur);
      }
      return res;
   }
}
