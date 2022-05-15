package hot100.lc5;

/**
 * @author qingjiusanliangsan
 * create 2022-05-11-14:48
 */

public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int maxlen = 1;
        int start = 0;
        for(int i=0;i<n;i++){
            dp[i][i] = 1;
        }
        for(int L=2;L<=n;L++){
            for(int i=0;i<n;i++){
                int j = i+L-1;
                if(j>=n){
                    break;
                }
                if(s.charAt(i) != s.charAt(j)){
                    dp[i][j] = 0;
                }
                else{
                    if(L==2){
                        dp[i][j] = 1;
                    }
                    else{
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if(dp[i][j]==1 && L>maxlen){
                    maxlen = L;
                    start = i;
                }
            }
        }
        return s.substring(start,start+maxlen);

    }
}
