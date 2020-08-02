package leetcode;

/**
 * 69.x 的平方根
 *
 * @author xiaohei
 * @date 2020年 08月02日 17:57:26
 */
public class SqrtX {
    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(0));

    }
}
