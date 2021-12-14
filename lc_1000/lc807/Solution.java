package lc_1000.lc807;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int res = 0;
        int[] Row  = new int[n];
        int[] Lin  = new int[n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                Row[i] = Math.max(Row[i],grid[i][j]);
                Lin[j] = Math.max(Lin[j],grid[i][j]);
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                int tem  = Math.min(Row[i],Lin[j]);
                res = res + tem - grid[i][j];
            }
        }
        return res;
    }
}
