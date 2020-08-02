package leetcode;

/**
 * 27.移除元素
 *
 * @author xiaohei
 * @date 2020年 08月02日 16:25:34
 */
public class RemoveElement {
    /**
     * 双指针 i是慢指针 j是快指针
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(ints, 2));
    }
}
