package lc_1000.lc79;

/**
 * @author qingjiusanliangsan
 * create 2022-05-16-22:17
 */
public class Solution {
    int[][] flag;
    int m,n,strlen;
    int[][] dir = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
    boolean res;
    public boolean exist(char[][] board, String word) {
        res = false;
        m = board.length;
        n = board[0].length;
        strlen = word.length();
        flag = new int[m][n];
        char[] chars = word.toCharArray();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(board,chars,i,j,0);
                if(res){
                    return true;
                }
            }
        }
        return res;
    }
    public void dfs(char[][] board,char[] chars,int a,int b,int index){
        if(index == strlen){
            res = true;
            return;
        }
        if(a<0 || a>=m || b<0 || b>=n){
            return;
        }
        if(flag[a][b]==0 && board[a][b] == chars[index]){
            flag[a][b] = 1;
            index++;
            for(int[] tem : dir){
                dfs(board,chars,a+tem[0],b+tem[1],index);
            }
            flag[a][b] = 0;
        }

    }
}