package lc_2000.lc2106;

/**
 * @author qingjiusanliangsan
 * create 2022-02-26-10:21
 */
public class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int a = nums[0];
        for(int i=1;i<n;++i){
            if(nums[i]>a){
                ans = Math.max(ans,nums[i]-a);
            }
            else{
                a = Math.min(a,nums[i]);
            }
        }
        return ans;
    }
}
