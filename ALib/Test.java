package ALib;

import competition.double_52.Sou1;

import java.sql.PseudoColumnUsage;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author qingjiusanliangsan
 * create 2022-08-16-19:04
 */
class A {
    public String show(D d){return "AD";};
    public String show(A a){return "AA";};
}
class B extends A{
    public String show(B b){return "BB";};
    public String show(A a){return "BA";};
}
class C extends B{}
class D extends B{}
public class Test implements Runnable{
    private static int num = 1000;
    public static void main(String[] args) {
        Test run = new Test();
        Thread thread1 = new Thread(run,"Thread1");
        Thread thread2 = new Thread(run,"Thread2");
        Thread thread3 = new Thread(run,"Thread3");
        thread1.start();
        thread2.start();
        thread3.start();


    }
    @Override
    public void run(){
        while (num>0){
            synchronized (Test.class){
                if(num > 0){
                    num = num -1;
                    System.out.println(Thread.currentThread().getName());
                    if(num == 0){
                        System.out.println("weizhi 0 !!");
                    }
                }
            }
        }
    }
}
