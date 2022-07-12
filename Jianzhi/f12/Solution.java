package Jianzhi.f12;

public class Solution {
    boolean ans = false;
    int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    int n,m;
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        if(n*m < word.length()){
            return false;
        }
        int[][] flag = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==board[i][j]){
                    flag[i][j]=1;
                    make(board,flag,word,1,i,j);
                    flag[i][j]=0;
                }
                if(ans){
                    return ans;
                }
            }
        }
        return ans;

    }
    public void make(char[][] board, int[][] flag, String word, int k,int a,int b){
        if(ans || k==word.length()){
            ans = true;
            return;
        }
        for(int[] tem : dir){
            int a1 = a+tem[0];
            int b1 = b+tem[1];
            if(!ans && a1 >=0 && a1<n && b1>=0 && b1<m){
                if(flag[a1][b1] != 1 && board[a1][b1]==word.charAt(k)){
                    flag[a1][b1] = 1;
                    make(board,flag,word,k+1,a1,b1);
                    flag[a1][b1] = 0;
                }
            }
        }

    }
}