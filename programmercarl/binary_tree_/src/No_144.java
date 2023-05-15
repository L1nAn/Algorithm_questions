import java.util.ArrayList;
import java.util.List;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/15 13:07
 */
public class No_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;

    }
    private void preorder(TreeNode root, List<Integer> res) {
        if (root == null) { // 如果根节点为空，直接返回就可以了。
            return;
        }

        preorder(root.left, res);

        preorder(root.right, res);
        res.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> list = new No_144().preorderTraversal(root);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
