public class SpecialPythagoreanTriplet {
    public static boolean isPythagorean(int a, int b, int c) {
        boolean flag = false;
        if (a * a + b * b == c * c) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= 1000; j++) {
                for (int k = 0; k <= 1000; k++) {
                    if (i < j && j < k) {
                        if (i + j + k == 1000) {
                            if (isPythagorean(i, j, k)) {
                                System.out.println(i * j * k);
                            }
                        }
                    }
                }
            }
        }
    }
}
