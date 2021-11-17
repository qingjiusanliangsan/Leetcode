package lc_500.lc275;

public class Solution {
    public int hIndex(int[] cs) {
        int n = cs.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (cs[mid] >= n - mid) r = mid;
            else l = mid + 1;
        }
        return cs[r] >= n - r ? n - r : 0;
    }
    /*public int hIndex(int[] citations) {
        int n = citations.length;
        if(citations[0] >= n){
            return n;
        }
        for(int i = 1;i<n;++i){
            if(citations[i] >= n-i && n-i>=citations[i-1]){
                return n-i;
            }
        }
        return 0;
    }*/
}