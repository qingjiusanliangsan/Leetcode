package lc_2000.lc1446;

public class Solution {
    public int maxPower(String s) {
        int res = 1,n=s.length(),l=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                ++l;
            }
            else{
                res = Math.max(res,l);
                l=1;
            }
        }
        return Math.max(res,l);
    }
}