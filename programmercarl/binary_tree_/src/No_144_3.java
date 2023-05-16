import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/15 13:07
 */
public class No_144_3 {
    public List<Integer> preorderTraversal(TreeNode root) {
        // 前序遍历的递归遍历
        /*List<Integer> res = new ArrayList<>();
        pre(root, res);
        return res;

    }
    private  void pre(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        pre(root.left, res);
        pre(root.right, res);*/
        // 二叉树的前序遍历的迭代遍历  遍历顺序是 中 左 右 ，所以入栈顺序是 中 右 左
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }
}
