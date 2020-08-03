package leetcode;

/**
 * 415. 字符串相加
 *
 * @author xiaohei
 * @date 2020年 08月03日 23:08:35
 */
public class AddStrings {
    public static String addStrings(String num1, String num2) {
        //char相加减自动转型为int 根据ascii码 char-'0'=本身的int值
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;//加上上一位进的位数
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {

    }
}
