import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/13
 */
public class No_18 {
   public List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>> res = new ArrayList<>();
      //将数组进行排序
      Arrays.sort(nums);
      if (nums == null || nums.length == 0) {
         return res;
      }
      for (int i = 0; i < nums.length; i++) {
//         if ()
         if (nums[i] > 0 && nums[i] > target) {//这个条件必须是nums[i] > 0 的情况下
            return res;
         }

         if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
         }
         for (int j = i + 1; j < nums.length; j++) {
            if (j > i + 1 && nums[j] == nums[j - 1]) {
               continue;
            }
            int left = j + 1;
            int right = nums.length - 1;
            while (left < right) {
               int sum = nums[i] + nums[j] + nums[left] + nums[right];
               if (sum < target) {
                  left++;
               } else if (sum > target) {
                  right--;
               } else {
                  res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                  while (right > left && nums[right] == nums[right - 1]) {
                     right--;
                  }
                  while (left < right && nums[left] == nums[left + 1]) {
                     left++;
                  }
                  left++;
                  right--;
               }
            }
         }
      }
      return res;
   }
}
