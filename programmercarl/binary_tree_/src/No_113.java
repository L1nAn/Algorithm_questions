import java.util.ArrayList;
import java.util.List;

/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/23 13:57
 */
public class No_113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // 路径回溯 相加不就行了。
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> paths = new ArrayList<>();// 存储路劲
        preorderdfs(root, res, targetSum, paths);
        return res;
    }

    private void preorderdfs(TreeNode root, List<List<Integer>> res, int targetSum, List<Integer> paths) {
        paths.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                res.add(new ArrayList<>(paths));
            }
            return;
        }
        if (root.left != null) {
            preorderdfs(root.left, res, targetSum - root.val, paths);
            paths.remove(paths.size() - 1);
        }
        if (root.right != null) {
            preorderdfs(root.right, res, targetSum - root.val, paths);
            paths.remove(paths.size() - 1);
        }
    }
}
