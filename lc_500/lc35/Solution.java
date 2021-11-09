package lc_500.lc35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int a=0,b=n-1,c;
        while(a<b){
            c = (a+b)/2;
            if(nums[a]>=target){
                return a;
            }
            if(nums[b]==target){
                return b;
            }
            if(nums[b]<target){
                return b+1;
            }
            if(nums[c]==target){
                return c;
            }
            else if(nums[c]<target){
                a = c+1;
                b = b-1;
            }
            else{
                a = a+1;
                b = c-1;
            }
        }
        if(nums[b]<target){
            return b+1;
        }
        return a;
    }
}
