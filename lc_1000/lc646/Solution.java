package lc_1000.lc646;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2022-02-14-23:12
 */
public class Solution {
    public int findLongestChain(int[][] pairs) {
        int ans = 0;
        int n = pairs.length;
        int[][] num = new int[n][2];
        for(int i=0;i<n;++i){
            num[i][0]=1;
        }
        Arrays.sort(pairs,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];}
            else{
                return a[0]-b[0];
            }
        });
        for(int i=n-1;i>=0;--i){
            int tem = 0;
            for(int j=i+1;j<n;++j){
                if(pairs[i][1]<pairs[j][0]){
                    tem = num[j][1];
                    break;
                }
            }
            num[i][0]+=tem;
            ans = Math.max(ans,num[i][0]);
            num[i][1]=ans;
        }
        return ans;
    }
}