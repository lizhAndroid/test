package euler;

/**
 * Created by xiaohei on 2019/9/4 0004    14:28.
 */
public class HighlyDivisibleTriangularNumber {
    public static boolean getDivisibleNumber(int number) {
        boolean flag = false;
        int count = 0;
        int i=0;
        for (i = 1; i*i < number; i++) {
            if (number % i == 0) {
                count+=2;
            }
        }
        if (i*i==number){
            count++;
        }
        if (count > 500) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        int divise = 0;//现在的总和

        for (int i = 1; i < Long.MAX_VALUE; i++) {
            if (getDivisibleNumber(divise)) {
                break;
            } else {
                divise = divise + i;
                System.out.println(divise);
            }
        }
        System.out.println(divise);
    }
}
