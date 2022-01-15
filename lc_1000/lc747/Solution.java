package lc_1000.lc747;


public class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if(n ==1){
            return 0;
        }
        int a=nums[0],index=0,b=1000;
        for(int i=0;i<n;i++){
            if(nums[i]>a){
                a = nums[i];
                index = i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=a){
                b = Math.max(b,nums[i]);
            }
        }
        if(a/b >=2){
            return index;
        }

        return -1;
    }
}
