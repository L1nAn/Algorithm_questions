import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/27
 * N差树的层序遍历
 * 这道题自己定义了N差树，其中children就是指以前二叉树的左右节点
 */
public class No_429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        if (root == null) {
            return res;
        }
        que.offer(root);
        while (!que.isEmpty()) {
            int len = que.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                Node temp = que.poll();
                list.add(temp.val);
                List<Node> children = temp.children;
                if (children == null || children.size() == 0) {
                    continue;
                }
                for (Node child : children) {
                    if(child != null) {
                        que.offer(child);
                    }
                }
            }
            res.add(list);
        }
        return res;
    }
}

