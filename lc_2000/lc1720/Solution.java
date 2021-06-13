package lc_2000.lc1720;

/**
 * @author qingjiusanliangsan
 * create 2021-05-06-12:03
 */
public class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] ret = new int[n+1];
        ret[0] = first;
        for(int i=0;i<n;i++){
            ret[i+1] = encoded[i]^ret[i];
        }
        return ret;
    }
}
