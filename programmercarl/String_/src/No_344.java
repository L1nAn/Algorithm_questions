/**
 * @author :马治伟
 * @version :1.0
 * @Date  : 2023/5/14
 */
public class No_344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        //正确代码
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        // 改进下面的错误代码就是传入数组，那不和上边的一样了吗。最后还多一个调用方法的步骤，多此一举！！！

    }
}
        /* --错误代码
        while (left < right) {
            swap(s[left], s[right]);
            left++;
            right--;
        }
    }
    private void swap(char c1, char c2) {
        char temp = c1;
        c1 = c2;
        c2 = temp;
    }*/

