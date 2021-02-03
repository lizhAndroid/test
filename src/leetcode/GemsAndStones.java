package leetcode;

/**
 * Created by xiaohei
 * 771.宝石与石头
 */
public class GemsAndStones {

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i)==J.charAt(j)){
                    count+=1;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("123","134231234"));
    }

}
