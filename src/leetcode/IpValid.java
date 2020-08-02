package leetcode;

/**
 * Created by xiaohei
 * 1108.IP无效化
 */
public class IpValid {
    public static String defangIPaddr(String address) {
       return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
