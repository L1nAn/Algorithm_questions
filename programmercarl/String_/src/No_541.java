/**
 * Date : 2023/5/14 10:06
 * author :马治伟
 * version :1.0
 */
public class No_541 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2 * k) {
            // 每隔 2k 个字符的前 k 个字符进行反转
            // 剩余字符小于2k但大于或者等于k个，则反转前k个字符
            if (i + k <= ch.length) {// 这个判定条件就是符合上面两种情况，也就是 k <= ch.length - i,这种情况不就是剩余字符大于或等于k个吗！
                reverse(ch, i, i + k -1);
                continue;
            }
            // 剩余字符少于k个，则将剩余字符全部反转
            reverse(ch, i, ch.length - 1);
        }
        return new String(ch);
    }
    private void reverse(char[] ch, int i, int j) {
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
