package euler;

import java.math.BigInteger;

/**
 * Created by xiaohei
 */
public class PowerDigitSum {
    public static void main(String[] args) {
        BigInteger b2 = new BigInteger("2");
        for (int i = 1; i < 1000; i++) {
            b2 = b2.multiply(new BigInteger("2"));
        }
        String x = b2.toString();
        System.out.println(x);
        int sum=0;
        for (int i = 0; i < x.length(); i++) {
            sum=sum+Integer.parseInt(x.substring(i,i+1));
        }
        System.out.println(sum);
    }
}
