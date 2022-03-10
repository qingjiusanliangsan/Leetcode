package LearnJvm;

/**
 * @author qingjiusanliangsan
 * create 2022-03-05-16:20
 */
public class DynamicDispatch {
    static abstract class Human {
        protected abstract void sayHello();
    }
    static class Man extends Human {
        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }
    static class Woman extends Human {
        @Override
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }
    public static void main(String[] args) {
//        Human man = new Man();
//        Human woman = new Woman();
//        man.sayHello();
//        woman.sayHello();
//        man = new Woman();
//        man.sayHello();

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d); //t
        System.out.println(c.equals(d)); //t
        System.out.println(e == f); //f
        System.out.println(e.equals(f)); //f
        System.out.println(c == (a + b)); //t
        System.out.println(c.equals(a + b)); //t
        System.out.println(g == (a + b)); //t
        System.out.println(g.equals(a + b)); //f
        String s1 = "hlt";
        String s2 = s1;
        String s3 = s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s3 = "lsq";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}