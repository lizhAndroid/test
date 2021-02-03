package leetcode;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 *
 * @author xiaohei
 * @date 2020年 08月04日 22:54:03
 */
public class Fibonacci {

    public static int fib(int n) {
        int[] ints = new int[n + 1];
        if (n == 0) return 0;
        ints[0] = 0;
        ints[1] = 1;
        for (int i = 2; i <= n; i++) {
            ints[i] = ints[i - 2] + ints[i - 1];
            ints[i] %= 1000000007;
        }
        return ints[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(100));
    }
}
