package lc_1000.lc598;

import java.util.Map;

public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int L = ops.length;
        for(int i=0;i<L;i++){
            m = Math.min(m,ops[i][0]);
            n = Math.min(n,ops[i][1]);
        }
        return m*n;
    }
}
