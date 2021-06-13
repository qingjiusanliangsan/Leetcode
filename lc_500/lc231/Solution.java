package lc_500.lc231;

/**
 * @author qingjiusanliangsan
 * create 2021-05-30-16:29
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        /*if(n==1){
            return true;
        }
        if(n<0 || n%2 == 1){
            return false;
        }
        if(Integer.bitCount(n)==1){
            return true;
        }
        return false;*/
        return n > 0 && (n & (n - 1)) == 0;
    }
}
