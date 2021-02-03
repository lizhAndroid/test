package leetcode;

/**
 * 28. 实现 strStr()
 *
 * @author xiaohei
 * @date 2020年 08月05日 22:18:28
 */
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (haystack != null && haystack.equals(needle)) {
            return 0;
        }
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        int length = haystack.length();
        int length1 = needle.length();
        int index = 0;
        int length3 = length;
        int i = length1;
        while (i >= 0 && length3 >= length1 && index + length1 <= length) {
            if (haystack.charAt(i - 1) != needle.charAt(i - 1)) {
                boolean flag = false;
                for (int j = 0; j < length1; j++) {
                    if (needle.charAt(j) == haystack.charAt(i)) {
                        flag = true;
                        index = i;
                        haystack = haystack.substring(index);
                        length3 = haystack.length();
                        break;
                    }
                }
                if (!flag) {
                    index = index + length1;
                    haystack = haystack.substring(index);
                    length3 = haystack.length();
                }

            } else {
                i = i - 1;
                if (i == 0) {
                    return index;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aaabbaa", "e"));
    }
}
