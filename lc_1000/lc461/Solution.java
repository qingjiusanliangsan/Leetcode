package lc_1000.lc461;

/**
 * @author qingjiusanliangsan
 * create 2021-05-27-10:08
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res +=Integer.bitCount(nums[i]^nums[j]);
            }
        }
        return res;
    }
}
