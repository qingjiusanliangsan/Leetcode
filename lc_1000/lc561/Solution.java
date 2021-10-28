package lc_1000.lc561;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int ret=0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i=i+2){
            ret += nums[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution sou = new Solution();
        int[] num = new int[5];
        for(int i=0;i<5;i++){
            num[i]=i;
        }
        System.out.println(sou.arrayPairSum(num));
    }
}
