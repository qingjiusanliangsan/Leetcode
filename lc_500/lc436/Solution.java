package lc_500.lc436;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2021-04-08-16:45
 */
public class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] res = new int[n];
        for(int i =0;i<n;i++){
            res[i] = intervals[i][1];
            intervals[i][1] = i;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]) return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
        for(int i =0;i<n;i++){
            res[i] = nfind(intervals,0,n-1,res[i]);
        }
        return res;
    }
    public int nfind(int[][] num,int a,int b,int target){
        int ans = -1;
        while(a<=b){
            int c = (b-a)/2+a;
            if(num[c][0]>=target){
                ans = num[c][1];
                b = c-1;
            }
            else{
                a = c+1;
            }
        }
        return ans;
    }
//    ------------------------------------  //
    public int findMin(int[] nums) {
        int n = nums.length;
        int a=0;
        int b=n-1;
        int tem;
        if(n==1){
            return nums[0];
        }
        while(a<b){
            if(a+1<n&&nums[a]<nums[a+1]&&b-1>=0&&nums[b]>nums[b-1]){
                tem = (a+b)/2;
                if(nums[tem]<nums[tem+1]&&nums[tem]<nums[tem-1]){
                    return nums[tem];
                }
                else if(nums[tem]>nums[tem+1]&&nums[tem]>nums[tem-1]){
                    return nums[tem+1];
                }
                else{
                    if(nums[tem]>nums[n-1]){
                        a = tem;
                        continue;
                    }
                    else if(nums[tem]<nums[n-1]){
                        b = tem;
                        continue;
                    }
                }
            }
        }
        return nums[a];
    }
}
