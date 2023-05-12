/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_242 {
   public boolean isAnagram(String s, String t) {
       //利用数组做记录来进行做题，因为所有字符加起来是有限的
       int[] records = new int[26];

       //遍历字符串s
       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           records[c - 'a']++;
       }
       //遍历字符串t
       for (int i = 0; i < t.length(); i++) {
           char c = t.charAt(i);
           records[c - 'a']--;
       }
       //对records数组进行遍历，看是否才能在元素不等于0的情况
       for (int i = 0; i < records.length; i++) {
           if (records[i] != 0) {
               return false;
           }
       }
       return true;
   }
}
