import java.math.BigInteger;

/**
 * Created by xiaohei
 */
public class FactorialDigitSum {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("1");

        BigInteger temp = new BigInteger("2");

        for (int i = 2; i <= 100; i++) {
            temp = BigInteger.valueOf(i);
            b = b.multiply(temp);
        }

        System.out.println(b);
        int res = 0;
        BigInteger qu[] = new BigInteger[2];
        while (b.compareTo(new BigInteger("0")) != 0) {
            qu = b.divideAndRemainder(new BigInteger("10"));
            res += qu[1].intValue();
            b = qu[0];
        }

        System.out.println(res);

    }
}