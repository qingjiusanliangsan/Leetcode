package lc_500.lc475;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-11-20-12:38
 */
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int res = 0;
        Arrays.sort(heaters);
        for(int e: houses){
            int k1 = binmin(heaters,0,heaters.length-1,e);
            int k2 = binmax(heaters,0,heaters.length-1,e);
            res = Math.max(res,Math.min(k1,k2));
        }
        return res;
    }
    public int binmin(int[] nums,int a,int b,int tar){
        int ans = -1;
        while(a<=b){
            int c = (b-a)/2 + a;
            if(nums[c]<=tar){
                ans = nums[c];
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        if(ans != -1){
            return Math.abs(ans-tar);
        }
        return Integer.MAX_VALUE;
    }
    public int binmax(int[] nums,int a,int b,int tar){
        int ans = -1;
        while(a<=b){
            int c = (b-a)/2 + a;
            if(nums[c]>=tar){
                ans = nums[c];
                b = c-1;
            }
            else{
                a = c+1;
            }
        }
        if(ans != -1){
            return Math.abs(ans-tar);
        }
        return Integer.MAX_VALUE;
    }
}
