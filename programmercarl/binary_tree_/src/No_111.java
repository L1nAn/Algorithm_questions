import java.util.LinkedList;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/16 12:57
 */
public class No_111 {
   public int minDepth(TreeNode root) {
      // 借助队列来进行层序遍历
      if (root == null) {
         return 0;
      }
      Queue<TreeNode> que = new LinkedList<>();
      que.offer(root);
      int depth = 0;
      while (!que.isEmpty()) {
         int size = que.size();
         // 这个for循环就相当于一层。所以只要进入循环，depth就加1.
         for (int i = 0; i < size; i++) {
            TreeNode node = que.poll();
            depth++;
            if (node.left == null && node.left == null) {// 如果碰到这个条件，直接返回即可。
               return depth;
            }
            if (node.left != null) {
               que.offer(node.left);
            }
            if (node.right != null) {
               que.offer(node.right);
            }
         }
      }
      return depth;
   }
}
