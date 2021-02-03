package leetcode;

/**
 * 35.搜索插入位置
 *
 * @author xiaohei
 * @date 2020年 08月02日 17:05:24
 */
public class ResearchInsertIndex {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left=0,right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target)
                left=mid+1;
            else right=mid-1;
        }
        return left;
    }
    public static int searchInsert2(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert2(ints, 3));
    }
}
