import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/28
 */
public class No_111 {
    public int minDepth(TreeNode root) {
//      if(root == null) {
//          return 0;
//      }
//      Queue<TreeNode> que = new LinkedList<>();
//      que.offer(root);
//      int depth = 0;
//      while (!que.isEmpty()) {
//          int len = que.size();
//          depth++;
//          TreeNode temp = null;
//          for (int i = 0; i < len; i++) {
//              temp = que.poll();
//              //如果当前节点的左右孩子都为空，直接返回最小深度。
//              if(temp.left == null && temp.right == null) {
//                  return depth;
//              }
//              if(temp.left != null) que.offer(temp.left);
//              if(temp.right != null) que.offer(temp.right);
//          }
//      }
//        return depth;

        Queue<TreeNode> que = new LinkedList<>();
        if(root == null) {
            return 0;
        }
        que.offer(root);
        int depth = 0;
        while (!que.isEmpty()) {
            depth++;//因为这是求最小深度，所以进入循环肯定就会有深度，所以depth++在这肯定没问题。
            int len = que.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                if(temp.left == null && temp.right == null) {//如果当前节点的左右孩子都为空，直接返回最小深度。
                    return depth;
                }
                if(temp.left != null) {
                    que.offer(temp.left);
                }
                if(temp.right != null) {
                    que.offer(temp.right);
                }
            }
        }
        return depth;//这是循环结束后，返回的最大深度，但同时他也是最小深度。因为最下深度的定义就是当前节点的左右孩子都为空的时候。
    }
}
