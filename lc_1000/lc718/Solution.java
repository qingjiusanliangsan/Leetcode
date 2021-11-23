package lc_1000.lc718;

public class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int res = 0,n=nums1.length,m=nums2.length;
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(nums1[i]==nums2[j]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
