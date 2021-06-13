package lc_1000.lc766;

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int tem,a,b;
        for(int i = 0;i<m;i++){
            a = 0;
            b = i;
            tem = matrix[a][b];
            while(b<m&&a<n){
                if(tem == matrix[a][b]){
                    a++;
                    b++;
                }
                else{
                    return false;
                }
            }
        }
        for(int i = 1;i<n;i++){
            a = i;
            b = 0;
            tem = matrix[a][b];

            while(b<m&&a<n){
                if(tem == matrix[a][b]){
                    a++;
                    b++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
