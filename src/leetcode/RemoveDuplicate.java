package leetcode;

import java.util.*;

/**
 * 删除排序数组中的重复项
 *
 * @author xiaohei
 * @date 2020年 08月02日 16:11:50
 */
public class RemoveDuplicate {
    /**
     * 双指针
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * 这种方案并没有改变原数组，只是新建了一个数组而已，不符合题意，虽然题意只是相求数量
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        List list = new ArrayList();
        int num = -99;
        for (int i = 0; i < nums.length; i++) {
            if (num != nums[i]) {
                list.add(nums[i]);
                num = nums[i];
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums) + Arrays.toString(nums));
    }
}
