package lc_500.lc136;

/**
 * @author qingjiusanliangsan
 * create 2021-06-14-11:30
 * lc136.只出现一次的数字
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int a = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            a = a^nums[i];
        }
        return a;
    }
}
