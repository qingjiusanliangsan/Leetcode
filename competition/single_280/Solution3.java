package competition.single_280;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2022-02-13-11:18
 */
public class Solution3 {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        int n = beans.length;
        long sum = 0;
        for(int e: beans){
            sum+=e;
        }
        long res = sum - (long)beans[0]*n;
        for(int i=1;i<n;i++){
            res = Math.min(res,sum-(long)beans[i]*(n-i));
        }
        return res;
    }
}