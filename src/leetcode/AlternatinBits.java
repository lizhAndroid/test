package leetcode;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by xiaohei
 */
public class AlternatinBits {

    private static String str;

    public static boolean hasAlternatingBits(int n) {
        boolean flag = true;
        BigInteger bigInteger = new BigInteger(n + "");
        str = bigInteger.toString(2);
        System.out.println(str);
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i+1);
            System.out.println(c1 + " " + c2);
            if (c1 == c2) {
                flag = false;
            }
            System.out.println(flag);
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
}
