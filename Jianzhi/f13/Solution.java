package Jianzhi.f13;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int movingCount(int m, int n, int k) {
        int[][] flag = new int[m][n];
        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        int ans = 0;
        Queue<Integer> qu = new ArrayDeque<>();
        qu.add(0);
        qu.add(0);
        while (!qu.isEmpty()){
            int a = qu.remove();
            int b = qu.remove();
            if(flag[a][b] != 1 ){
                ans++;
                flag[a][b] = 1;
                for(int[] tem : dir){
                    int a1 = a+tem[0];
                    int b1 = b+tem[1];
                    if(a1>=0 && a1<m &&b1>=0 && b1<n && make(a1,b1)<=k){
                        qu.add(a1);
                        qu.add(b1);
                    }
                }
            }
        }
        return ans;
    }
    public int make(int a,int b){
        int ele = 0;
        while (a>0){
            ele += a%10;
            a = a/10;
        }
        while (b>0){
            ele += b%10;
            b = b/10;
        }
        return ele;
    }
}