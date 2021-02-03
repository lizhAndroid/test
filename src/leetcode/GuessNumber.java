package leetcode;

/**
 * Created by xiaohei
 * Lcp 01.猜数字
 */
public class GuessNumber {
    private static int[] guess = new int[]{2, 2, 3};
    private static int[] answer = new int[]{3, 2, 1};

    public static int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                count += 1;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(game(guess, answer));
    }
}
