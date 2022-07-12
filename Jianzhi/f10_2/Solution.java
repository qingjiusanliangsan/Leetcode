package Jianzhi.f10_2;

public class Solution {
    public int numWays(int n) {
        if(n<=1){
            return 1;
        }
        int[] num = new int[n+1];
        num[0]=1;
        num[1]=1;
        for(int i=2;i<=n;i++){
            num[i] = (num[i-1]+num[i-2])%1000000007;
        }
        return num[n];
    }
}