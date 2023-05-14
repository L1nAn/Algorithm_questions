/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/14 10:38
 */
public class No_05 {
   public String replaceSpace(String s) {
      char[] ch = s.toCharArray();
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < ch.length; i++) {
         if (ch[i] != ' ') {
            sb.append(ch[i]);
         } else {
            sb.append("%20");
         }
      }
      return sb.toString();
   }
}
