import java.util.ArrayList;
import java.util.List;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/15 13:25
 */

// 中序遍历
public class No_94 {
   public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      inorder(root, res);
      return res;
   }
   private void inorder(TreeNode root, List<Integer> res) {
      if (root == null) {
         return;
      }
      inorder(root.left, res);
      res.add(root.val);
      inorder(root.right, res);
   }
}
