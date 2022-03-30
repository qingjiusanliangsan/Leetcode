package lc_1000.lc7;

public class Solution {
    public int reverse(int x) {
        long tem = Math.abs(x);
        long ret = 0;
        while(tem !=0){
            ret = ret*10 + tem%10;
            tem = tem/10;
//            System.out.println(ret);
        }
        long xmax = Integer.MAX_VALUE;
        long xmin = Integer.MIN_VALUE;
        if(x <0){
            ret = -1 * ret;
        }
        if(ret<xmin || ret >xmax){
            return 0;
        }
        return (int)ret;
    }
    public static void main(String[] args){
        Solution so = new Solution();
        System.out.println(so.reverse(123));
    }
}
