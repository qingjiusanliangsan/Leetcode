package lc_1000.lc334;

/**
 * @author qingjiusanliangsan
 * create 2022-01-12-23:18
 */
public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n<3){
            return false;
        }
        int[] arrmax = new int[n];
        arrmax[n-1] = nums[n-1];
        int a=nums[0];
        for(int i=n-2;i>=0;--i){
            arrmax[i] = Math.max(arrmax[i+1],nums[i]);
        }
        for(int i=1;i<n-1;i++){
            a = Math.min(a,nums[i-1]);
            if(nums[i]>a && nums[i]<arrmax[i+1]){
                return true;
            }
        }

        return false;
    }
}
