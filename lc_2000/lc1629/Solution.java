package lc_2000.lc1629;

/**
 * @author qingjiusanliangsan
 * create 2022-01-09-10:50
 */
public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n=releaseTimes.length;
        int temt,t = releaseTimes[0];
        char temr,res = keysPressed.charAt(0);
        for(int i=1;i<n;i++){
            temt = releaseTimes[i] - releaseTimes[i-1];
            temr = keysPressed.charAt(i);
            if(temt>t){
                t=temt;
                res=temr;
            }
            else if(temt==t && temr>res){
                res=temr;
            }
        }
        return res;
    }
}
