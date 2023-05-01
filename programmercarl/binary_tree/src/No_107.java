import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/27
 */

/**
 *
 * 自底向上遍历，直接按照正常便利，然乎反转即可
 */
public class No_107 {
   public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> res = new ArrayList<>();
      Queue<TreeNode> que = new LinkedList<>();
      if(root == null) {
         return res;
      }
      que.offer(root);
      while (!que.isEmpty()) {
         int len = que.size();
         List<Integer> list = new ArrayList<>();
         for (int i = 0; i < len; i++) {
            TreeNode temp = que.poll();
            if (temp.left != null) {
               que.offer(temp.left);
            }
            if (temp.right != null) {
               que.offer(temp.right);
            }
            list.add(temp.val);
         }
         res.add(list);
      }
      List<List<Integer>> result = new ArrayList<>();
      for (int i = res.size() - 1; i >= 0; i--) {
         result.add(res.get(i));
      }
      return result;
   }
}
