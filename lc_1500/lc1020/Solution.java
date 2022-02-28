package lc_1500.lc1020;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author qingjiusanliangsan
 * create 2022-02-12-15:39
 */
public class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<Pair> qu = new ArrayDeque<>();
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int res=0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                grid[i][0]=2;
                qu.add(new Pair(i,0));
            }
            if(grid[i][m-1]==1){
                grid[i][m-1]=2;
                qu.add(new Pair(i,m-1));
            }
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                grid[0][i]=2;
                qu.add(new Pair(0,i));
            }
            if(grid[n-1][i]==1){
                grid[n-1][i]=2;
                qu.add(new Pair(n-1,i));
            }
        }
        while (! qu.isEmpty()){
            Pair tem = qu.poll();
            int a = tem.a;
            int b = tem.b;
            for(int i=0;i<4;i++){
                a+=dir[i][0];
                b+=dir[i][1];
                if(a>=0 && a<n && b>=0 && b< m){
                    if(grid[a][b]==1){
                        grid[a][b]=2;
                        qu.add(new Pair(a,b));
                    }
                }
                a-=dir[i][0];
                b-=dir[i][1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ++res;
                }
            }
        }
        return res;
    }
}
class Pair{
    public int a;
    public int b;
    public Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}
