import java.util.LinkedList;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/17 12:57
 */
public class No_226 {
   public TreeNode invertTree(TreeNode root) {
      // 先遍历，在赋值
      /*if (root == null) {
         return root;
      }
      Queue<TreeNode> que = new LinkedList<>();
      que.offer(root);
      while (!que.isEmpty()) {
         int size = que.size();
         for (int i = 0; i < size; i++) {
            TreeNode node = que.poll();
            swap(node);
            if (node.left != null) {
               que.offer(node.left);
            }
            if (node.right != null) {
               que.offer(node.right);
            }
         }
      }
      return root;
   }
   private void swap(TreeNode node) {
      TreeNode temp = node.left;
      node.left = node.right;
      node.right = temp;*/
      // 递归法
      
      if (root == null) {
         return root;
      }
      swapChildren(root);
      invertTree(root.left);
      invertTree(root.right);
      return root;
   }
   private void swapChildren(TreeNode root) {
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
   }
}
