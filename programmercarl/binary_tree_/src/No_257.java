import java.util.ArrayList;
import java.util.List;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/22 14:08
 */
public class No_257 {
   public List<String> binaryTreePaths(TreeNode root) {
      List<String> res = new ArrayList<>();// 存放最终的结果
      if (root == null) {
         return res;
      }
      List<Integer> paths = new ArrayList<>();// 作为结果中的路径
      traversal(root, paths, res);
      return res;
   }

   private void traversal(TreeNode root, List<Integer> paths, List<String> res) {
      paths.add(root.val);// 前序遍历，中先加进去
      // 遇到叶子节点
      if (root.left == null && root.right == null) {
         // 输出
         StringBuilder sb = new StringBuilder();//用来拼接字符串，单线程，更快一些
         for (int i = 0; i < paths.size() - 1; i++) {
            sb.append(paths.get(i)).append("->");
         }
         sb.append(paths.get(paths.size() - 1));// 记录最后一个节点
         res.add(sb.toString());// 收集一个路径
         return;
      }
      // 递归和回溯是同时进行的，所以要放到同一个花括号里面
      if (root.left != null) {
         // 左
         traversal(root.left, paths, res);
         paths.remove(paths.size() - 1); // 回溯
      }
      if (root.right != null) {
         // 左
         traversal(root.right, paths, res);
         paths.remove(paths.size() - 1); // 回溯
      }
   }
   public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(2);
      root.left.left = new TreeNode(3);
      root.left.right = new TreeNode(3);
      root.left.left.left = new TreeNode(4);
      root.left.left.right = new TreeNode(4);
      List<String> strings = new No_257().binaryTreePaths(root);
      for (String string : strings) {
         System.out.println(string);
      }
   }
}
