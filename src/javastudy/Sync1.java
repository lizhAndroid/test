package javastudy;

/**
 * 线程demo
 * 同一个对象-使用同一个对象锁是同步的
 * 不同对象-使用同一个对象锁有可能不同步，都使用this可能会同步
 * 同一个对象-两个线程，一个使用对象锁，一个使用类锁，也是线程不安全的，对象锁和类锁互不干扰，相互抢夺资源
 */
public class Sync1 {
    private static int ticket = 10;

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        SynchronizedDemo synchronizedDemo1 = new SynchronizedDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedDemo.syncMethod();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedDemo.syncClassMethod();
            }
        }).start();
    }

    //对象锁
    public static void sellTicket() {
        Object object = new Object();
        synchronized (object) {
            ticket--;
            System.out.println(Thread.currentThread().getName() + "剩余的票数：" + ticket);
        }
    }

    //类锁
    public static void sellTicketClass() {
        synchronized (Sync1.class) {
            ticket--;
            System.out.println(Thread.currentThread().getName() + "剩余的票数：" + ticket);
        }
    }

    public static class SynchronizedDemo {
        private int ticket = 10;

        //同步方法，对象锁
        public synchronized void syncMethod() {
            for (int i = 0; i < 10000; i++) {
                ticket--;
                System.out.println(Thread.currentThread().getName() + "剩余的票数：" + ticket);
            }
        }

        //同步块，对象锁
        public void syncThis() {
            synchronized (this) {
                for (int i = 0; i < 1000; i++) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "剩余的票数：" + ticket);
                }
            }
        }

        //同步class对象，类锁
        public void syncClassMethod() {
            synchronized (SynchronizedDemo.class) {
                for (int i = 0; i < 500; i++) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "剩余的票数：" + ticket);
                }
            }
        }
    }

}
