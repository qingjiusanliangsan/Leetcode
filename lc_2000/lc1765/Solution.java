package lc_2000.lc1765;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * @author qingjiusanliangsan
 * create 2022-01-29-11:45
 */
public class Solution {
    int[][] Fu = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length;
        int m = isWater[0].length;
        Queue<int[]> qu = new ArrayDeque<>();
        int[][] res = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(res[i],-1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    res[i][j]=0;
                    qu.add(new int[]{i,j});
                }
            }
        }
        while(!qu.isEmpty()){
            int[] Ele = qu.poll();
            for(int i=0;i<4;i++){
                int a = Ele[0]+Fu[i][0];
                int b = Ele[1]+Fu[i][1];
                if(a>=0 && a<n && b>=0 && b<m &&res[a][b] == -1){
                    res[a][b] = res[Ele[0]][Ele[1]]+1;
                    qu.add(new int[]{a,b});
                }
            }
        }
        return res;
    }
}