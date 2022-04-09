package aBhand.proxyExam.jdkExam;

/**
 * @author qingjiusanliangsan
 * create 2022-04-09-22:34
 */
public class Demo {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}