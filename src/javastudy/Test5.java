package javastudy;

/**
 * join方法  插队 合并
 * 插队到的是当前线程前面(join方法在哪线程中被调用的  , 插队到哪个线程)
 *
 */
public class Test5 {

    public static void main(String[] args) {
        First first = new First();
        first.start();

        try {
            first.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程执行了"+i+"次");
        }
    }
}

class First extends Thread{
    @Override
    public void run() {

        Second second = new Second();
        second.start();
        try {
            second.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("第一个线程执行了"+i+"次");
        }
    }
}

class Second extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("第二个线程执行了"+i+"次");
        }
    }
}
