public class Fibonacci {

    public static void main(String[] args) {
        int[] arrays=new int[50];
        arrays[0]=1;
        arrays[1]=2;
        int sum=arrays[1];
        for (int i=2;i<arrays.length;i++){
            arrays[i]=arrays[i-1]+arrays[i-1-1];
            if (arrays[i]>4000000){
                break;
            }
            if (arrays[i]%2==0){
                sum=sum+arrays[i];
            }
        }
        System.out.println(sum);
    }
}
