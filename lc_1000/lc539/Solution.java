package lc_1000.lc539;

import java.util.Arrays;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2022-01-18-19:13
 */
public class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        if(n>1440){
            return 0;
        }
        int[] num = new int[n];
        int ans;
        for(int i=0;i<n;i++){
            String tem = timePoints.get(i);
            num[i] = 60*Integer.valueOf(tem.substring(0,2))+Integer.valueOf(tem.substring(3));
        }
        Arrays.sort(num);
        ans = num[0]+1440-num[n-1];
        for(int i=1;i<n;i++){
            ans = Math.min(ans,num[i]-num[i-1]);
        }
        return ans;
    }
}