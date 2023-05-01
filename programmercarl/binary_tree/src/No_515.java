import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/28
 */

/**
 * 问题：给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 *
 */
public class No_515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> que = new LinkedList<>();

        if(root == null) {
            return res;
        }
        que.offer(root);

        while (!que.isEmpty()) {
            int len = que.size();
            int tempVal = Integer.MIN_VALUE;
            for (int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                if(temp.left != null) {
                    que.offer(temp.left);
                }
                if(temp.right != null) {
                    que.offer(temp.right);
                }
//                tempVal = Math.max(temp.val, Integer.MIN_VALUE);
//                /这不能是这个最小值，因为一定是temVal一直比较才对，要么就是一直和Integer.MIN_VALUE比较
                //比如，他先是和3比较了，3大，但是他又和2比较，2大，因为一直是和Integer.MIN_VALUE作比较，所以结果是2而不是3
                tempVal = Math.max(temp.val, tempVal);
            }
            res.add(tempVal);
        }
        return res;
    }
}
