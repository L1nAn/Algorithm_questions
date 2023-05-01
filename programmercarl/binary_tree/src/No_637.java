
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/27
 */
public class No_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root == null) {
            return res;
        }
        que.offer(root);
        while (!que.isEmpty()) {
            int len = que.size();
            double sum = 0;
            for (int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                if(temp.left != null) {
                    que.offer(temp.left);
                }
                if(temp.right != null) {
                    que.offer(temp.right);
                }
                sum += temp.val;//因为队列是头出尾进，所以求和语句的位置放在哪里都可以。
            }
            res.add(sum / len); //因为是求平局值
        }
        return res;
    }
}


