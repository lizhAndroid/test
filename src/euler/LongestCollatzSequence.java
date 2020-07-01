package euler;

import java.util.ArrayList;
import java.util.List;

/**
 * 最长Collatz序列
 */
public class LongestCollatzSequence {
    private static int maxNumber;
    private static int maxLength = -99;

    public static int rule(int number) {
        if (number % 2 == 0) {
            return number / 2;
        } else {
            return 3 * number + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 500000; i < 1000000; i++) {
            List<Integer> list = new ArrayList<>();
            int rule = rule(i);
            do {
                list.add(rule);
                rule = rule(rule);
            } while (rule != 1);
            System.out.println(i + "--------" + list.size() + "----------" + list.toString());
            if (list.size() > maxLength) {
                maxLength = list.size() + 1;//没有把1算进去
                maxNumber = i;
            }
        }
        System.out.println(maxNumber);
    }
}
