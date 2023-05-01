import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/4/28
 */

/**
 * 这道题相当于让返回一个二叉树。只不过是由别的属性的二叉树
 */
public class No_116 {
   public Node_1 connect(Node_1 root) {
      //首先创建一个队列，泛型是本题给出的类，也就是说，二叉树就是有队列可以创建出来
     Queue<Node_1> que = new LinkedList<>();
     if(root != null) {//因为是返回一个队列之类的东西，所以这是要添加，着如果要没有添加，那么后面的代码就不会运行了
        que.offer(root);
     }
      /**
       * if(cur.left != null) {
       *            que.offer(cur.left);
       *         }
       *         if(cur.right != null) {
       *            que.offer(cur.right);
       *         }
       *         if(next.left != null) {
       *               que.offer(next.left);
       *            }
       *            if(next.right != null) {
       *               que.offer(next.right);
       *            }
       *            这添加两次的原因是，因为第一次是只是添加了每层的第一个，之后的才是循环里面的。
       */
     while (que.size() != 0) {
        int size = que.size();
        Node_1 cur = que.poll();
        if(cur.left != null) {
           que.offer(cur.left);
        }
        if(cur.right != null) {
           que.offer(cur.right);
        }
        for (int index = 1; index < size; index++) {
           Node_1 next = que.poll();
           if(next.left != null) {
              que.offer(next.left);
           }
           if(next.right != null) {
              que.offer(next.right);
           }
           cur.next = next;
           cur = next;
        }
     }
     return root;
   }
}
;