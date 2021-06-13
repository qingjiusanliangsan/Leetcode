package lc_1500.lc1423;

public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ret=0;
        int n=cardPoints.length;
        int tem = 0;
        for(int i = n-k;i<n;i++){
            tem +=cardPoints[i];
        }
        ret = tem;
        for(int i = n-k,j=0;i<n&&j<k;i++,j++){
            tem -=cardPoints[i];
            tem +=cardPoints[j];
            ret = ret>tem ? ret:tem;
        }
        return ret;
    }
}
