package lc_1000.lc754;

public class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int res = (int)Math.pow(2.0*target,0.5)-1;
        while(true){
            int tem = res*(res+1)/2;
            if(tem >= target && (tem-target)%2==0){
                break;
            }
            res++;
        }
        return res;
    }
}
