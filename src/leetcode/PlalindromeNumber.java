package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 9.回文数
 */
public class PlalindromeNumber {
    public static boolean isPalindrome(int x) {
        boolean flag = true;
        String s = String.valueOf(x);
        Map<Integer, String> map = new HashMap<>();
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            map.put(i, split[i]);
        }
        for (int i = 0; i <= split.length/2; i++) {
            if (!map.get(split.length - 1 - i).equals(split[i])) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        if (isPalindrome(13231)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
