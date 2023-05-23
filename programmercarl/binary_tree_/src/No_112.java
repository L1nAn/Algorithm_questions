import java.util.ArrayList;
import java.util.List;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/23 13:57
 */
public class No_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if (root == null) {
           return false;
       }
       targetSum -= root.val;
       if (root.left == null && root.right == null) {
           return targetSum == 0;
       }
       if (root.left != null) {
           boolean left = hasPathSum(root.left, targetSum);
           if (left) {
               return true;
           }
       }
       if (root.right != null) {
           boolean right = hasPathSum(root.right, targetSum);
           if (right) {
               return true;
           }
       }
       return false;
    }
}
