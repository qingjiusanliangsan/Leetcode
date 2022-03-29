package LearnJvm;

/**
 * @author qingjiusanliangsan
 * create 2022-03-05-15:50
 */
public class StaticDispatch {
    static abstract class Human {}
    static class Man extends Human {}
    static class Woman extends Human {}
    public void sayHello(Human guy) {
        System.out.println("hello,guy!");
    }
    public void sayHello(Man guy) {
        System.out.println("hello,gentleman!");
    }
    public void sayHello(Woman guy) {
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        Man man1 = new Man();
        Woman woman1 = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);
        sr.sayHello(woman);
        sr.sayHello(man1);
        sr.sayHello(woman1);
    }
}
//class Human {}
//class Man extends Human {}
//class Woman extends Human {}