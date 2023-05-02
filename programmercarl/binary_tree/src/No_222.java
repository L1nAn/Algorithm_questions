import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/2
 */
public class No_222 {
   public int countNodes(TreeNode root) {
      //利用层序遍历解决，也可以用递归方式，但是有点难，二刷时再用递归。
      if(root == null) {
         return 0;
      }
      Queue<TreeNode> que = new LinkedList<>();
      que.offer(root);
      int result = 0;
      while (!que.isEmpty()) {
         int len = que.size();
         for (int i = 0; i < len; i++) {
            TreeNode temp = que.poll();
            result++;
            if(temp.left != null) {
               que.offer(temp.left);
            }
            if(temp.right != null) {
               que.offer(temp.right);
            }
         }
      }
      return result;
   }
}
