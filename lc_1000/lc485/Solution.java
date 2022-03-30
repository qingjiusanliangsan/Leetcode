package lc_1000.lc485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ret=0;
        int tem;
        int n = nums.length;
        if(n==0){
            return ret;
        }
        for(int i=0;i<n;i++){
            tem=0;
            if(nums[i]==1){
                tem++;
                for(i=i+1;i<n;i++){
                    if(nums[i]==1){
                        tem++;
                    }
                    else{
                        break;
                    }
                }
                ret = Math.max(ret,tem);
            }
        }
        return ret;
    }
}
