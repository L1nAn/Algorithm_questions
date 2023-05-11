/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/11
 */
public class No_704 {
    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     * 题目：给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
     * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     */
    public int search(int[] nums, int target) {
        //题目网址
        //https://leetcode.cn/problems/binary-search/
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = left + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
