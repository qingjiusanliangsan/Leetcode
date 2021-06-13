package lc_1000.lc832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        int tem;
        for(int i = 0;i<n;i++){
            for(int j=0;j<(n+1)/2;j++){
                if(A[i][j]==A[i][n-j-1]){
                    tem=(1+A[i][j])%2;
                    A[i][j]=tem;
                    A[i][n-j-1]=tem;
                }
            }
        }
        return A;
    }
}
