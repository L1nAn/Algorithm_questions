/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/11
 */
public class No_27 {
   public int removeElement(int[] nums, int val) {
      int slowIndex = 0;
      for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
         if (nums[fastIndex] != val) {
            nums[slowIndex++] = nums[fastIndex];
         }
      }
      return slowIndex;
   }
}
