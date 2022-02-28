package lc_2000.Lc1996;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2022-01-28-10:21
 */

public class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (o1, o2) -> {
            return o1[0] == o2[0] ? (o1[1] - o2[1]) : (o2[0] - o1[0]);
        });
        int maxDef = 0;
        int ans = 0;
        for (int[] p : properties) {
            if (p[1] < maxDef) {
                ans++;
            } else {
                maxDef = p[1];
            }
        }
        return ans;
    }
}