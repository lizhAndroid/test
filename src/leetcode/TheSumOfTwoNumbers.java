package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 力扣--两数之和
 */
public class TheSumOfTwoNumbers {
    public static int[] sum(int[] nums, int target) {
        int[] result = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                break;
            } else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        flag = true;
                    }
                }

            }
        }
        return result;
    }

    /**
     * 两遍哈希表
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] sum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                result[0] = i;
                result[1] = map.get(complement);
                break;
            }
        }


        return result;
    }

    /**
     * 一遍哈希表--最快的
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] sum3(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }


        return result;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{2,2,3,4,5};
        int target = 5;
        int[] sum = sum3(ints, target);
        System.out.println(Arrays.toString(sum));
    }
}
