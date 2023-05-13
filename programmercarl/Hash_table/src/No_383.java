/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/13
 */
public class No_383 {
   public boolean canConstruct(String ransomNote, String magazine) {
      //因为是关于有限的字集，所以考虑用字符串
      int[] res = new int[26];
      for (int i = 0; i < magazine.length(); i++) {
         char c = magazine.charAt(i);
         res[c - 'a']++;
      }
      for (int i = 0; i < ransomNote.length(); i++) {
         char c = ransomNote.charAt(i);
         res[c - 'a']--;
      }
      // 如果数组中存在负数，说明ransomNote字符串总存在magazine中没有的字符
      for (int i : res) {
         if (i < 0) {
            return false;
         }
      }
      return true;
   }
}
