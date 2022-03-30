package lc_1000.lc26;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-04-18-10:07
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0,j=0;
        while(j<n){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(s.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
