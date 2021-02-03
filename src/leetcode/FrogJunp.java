package leetcode;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 *
 * @author xiaohei
 * @date 2020年 08月04日 22:54:03
 */
public class FrogJunp {
    /**
     * 我们从最简单的情况开始分析，当n=1时，青蛙只有一种跳法，也就是跳1级台阶；
     * 当n=2时，青蛙有两种跳法，一种是一次跳1级，一种是一次跳两级；
     * 而当n=3时，青蛙最后一次跳的时候有两种可能，一种是最后一次跳了1级，一种是最后一次跳了两级，
     * 这个时候我们不管青蛙前面是怎么跳的，只需要把最后一步跳1级的所有可能和最后一步跳2级的所有可能都加起来，
     * 就是n=3时所有的可能性。这样就将问题分解了。
     * 比如当n=10时，最后一步青蛙有两种跳法，跳1级或者跳2级，那么怎么才能跳到倒数第一步呢，跳完倒数第二步就该跳倒数第一步了，
     * 倒数第二步也有两种跳法，跳1级或者跳2级，怎么才能跳到倒数第二步呢，跳完倒数第三步…以此类推下去，
     * 到第一步或者第二步的时候我们就确切的知道了青蛙有几种跳法。
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
        int[] ints = new int[n + 1];
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        ints[0] = 0;
        ints[1] = 1;
        ints[2] = 2;
        for (int i = 3; i <= n; i++) {
            ints[i] = ints[i - 2] + ints[i - 1];
            ints[i] %= 1000000007;
        }
        return ints[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
