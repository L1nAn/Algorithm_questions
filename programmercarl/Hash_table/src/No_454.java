import java.util.HashMap;
import java.util.Map;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/13
 */
public class No_454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
       //创建哈希表
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums1.length; i++) {
          for (int j = 0; j < nums2.length; j++) {
             int temp = nums1[i] + nums2[j];
             if (map.containsKey(temp)) {
                 map.put(temp, map.get(temp) + 1);
             } else {
                 map.put(temp, 1);
             }
          }
       }
       int count = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int temp = 0 - (nums3[i] + nums4[j]);
                if (map.containsKey(temp)) {
                    count += map.get(temp);
                }
            }
        }
        return count;
    }
}
