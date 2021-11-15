package lc_1500.lc1351;

public class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        int n = grid.length,m = grid[0].length,a,b,c;
        for(int i=0;i<n;i++){
            a = 0;
            b = m-1;
            int ans = m;
            while(a<=b){
                c = (b-a)/2+a;
                if(grid[i][c] >= 0){
                    a = c+1;
                }
                else if(grid[i][c] < 0){
                    b = c -1;
                    ans = c;
                }
            }
            res = res + m - ans;
        }


        return res;
    }
}