package LearnJvm;

/**
 * @author qingjiusanliangsan
 * create 2022-03-05-16:40
 */
/**
 * Created by zhangshukang on 2018/8/2.
 */
public class StaticBind {


    public void run(Father father){
        System.out.println("father");
    }
    public void run(Son1 son1){
        System.out.println("son1");
    }
    public void run(Son2 son2){
        System.out.println("son2");
    }
    public static void main(String[] args) {
        Father son1 = new Son1();
        Father son2 = new Son2();
        StaticBind staticBind = new StaticBind();
        staticBind.run(son1);
        staticBind.run(son2);
    }
}

class Father{}

class Son1 extends Father{}

class Son2 extends Father{}
