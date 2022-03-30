package lc_2000.lc1219;

/**
 * @author qingjiusanliangsan
 * create 2022-02-13-21:25
 */
public class Solution {
    public int res = 0;
    public int n,m;
    public int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int getMaximumGold(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        for(int i=0;i<n;++i){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                    dfs(grid,i,j,0);
                }
            }
        }
        return res;
    }
    public void dfs(int[][] grid,int a,int b,int score) {
        int c = grid[a][b];
        score+=c;
        res = Math.max(res,score);
        grid[a][b] = 0;
        for(int j=0;j<4;++j){
            int a1 = a+dir[j][0];
            int b1 = b+dir[j][1];
            if(a1>=0 && a1<n && b1>=0 && b1<m && grid[a1][b1]>0){
                dfs(grid,a1,b1,score);
            }
        }
        grid[a][b] = c;
    }
}