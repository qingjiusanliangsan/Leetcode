package competition.single_280;


/**
 * @author qingjiusanliangsan
 * create 2022-02-13-11:38
 */
public class Solution {
    public int maximumANDSum(int[] nums, int numSlots) {
        int ans = 0;
        int[] f = new int[1 << (numSlots * 2)];
        for (int i = 0; i < f.length; i++) {
            int c = Integer.bitCount(i);
            if (c >= nums.length) continue;
            for (int j = 0; j < numSlots * 2; ++j) {
                if ((i & (1 << j)) == 0) {
                    int s = i | (1 << j);
                    f[s] = Math.max(f[s], f[i] + ((j / 2 + 1) & nums[c]));
                    ans = Math.max(ans, f[s]);
                }
            }
        }
        return ans;
    }
}
