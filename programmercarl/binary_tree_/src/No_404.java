/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/23 13:40
 */
public class No_404 {
   public int sumOfLeftLeaves(TreeNode root) {
      // 迭代法自己写一遍
      // 递归
      if (root == null) {
         return 0;
      }
      int leftValue = sumOfLeftLeaves(root.left);
      int rightValue = sumOfLeftLeaves(root.right);
      int mid = 0;
      if (root.left != null && root.left.left == null && root.left.right == null) {
         mid = root.left.val;
      }
      int sum = mid + leftValue + rightValue;
      return sum;
   }

   public static void main(String[] args) {
      TreeNode root = new TreeNode(3);
      root.left = new TreeNode(9);
      root.right = new TreeNode(20);
      root.right.left = new TreeNode(15);
      root.right.right = new TreeNode(7);
      int i = new No_404().sumOfLeftLeaves(root);
      System.out.println(i);
   }
}
