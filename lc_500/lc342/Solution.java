package lc_500.lc342;

/**
 * @author qingjiusanliangsan
 * create 2021-05-31-0:09
 */
public class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(Integer.bitCount(n)==1&&Integer.bitCount(n-1)%2==0){
            return true;
        }
        return false;
//        return n>0&&Integer.bitCount(n)==1&&Integer.bitCount(n-1)%2==0;
    }
}
