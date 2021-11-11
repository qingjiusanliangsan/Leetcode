package lc_500.lc200;

public class Solution {
    int tem = 0;
    int n,m;
    int[][] count;
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        count = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                count[i][j] = 0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && count[i][j] == 0){
                    count[i][j] = tem+1;
                    make(grid,i,j,tem+1);
                    ++tem;
                }
            }
        }
        return tem;
    }
    public void make(char[][] grid,int a,int b,int k){
        if(a-1>=0 && grid[a-1][b]=='1' && count[a-1][b] == 0){
            count[a-1][b] = k;
            make(grid,a-1,b,k);
        }
        if(b+1<m && grid[a][b+1]=='1' && count[a][b+1] == 0){
            count[a][b+1] = k;
            make(grid,a,b+1,k);
        }
        if(a+1<n && grid[a+1][b]=='1' && count[a+1][b] == 0){
            count[a+1][b] = k;
            make(grid,a+1,b,k);
        }
        if(b-1>=0 && grid[a][b-1]=='1' && count[a][b-1] == 0){
            count[a][b-1] = k;
            make(grid,a,b-1,k);
        }
    }
}
