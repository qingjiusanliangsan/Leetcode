package lc_1000.lc59;

import java.util.Arrays;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
        for(int k =0;k<n;k++){
            Arrays.fill(ret[k],0);
        }
        int las = n*n;
        int dir = 1;
        int tem = 1;
        int i = 0;
        int j = 0;
        while(tem<=las){
            if(dir == 1){
                for(;j<n;j++){
                    if(ret[i][j]==0){
                        ret[i][j] = tem++;
                    }
                    else{
                        break;
                    }
                }
                --j;
                ++i;
                dir = 2;
            }
            if(dir == 2){

                for(;i<n;i++){
                    if(ret[i][j]==0){
                        ret[i][j] = tem++;
                    }
                    else{
                        break;
                    }
                }
                --i;
                --j;
                dir = 3;
            }
            if(dir == 3){
                for(;j>=0;--j){
                    if(ret[i][j]==0){
                        ret[i][j] = tem++;
                    }
                    else{
                        break;
                    }
                }
                ++j;
                --i;
                dir = 4;
            }
            if(dir == 4){
                for(;i>=0;--i){
                    if(ret[i][j]==0){
                        ret[i][j] = tem++;
                    }
                    else{
                        break;
                    }
                }
                ++i;
                ++j;
                dir = 1;
            }
        }
        return ret;
    }
    public static void main(String[] args){
        Solution so = new Solution();
        int n=4;
        int[][] ret = so.generateMatrix(n);
        for(int k =0;k<n;k++){
            System.out.println(Arrays.toString(ret[k]));
        }
    }
}
