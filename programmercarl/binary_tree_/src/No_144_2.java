import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/15 13:42
 */
public class No_144_2 {
   // 前序遍历顺序：中-左-右， 入栈顺序中-右-左。
   public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      if (root == null) {
         return res;
      }
      Stack<TreeNode> stack = new Stack<>();
      stack.push(root);
      while (!stack.isEmpty()) {
         TreeNode node = stack.pop();
         res.add(node.val);
         if (node.right != null) {
            stack.push(node.right);
         }
         if (node.left != null) {
            stack.push(node.left);
         }
      }
      return res;
   }
}
