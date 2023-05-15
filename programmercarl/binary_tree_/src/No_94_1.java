import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/15 13:25
 */

// 中序遍历顺序：左-中-右 ， 入栈顺序 左-右
public class No_94_1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res;
    }
}
