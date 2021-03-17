package javastudy;

/**
 * 子线程15次，主线程10次，然后反复
 */
public class Sync2 {
    public static Object lock = new Object();

    public static void main(String[] args) {
        //子线程
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    synchronized (lock) {

                        for (int j = 0; j < 10; j++) {
                            System.out.println("子循环循环第" + (j + 1) + "次");
                        }
                        //唤醒
                        lock.notify();
                        //等待
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
//主线程
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                //等待
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int j = 0; j < 15; j++) {
                    System.out.println("主循环循环第" + (j + 1) + "次");
                }
                //notify是要等到方法块走完才会释放资源的，所以它会一直走到下一个wait才会释放资源,所以子线程notify的时候就会接着主线程循环了
                lock.notify();
            }
        }
    }
}
