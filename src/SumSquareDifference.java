public class SumSquareDifference {
   static int sumOfSquare = 0;
    static int squareOfSum = 0;

    public static int SumOfSquare(int fromNumber, int naturalNumber) {
        for (int i = fromNumber; i <= naturalNumber; i++) {
            sumOfSquare = sumOfSquare + i * i;
        }
        return sumOfSquare;
    }

    public  static int SqureOfSum(int fromNumber, int naturalNumber) {
        for (int i = fromNumber; i <= naturalNumber; i++) {
            squareOfSum = squareOfSum + i;
        }
        return squareOfSum * squareOfSum;
    }

    public static void main(String[] args) {
        System.out.println(SqureOfSum(1,100)-SumOfSquare(1,100));
    }
}
