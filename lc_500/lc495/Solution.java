package lc_500.lc495;

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ret=duration;
        int n = timeSeries.length-1;
        for(int i =0;i<n;i++){
            ret+=Math.min(duration,timeSeries[i+1] - timeSeries[i]);
        }
        return ret;
    }
}
