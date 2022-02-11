package lc_2000.lc1984;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2022-02-11-14:47
 */

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=k-1;i<n;i++){
            res = Math.min(res,nums[i]-nums[i-k+1]);
        }
        return res;
    }
}