package lc_2000.lc1716;

/**
 * @author qingjiusanliangsan
 * create 2022-01-15-9:30
 */
public class Solution {
    public int totalMoney(int n) {
        int a = n/7;
        int b = n%7;
        return (49+a*7)*a/2 + a*b + (1+b)*b/2;
    }
}
