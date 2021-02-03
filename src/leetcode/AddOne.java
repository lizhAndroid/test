package leetcode;

import java.util.Arrays;

/**
 * 66.加一
 *
 * @author xiaohei
 * @date 2020年 08月02日 22:56:28
 */
public class AddOne {
    public static int[] plusOne(int[] digits) {
        int[] ints = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{9};
        System.out.println(Arrays.toString(plusOne(ints)));
    }
}
