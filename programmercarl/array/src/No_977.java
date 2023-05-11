/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/11
 */
public class No_977 {
   public int[] sortedSquares(int[] nums) {
      int left = 0;
      int right = nums.length - 1;
      //如果不创建新数组的话，就会弄来好多麻烦。
      /**
      while (left < right) {
         if (nums[left] * nums[left] <= nums[right] * nums[right]) {
            nums[right--] = nums[right] * nums[right];
         } else if (nums[left] * nums[left] > nums[right] * nums[right]) {
            nums[left++] = nums[left] * nums[left];
         }
      }
       */
      int[] result = new int[nums.length];
      int index = result.length - 1;
      while (left <= right) {
         if (nums[left] * nums[left] <= nums[right] * nums[right]) {
            result[index--] = nums[right] * nums[right];
            right--;
         } else if (nums[left] * nums[left] > nums[right] * nums[right]) {
            result[index--] = nums[left] * nums[left];
            left++;
         }



      }
      return result;
   }
}
