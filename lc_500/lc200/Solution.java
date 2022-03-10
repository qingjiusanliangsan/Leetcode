package lc_500.lc200;


public class Solution{
    int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                if(grid[i][j]=='1'){
                    grid[i][j] = '2';
                    make(i,j,n,m,grid);
                    ++ans;
                }
            }
        }
        return ans-2;
    }
    public void make(int a,int b,int n,int m,char[][] grid){
        for(int i=0;i<4;++i){
            int x = a+dir[i][0];
            int y = b+dir[i][1];
            if(x>=0 && x<n && y>=0&& y<m && grid[x][y]=='1'){
                grid[x][y] = '2';
                make(x,y,n,m,grid);
            }
        }
    }
}