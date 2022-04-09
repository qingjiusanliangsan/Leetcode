package aBhand.proxyExam.cglibExam;

/**
 * @author qingjiusanliangsan
 * create 2022-04-09-22:47
 */
public class Demo {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
    }
}