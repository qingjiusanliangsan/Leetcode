package aBhand.proxyExam.staticProxyExam;

/**
 * @author qingjiusanliangsan
 * create 2022-04-09-22:57
 */
public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}