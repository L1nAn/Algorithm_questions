import java.util.ArrayList;
import java.util.List;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/15 13:21
 */
public class No_145 {
   // 后序遍历
   public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      postorder(root, res);
      return res;
   }
   private void postorder(TreeNode root, List<Integer> res) {
      if (root == null) {
         return;
      }
      postorder(root.left, res);
      postorder(root.right, res);
      res.add(root.val);
   }
}
