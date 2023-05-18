import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/17 13:25
 */
public class No_101 {
   public boolean isSymmetric(TreeNode root) {
      // 迭代法，使用普通队列
      Queue<TreeNode> que = new LinkedList<>();
      // 将根节点的左右节点放入队列中
      que.offer(root.left);
      que.offer(root.right);
      while (!que.isEmpty()) {
         TreeNode leftNode = que.poll();
         TreeNode rightNode = que.poll();
         // 这时如果遇到空节点的情况下，直接跳过就可以了。
         if (leftNode == null && rightNode == null) {
            continue;
         }

         if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
            return false;
         }
         // 将节点放入队列，最左边一个，然后最右边一个，循环下去。
         que.offer(leftNode.left);
         que.offer(rightNode.right);
         que.offer(leftNode.right);
         que.offer(rightNode.left);
      }
      return true;
   }
}
