public class SmallestMultiple {
    public static boolean evenlyDivisible(int number){
        boolean flag=false;
        for (int i=1;i<=20;i++){
            if (number%i==0){
                flag=true;
                continue;
            }else {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int number=20;
        while (!evenlyDivisible(number)){
            number++;
        }
        System.out.println(number);
    }
}
