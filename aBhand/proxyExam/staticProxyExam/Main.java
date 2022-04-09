package aBhand.proxyExam.staticProxyExam;

/**
 * @author qingjiusanliangsan
 * create 2022-04-09-22:57
 */
public class Main {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java---");
    }
}