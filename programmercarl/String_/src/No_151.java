/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/14 10:44
 */
public class No_151 {
   public static void main(String[] args) {
      String s = "the sky is blue";
      String s1 = new No_151().reverseWords(s);
      System.out.println(s1);
   }
   public  String reverseWords(String s) {

      // 处理空格
      StringBuffer sb = trim(s);
      // 先把字符串全部反转
      reverseString(sb, 0, sb.length() - 1);
      // 然后再去把字符串里的每个单词再次反转
//      reverseEachWord(sb);
     swap(sb);
      return sb.toString();
   }

   // 反转各个单词
   private void reverseEachWord(StringBuffer sb) {
      int start = 0;
      int end = 1;
      int n = sb.length();
      while (start < n) {
         while (end < n && sb.charAt(end) != ' ') {// 找到空格就停下，然后执行后面的代码
            end++;
         }
         reverseString(sb, start, end - 1);// 进行反转。最后一个单词也会执行的，
         start = end + 1; // end + 1 是因为此时end的元素是空格，所以要加1.
         end = start + 1;
      }
   }
   private void swap(StringBuffer sb) {
      int start = 0;
      for (int i = 0; i < sb.length(); i++) {
         if (sb.charAt(i) == ' ') { // 这样判断的话，最后一个单词是不会反转的，因为空格最后面没有啊。
            reverseString(sb, start, i - 1);
            start = i + 1;
         }
         if (i == sb.length() - 1) {
            reverseString(sb, start, i);
         }
      }
   }

   // 反转字符串指定区间【start, end】 的字符
   private void reverseString(StringBuffer sb, int start, int end) {
      while (start < end) {
         char temp = sb.charAt(start);
         sb.setCharAt(start, sb.charAt(end));
         sb.setCharAt(end, temp);
         start++;
         end--;
      }
   }


   // 处理空格
   private static StringBuffer trim(String s) {
      StringBuffer sb = new StringBuffer();
      // 首先处理前后的空格
      int start = 0;
      int end = s.length() - 1;
      while (s.charAt(start) == ' ') {
         start++;
      }
      while (s.charAt(end) ==' ') {
         end--;
      }
      // 接下来在sb添加元素
      while (start <= end) {
         char c = s.charAt(start);
         // 在sb中写入s 的元素，但是有两个限制条件
         if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
            // 如果当前 c 不是空的时候，那么肯定是要加入的，然后 如果sb里面的最后一个元素是空的时候，
            // 因为我们只需要一个空格，所以也要添加元素。如果是，sb最后的元素是空格，但是c 也是空格，那么就不会添加到sb中
            sb.append(c);
         }
         // 无论什么情况，start都会加1
         start++;
      }
      /* 错误方式
      for (int i = 0; i < ch.length; i++) {
         if (ch[i] == ' ' && sb.charAt(sb.length() - 1) == ' ') {
            i++;
            sb.append(ch[i]);
         } else {
            sb.append(ch[i]);
         }
      }*/
      return sb;
   }
   // 翻转字符数组
   /* 方法没有用对，对待StringBuffer这种就得用setCharAt()这种方法。
   private void swap(StringBuffer sb, int i, int j) {
      while (i < j) {
         char temp = sb.charAt(i);
         sb.charAt(i) = sb.charAt(j);
         i++;
         j--;
      }
   }*/
}
