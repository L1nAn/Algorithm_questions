import java.util.HashSet;
import java.util.Set;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/12
 */
public class No_202 {
   public boolean isHappy(int n) {
      Set<Integer> set = new HashSet<>();
//      while (n != 1 || !set.contains(n)) {
      while (n != 1 || !set.contains(n)) {//这两个条件肯定是并且的意思啊，要不如何判断啊
         set.add(n);
         n = g(n);
      }
//      if (n == 1) {
//         return true;
//      }
//      return false;  //完善代码，用一行代码就搞定这个判断
      return n == 1;
   }

   private int g(int n) {
      //如何确定这是几位数
      int res = 0;
      while (n > 0) {//这个循环求一个数值的各单位数字很牛逼，
         int temp = n % 10;
         res += temp * temp;
         n = n / 10;
      }
      return res;
   }
}
