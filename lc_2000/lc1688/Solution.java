package lc_2000.lc1688;

/**
 * @author qingjiusanliangsan
 * create 2022-01-25-13:56
 */
public class Solution {
    public int numberOfMatches(int n) {
        int res = 0;
        while (n>1){
            res +=n%2;
            n=n/2;
            res+=n;
        }
        return res;
    }
}
