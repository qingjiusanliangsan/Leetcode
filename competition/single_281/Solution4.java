package competition.single_281;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2022-02-20-10:16
 */
public class Solution4 {
    public long countPairs(int[] nums, int k) {
        List<Integer> divisors = new ArrayList<Integer>(); // 预处理 k 的所有因子
        for (int d = 1; d * d <= k; d++) {
            if (k % d == 0) {
                divisors.add(d);
                if (d * d < k) divisors.add(k / d);
            }
        }
        long ans = 0L;
        Map<Integer,Integer> cnt = new HashMap<Integer, Integer>();
        for (int v : nums) {
            ans += cnt.getOrDefault(k / gcd(v, k), 0);
            for (int d : divisors)
                if (v % d == 0)
                    cnt.put(d, cnt.getOrDefault(d, 0) + 1);
        }
        return ans;
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}