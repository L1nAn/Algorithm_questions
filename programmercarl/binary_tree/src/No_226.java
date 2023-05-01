import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/29
 */
public class No_226 {
   public TreeNode invertTree(TreeNode root) {
      //利用层序遍历进行二叉树翻转
      Queue<TreeNode> que = new LinkedList<>();
      if(root == null) {
         return root;
      }
      que.offer(root);
      while (!que.isEmpty()) {
         int len = que.size();
         for (int i = 0; i < len; i++) {
            TreeNode temp = que.poll();
            swap(temp);
            if(temp.left != null) {
               que.offer(temp.left);
            }
            if(temp.right != null) {
               que.offer(temp.right);
            }
         }
      }
      return root;
   }
   private void swap(TreeNode root) {
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
   }
}
