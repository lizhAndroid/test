package javastudy;

/**
 * 静态内部类单例模式
 */
public class Singleton3 {
    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }
    private Singleton3 (){}
    public static final Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
