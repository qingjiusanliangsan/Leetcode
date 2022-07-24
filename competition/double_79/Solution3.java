package competition.double_79;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2022-05-28-22:28
 */
public class Solution3 {
    public long maximumImportance(int n, int[][] roads) {
        long res = 0L;
        long C = 1;
        long[] du = new long[n];
        for(int[] tem : roads){
            du[tem[0]]++;
            du[tem[1]]++;
        }
        Arrays.sort(du);
        for(long L : du){
            res = res + L*C;
            C++;
        }
        return res;
    }
}
