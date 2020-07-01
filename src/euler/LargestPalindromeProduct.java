package euler;

import java.util.ArrayList;
import java.util.List;

public class LargestPalindromeProduct {
    static List<Integer> list=new ArrayList<>();
    public static boolean isPalindrome(int palindromeNumber){
        String palindromeString = String.valueOf(palindromeNumber);
        boolean flag=false;
        for (int i = 0;i<Math.ceil(palindromeString.length()/2);i++){
            if (palindromeString.charAt(i)==palindromeString.charAt(palindromeString.length()-1-i)){
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
        for (int i=100;i<1000;i++){
            for (int j =100;j<1000;j++){
                if (isPalindrome(i*j)){
                    list.add(i*j);
                }
            }
        }
        int max=0;
        for (Integer i:list){
            if (i>max){
                max=i;
            }
        }
        System.out.println(max);

    }

}
