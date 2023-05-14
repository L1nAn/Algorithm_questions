/**
 * author :马治伟
 * version :1.0
 * Date : 2023/5/14 16:19
 */
public class No_58_ {
    public static void main(String[] args) {
        String s = "abcdefg";
        String s1 = new No_58_().reverseLeftWords(s, 2);
        System.out.println(s1);
    }
    public String reverseLeftWords(String s, int n) {
        // 解法一：先拼接后面的，在拼接前面得。
      /*StringBuffer sb = new StringBuffer();
      for (int i = n; i < s.length(); i++) {
         sb.append(s.charAt(i));
      }
      for (int i = 0; i < n; i++) {
         sb.append(s.charAt(i));
      }
      return sb.toString();*/
        // 解法二：笔记上边的思路解法
        int len = s.length();
        StringBuffer sb = new StringBuffer(s);
        reverseString(sb, 0, n - 1);// 先反转前面的
        reverseString(sb, n, len - 1);// 在反转后面的
        reverseString(sb, 0, len - 1);// 然后在整体反转
        return sb.toString();
    }

    private void reverseString(StringBuffer sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
//            sb.charAt(start) = sb.charAt(end); 这种交换方式不可行  sb.charAt(start) 这方法是得到start处的值，不能进行替换
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
