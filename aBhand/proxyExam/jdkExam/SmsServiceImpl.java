package aBhand.proxyExam.jdkExam;

/**
 * @author qingjiusanliangsan
 * create 2022-04-09-22:32
 */
public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
