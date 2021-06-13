package lc_1000.lc561;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int ret=0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i=i+2){
            ret += nums[i];
        }
        return ret;
    }
}
