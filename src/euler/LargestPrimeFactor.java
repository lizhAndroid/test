package euler;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {
    public static List<Integer> list=new ArrayList<>();
    private static Long multiplication=1L;
    public static void   getFirstPrime(long primeNumber){
        for (int i=2;i<=primeNumber;i++){
            if (primeNumber%i==0){
                list.add(i);
                getFirstPrime(primeNumber/i);
                break;
            }
        }
    }

    public static void main(String[] args) {
//        int primeNumber=600851475143l;
        getFirstPrime(600851475143L);
        for (int i:list){
            System.out.println(i);
        }


    }
}
