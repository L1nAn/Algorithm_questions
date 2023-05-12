/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/11
 */
public class No_59 {
    public int[][] generateMatrix(int n) {
        int loop = 0;//控制循环次数
        //首先创建二位数组
        int[][] arr = new int[n][n];
        //然后确定好loop的属性，这是要进行判断第几圈的
        int start = 0;//每次循环的开始点
        int count = 1;//定义的填充数字
        // i 代表行 j 代表列
        int i, j;
        while (loop++ < n / 2) {//判断边界后，loop 从1开始
            //给上侧赋值
            for (j = start; j < n - loop; j++) {
                arr[start][j] = count++;
            }
            //给右侧赋值
            for (i = start; i < n - loop; i++) {//这i的初始值一定得是start,否则循环的时候会出现问题。
                arr[i][j] = count++;
            }
            //给下侧赋值
            for (; j > start; j--) {
                arr[i][j] = count++;
            }
            //给左侧赋值
            for (; i > start; i--) {
                arr[i][j] = count++;
            }
            start++;
        }
        if (n % 2 != 0) {
            arr[start][start] = n * n;
        }
        return arr;
    }
}
