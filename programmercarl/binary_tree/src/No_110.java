import java.util.Stack;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/2
 */

/**
 * 递归法，一定要学会
 */
public class No_110 {
   public boolean isBalanced(TreeNode root) {
      return getHeight(root) != -1;
   }
   private int getHeight(TreeNode root) {
      if(root == null) {
         return 0;
      }
      //只有先得到左右子树的情况之后，才可以在节点出进行判断。所以必须是后序遍历，左右中。
      int leftHeight = getHeight(root.left);
      if(leftHeight == -1) {
         return -1;
      }
      int rightHeight = getHeight(root.right);
      if(rightHeight == -1) {
         return -1;
      }
      //左右子树高度差大于1，return -1 表示已经不是平衡树了。
      if(Math.abs(leftHeight - rightHeight) > 1) {
         return -1;
      }
      return Math.max(leftHeight, rightHeight) + 1;
   }
}
