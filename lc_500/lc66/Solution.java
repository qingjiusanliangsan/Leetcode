package lc_500.lc66;

/**
 * @author qingjiusanliangsan
 * create 2021-06-13-11:48
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int a = 1;
        int tem;
        for(int i=n-1;i>=0;--i){
            tem = digits[i]+a;
            a = tem / 10;
            digits[i] = tem % 10;
            if(a == 0){
                break;
            }
        }
        if(a==0){
            return digits;
        }
        int[] ret = new int[n+1];
        ret[0] = 1;
        for(int i=0;i<n;i++){
            ret[i+1] = digits[i];
        }
        return ret;
    }
}
