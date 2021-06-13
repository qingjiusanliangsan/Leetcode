package lc_2000.lc1734;

/**
 * @author qingjiusanliangsan
 * create 2021-05-11-13:05
 */
public class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length;
        int toatl=1^encoded[0];
        int[] tem = new int[n];
        int[] ret = new int[n+1];
        for(int i=2;i<=n+1;i++){
            toatl = toatl^i;
        }
        tem[0]=encoded[0];
        for(int i=1;i<n;i++){
            tem[i] = encoded[i]^tem[i-1];
            toatl = toatl^tem[i];
        }
//        for(int i=0;i<n;i++){
//            toatl = toatl^tem[i];
//        }
        ret[0] = toatl;
        for(int i=1;i<=n;i++){
            ret[i] = tem[i-1]^toatl;
        }
        return ret;
    }
}
