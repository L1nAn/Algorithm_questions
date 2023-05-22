/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/22 13:27
 */
public class No_110 {
   public boolean isBalanced(TreeNode root) {
      return getHeight(root) != -1;
   }

   private int getHeight(TreeNode root) {
      if (root == null) {
         return 0;
      }
      int leftHeight = getHeight(root.left); // 左
      if (leftHeight == -1) {
         return -1;
      }
      int rightHeight = getHeight(root.right); // 右
      if (rightHeight == -1) {
         return -1;
      }
      // 左右子树高度差大于1， return -1 表示已经不是平衡树了
      if (Math.abs(leftHeight - rightHeight) > 1) { // 中
         return -1;
      }
      return Math.max(leftHeight, rightHeight) + 1;
      // 这是高度赋值的一个语句，很重要，如果相等，那么就都加1，如果不等，就是最大的加一
   }

   public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(2);
      root.left.left = new TreeNode(3);
      root.left.right = new TreeNode(3);
      root.left.left.left = new TreeNode(4);
      root.left.left.right = new TreeNode(4);
      boolean b = new No_110().isBalanced(root);
      System.out.println(b);
   }
}
