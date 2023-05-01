/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/27
 */

/**
 * 这是一个做题的公共类
 */
public class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;

   TreeNode() {
   }

   TreeNode(int val) {
      this.val = val;
   }

   TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
   }
}
