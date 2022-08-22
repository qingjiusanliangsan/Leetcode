package ALib;

/**
 * @author qingjiusanliangsan
 * create 2022-08-17-14:34
 */
public class deadLockTest {
    public static void main(String[] args) {
        dataSource da = new dataSource();

        //开启线程A，先获取A锁，在获取B锁
        new Thread(()->{
            try {
                da.getLockA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程A").start();
        //开启线程B，先获取B锁，在获取A锁
        new Thread(()->{
            try {
                da.getLockB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"线程B").start();
    }

}

//资源类
class dataSource{
    private String lockA = "A锁";
    private String lockB = "B锁";

    //getLockA()方法先获取A锁，在获取B锁
    public void getLockA() throws InterruptedException {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName() + "已经获取" +lockA);
            Thread.sleep(1000); //获取A锁后，睡眠1秒钟，让getLockB()方法获取B锁
            System.out.println(Thread.currentThread().getName() + "尝试获取" +lockB);
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName() + "已经获取" +lockB);
            }
        }
    }
    //getLockB()方法先获取B锁，在获取A锁
    public void getLockB() throws InterruptedException {
        synchronized (lockB){
            System.out.println(Thread.currentThread().getName() + "已经获取" +lockB);
            Thread.sleep(1000);//获取B锁后，睡眠1秒钟，让getLockA()方法获取A锁
            System.out.println(Thread.currentThread().getName() + "尝试获取" +lockA);
            synchronized (lockA){
                System.out.println(Thread.currentThread().getName() + "已经获取" +lockA);
            }
        }
    }
}