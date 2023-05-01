import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/28
 */

/**
 * 自己写出来的就是牛逼
 */
public class No_104 {
   public int maxDepth(TreeNode root) {
      Queue<TreeNode> que = new LinkedList<>();

      if(root == null) {
         return 0;
      }
      que.offer(root);
      int depth = 0;
      while (!que.isEmpty()) {
         int len = que.size();
         //下面是代码随想录里面的，在地下是自己想出来的，觉得自己已经很厉害了！！！！！！！！！！
//         while (len > 0) {
//            TreeNode temp = que.poll();
//            if(temp.left != null) {
//               que.offer(temp.left);
//            }
//            if(temp.right != null) {
//               que.offer(temp.right);
//            }
//            len--;
//         }
//         depth++;
         for (int i = 0; i < len; i++) {
            TreeNode temp = que.poll();
            if(temp.left != null) {
               que.offer(temp.left);
            }
            if(temp.right != null) {
               que.offer(temp.right);
            }
         }
         if(len > 0) {
            depth++;
         }
      }
      return depth;
   }
}
