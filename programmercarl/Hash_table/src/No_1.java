import java.util.HashMap;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/13
 */
public class No_1 {
   public int[] twoSum(int[] nums, int target) {
      //创建哈希表
      HashMap<Integer, Integer> map = new HashMap<>();
      int[] arr = new int[2];
      //添加判断
      if (nums.length == 0 || nums == null) {
         return arr;
      }

      for (int i = 0; i < nums.length; i++) {
         int temp = target - nums[i];

//         if (!map.containsKey(temp)) {
//            map.put(nums[i], i);
//         } else {
//            Integer value = map.get(temp);
//            arr[0] = value;
//            arr[1] = i;
//         }
         //上述代码优化
         if (map.containsKey(temp)) {
            Integer integer = map.get(temp);
            arr[0] = integer;
            arr[1] = i;
            break;//结束循环即可
         }
         map.put(nums[i], i);
      }
      return arr;
   }
}
