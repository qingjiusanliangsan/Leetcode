package Jianzhi.f39;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-11:00
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans=nums[0] ,count=0;
        for(int i=0;i<n;i++){
            if(count<=0){
                ans = nums[i];
                count=1;
                continue;
            }
            if(ans==nums[i]){
                count++;
            }
            else if(ans != nums[i]){
                count--;
            }
        }
        return ans;
    }
}