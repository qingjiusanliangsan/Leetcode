package Jianzhi.f42;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-11:18
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int k=nums[0];
        int ans = nums[0];
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
            if(k<0){
                ans = Math.max(ans,nums[i]-k);
            }
            else{
                ans = Math.max(ans,nums[i]);
            }
            k = Math.min(k,nums[i]);
        }
        return ans;
    }
}