package lc_2000.lc1608;

import java.util.Arrays;

public class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int p=n,t;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                t = p;
            }
            else{
                t = n-i;
            }
            if(t<=nums[i]){
                if(i==0 || t>nums[i-1]) {
                    return t;
                }
            }
            p = t;
        }
        return -1;
    }

}
