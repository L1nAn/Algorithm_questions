import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/16 12:57
 */
public class No_429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = que.poll();
                if (node.children != null) {
                    for (Node child : node.children) {
                        que.offer(child);
                    }
                }
                list.add(node.val);
            }
            res.add(list);
        }
        return res;
    }
}
