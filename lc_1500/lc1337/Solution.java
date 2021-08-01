package lc_1500.lc1337;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author qingjiusanliangsan
 * create 2021-08-01-14:24
 */
public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ret = new int[k];
        int n = mat.length;
        int m = mat[0].length;
        int[][] tem = new int[n][2];
        for(int i= 0;i<n;i++){
            int z = 0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    z++;
                }
                else{
                    break;
                }
            }
            tem[i][0]=z;
            tem[i][1]=i;
        }
        Arrays.sort(tem, Comparator.comparingInt(o->o[0]));
        for(int i=0;i<k;i++){
            ret[i]=tem[i][1];
        }

        return ret;
    }
}
