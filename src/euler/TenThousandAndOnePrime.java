package euler;

import java.util.ArrayList;
import java.util.List;

public class TenThousandAndOnePrime {
    static List<Integer> list=new ArrayList<>();
    public static boolean  isPrime(int number){
        boolean flag=true;
        for (int i=2;i<number;i++){
            if (number%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int number=3;
        list.add(2);
        while (list.size()<10001){
            if (!isPrime(number)){
                number++;
                continue;
            }else {
                list.add(number);
                number++;
                continue;
            }
        }
        System.out.println(list.get(list.size()-1));
    }

}
