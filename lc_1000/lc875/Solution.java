package lc_1000.lc875;

public class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int lo = 1;
        int hi = 0;
        for(int e:piles){
            hi = Math.max(e,hi);
        }
        int ans = hi;
        while (lo <= hi) {
            int mi = (lo + hi) / 2;
            if (!possible(piles, H, mi))
                lo = mi + 1;
            else{
                ans = mi;
                hi = mi-1;
            }
        }
        return ans;
    }
    public boolean possible(int[] piles, int H, int K) {
        int time = 0;
        for (int p: piles)
            time += (p-1) / K + 1;
        return time <= H;
    }
}