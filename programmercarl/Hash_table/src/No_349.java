import java.util.HashSet;
import java.util.Set;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_349 {
   public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set1 = new HashSet<>();
      Set<Integer> set2 = new HashSet<>();
      for (int i = 0; i < nums1.length; i++) {
         set1.add(nums1[i]);
      }
      for (int i = 0; i < nums2.length; i++) {
         if (set1.contains(nums2[i])) {
            set2.add(nums2[i]);
         }
      }
      int size = set2.size();
      int[] res = new int[size];
      int j = 0;
      for (Integer integer : set2) {
         res[j++] = integer;
      }
      return res;
   }
}
