
/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/3
 */
public class No_404 {
   //用的是后序遍历
   public int sumOfLeftLeaves(TreeNode root) {
      if(root == null) {
         return 0;
      }
      //下面的if语句可有可不有，目的就是遇到不符合条件的立即终止
      if(root.left == null && root.right == null) {
         return 0;
      }
      int leftValue = sumOfLeftLeaves(root.left);//左
      int rightValue = sumOfLeftLeaves(root.right);//右

      int midValue = 0;
      //左叶子，只能通过父节点做判断。因为只有父节点只有能判断他是不是左节点。
      if(root.left != null && root.left.left == null && root.left.right == null) {
         midValue = root.left.val;
      }
      int sum = midValue + leftValue + rightValue;//中
      return sum;
   }
}
