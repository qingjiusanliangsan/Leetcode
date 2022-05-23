package lc_1000.lc647;

/**
 * @author qingjiusanliangsan
 * create 2022-05-14-14:35
 */
public class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int res = n;
        int[][] dp = new int[n][n];
        char[] chararr = s.toCharArray();
        for(int i=0;i<n;i++){
            dp[i][i] = 1;
        }
        for(int L = 2;L<=n;L++){
            for(int i=0;i<n;i++){
                int j = i+L-1;
                if(j>=n){
                    break;
                }
                if(chararr[i] != chararr[j]){
                    dp[i][j]=0;
                }
                else{
                    if(L==2 || dp[i+1][j-1]==1){
                        dp[i][j]=1;
                        res++;
                        System.out.println(s.substring(i,j+1));
                    }
                }
            }
        }
        return res;
    }
}
