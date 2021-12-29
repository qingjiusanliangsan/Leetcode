package lc_2000.lc1995;

public class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] count = new int[100];
        for (int b = n - 3; b >= 1; --b) {
            for (int d = b + 2; d < n; ++d) {
                int tem = nums[d] - nums[b + 1];
                if(tem>=0){
                    ++count[tem];
                }
            }
            for (int a = 0; a < b; ++a) {
                ans += count[nums[a] + nums[b]];
            }
        }
        return ans;
    }
}