package lc_500.lc69;

public class Solution {
    public int mySqrt(int x) {
        int a = 0,b = x,c,ret = -1;
        while(a<=b){
            c = (b-a)/2 + a;
            if((long)c*c <= x){
                ret = c;
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        return ret;
    }
}