import java.util.ArrayList;
import java.util.List;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/3
 */
public class No_257 {
   public List<String> binaryTreePaths(TreeNode root) {
      List<String> res = new ArrayList<>();//存放最终的结果
      if(root == null) {
         return res;
      }
      List<Integer> paths = new ArrayList<>();//作为结果中的路径
      traversal(root, paths, res);
      return res;
   }
   private void traversal(TreeNode root, List<Integer> paths, List<String> res) {
      paths.add(root.val);//前序遍历,中
      //遇到叶子节点
      if(root.left == null && root.right == null) {
         //直接输出路径
         StringBuilder sb = new StringBuilder();//这个用来拼接字符串，速度更快
         for (int i = 0; i < paths.size() - 1; i++) {
            //因为这结束循环结尾是一个”->“的标志，所以这就是为什么paths.size() - 1的原因
            //因为要留下最后一个值单独加入，防止最后是一个箭头的标志。
            sb.append(paths.get(i)).append("->");
         }
         sb.append(paths.get(paths.size() - 1));//记录最后一个节点
         res.add(sb.toString());//这就是收集一个路径
         return;
      }
      //递归和回溯是同时进行，所以要放到同一个花括号里面
      if(root.left != null) {//左
         traversal(root.left, paths, res);
         paths.remove(paths.size() - 1);//回溯
      }
      if(root.right != null) {//右
         traversal(root.right, paths, res);
         paths.remove(paths.size() - 1);//回溯
      }
   }
}
