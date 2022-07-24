package Jianzhi.f29;

/**
 * @author qingjiusanliangsan
 * create 2022-07-22-8:31
 */
public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int num = n*m;
        int[][] flag = new int[n][m];
        int[] ans  = new int[num];
        int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int a=0,b=0;
        int s = 1;
        ans[0] = matrix[a][b];
        flag[a][b]=1;
        while (s < num){
            for(int[] tem : dir){
                int a1 = tem[0];
                int b1 = tem[1];
                while (a+a1>=0 && a+a1<n && b+b1>=0 && b+b1<m && flag[a+a1][b+b1]==0){
                    a=a+a1;
                    b=b+b1;
                    ans[s] = matrix[a][b];
                    s++;

                    flag[a][b]=1;
                }
            }
        }
        return ans;
    }
}