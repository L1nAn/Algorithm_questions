import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/27
 */
public class No_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) {
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
        return res;
    }
}
