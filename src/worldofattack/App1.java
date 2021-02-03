package worldofattack;

/**
 * App1
 */
public class App1 {
    public static String versionCode = "X<cP[?PHNB<P?aj";
    public static int versionName = 15;

    public static void main(String[] args) {
        String flag = "";
        for (int i = 0; i < versionCode.length(); i++) {
            flag += (char) (versionCode.charAt(i) ^versionName );
        }
        System.out.println(flag);
    }

}
