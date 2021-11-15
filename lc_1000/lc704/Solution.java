package lc_1000.lc704;

public class Solution {
    public int search(int[] nums, int target) {
        int a=0,b=nums.length-1,c;
        while(a<=b){
            c = (b-a)/2 + a;
            if(nums[c]==target){
                return c;
            }
            else if(nums[c]<target){
                a = c +1;
            }
            else{
                b = c-1;
            }
        }
        return -1;
    }
}
