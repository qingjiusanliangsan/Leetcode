package lc_1000.lc81;

/**
 * @author qingjiusanliangsan
 * create 2021-04-07-23:15
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        boolean ret = false;
        int n = nums.length;
        if(target==nums[0]||target==nums[n-1]){
            return true;
        }
        if(target>nums[0]){
            for(int i=1;i<n-1;i++){
                if(target==nums[i]){
                    return true;
                }
                if(target<nums[i]){
                    return false;
                }
            }
        }
        else if(target<nums[n-1]){
            for(int i=n;i>0;i--){
                if(target==nums[i]){
                    return true;
                }
                if(target>nums[i]){
                    return false;
                }
            }
        }
        return false;
    }

}
