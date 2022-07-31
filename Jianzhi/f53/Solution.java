package Jianzhi.f53;

import java.util.ArrayList;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-13:12
 */
public class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int ans = n;
        for(int i=0;i<n;i++){
            ans = ans^i;
            ans = ans^nums[i];
        }
        return ans;
    }
}