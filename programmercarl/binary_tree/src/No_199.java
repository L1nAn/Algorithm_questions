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
 * 解题思路：
 * 二叉树的右视图，所以我们要把从右边能看到的内容全部展现出来，所以我们只需把每行的最后一个方法集合中即可。
 */
public class No_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null) {
            return res;
        }
        que.offer(root);
        while (!que.isEmpty()) {
            int len = que.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                if(temp.left != null) {
                    que.offer(temp.left);
                }
                if(temp.right != null) {
                    que.offer(temp.right);
                }
                if(i == len - 1) {
                    res.add(temp.val);
                }
            }
        }
        return res;
    }
}


