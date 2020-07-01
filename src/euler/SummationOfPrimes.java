package euler;

public class SummationOfPrimes {
    public static Boolean isPrime(int value) {
        Boolean flag = true;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        long sum=0;
        for (int i=2;i<=2000000;i++){
            if (isPrime(i)){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
