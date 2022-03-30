package lc_1000.lc209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int res = n;
        int[] tem = new int[n+1];
        tem[0] = 0;
        for(int i=0;i<n;i++){
            tem[i+1] = nums[i]+tem[i];
        }
        if(target > tem[n]){
            return 0;
        }
        int a =0,b = 1;
        for(;a<n && b<=n ;a++){
            while(b<=n && tem[b]-tem[a] < target){
                ++b;
            }
            if(b<=n && tem[b]-tem[a] >= target){
                res = Math.min(res,b-a);
            }

        }
        return res;
    }
}