package lc_500.lc436;

/**
 * @author qingjiusanliangsan
 * create 2021-04-08-16:45
 */
public class Solution {
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
