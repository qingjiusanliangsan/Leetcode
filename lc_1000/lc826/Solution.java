package lc_1000.lc826;

import java.util.Arrays;

public class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int tmax = 0,res=0;
        int[][] num = new int[n][2];
        for(int i=0;i<n;i++){
            num[i][0] = difficulty[i];
            num[i][1] = profit[i];
        }
        Arrays.sort(num, (a,b) -> a[0] - b[0]);
        for(int i=0;i<n;i++){
            System.out.println(num[i][0]);
            tmax = Math.max(tmax,num[i][1]);
            num[i][1] = tmax;
        }
        for(int e:worker){
            res += binfin(num,0,n-1,e);
        }
        return res;
    }
    public int binfin(int[][] num,int a,int b,int tar){
        int ans = 0;
        while(a<=b){
            int c = (b-a)/2+a;
            if(num[c][0] <= tar){
                ans = num[c][1];
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        return ans;
    }
}
