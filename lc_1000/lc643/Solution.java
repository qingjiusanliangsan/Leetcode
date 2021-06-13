package lc_1000.lc643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double ret;
        long sumN=0;
        for(int j=0;j<k;j++){
            sumN += nums[j];
        }
        ret = sumN;
        for(int i =k;i<n;i++){
            int star = i-k+1;
            sumN = sumN - nums[star-1] + nums[i];
            ret = ret > sumN ? ret : sumN;
        }
        ret = ret/(double)(k);
        return ret;
    }
     public static void main(String[] args){
         int[] nums = {1,3,-1,-3,5,3,6,7};
         int k = 3;
         Solution so = new Solution();

         System.out.println(so.findMaxAverage(nums,k));
     }
}
