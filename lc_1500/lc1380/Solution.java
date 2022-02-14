package lc_1500.lc1380;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2022-02-15-0:22
 */
public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int[] raw = new int[n];
        int[] lin = new int[m];
        Arrays.fill(lin,Integer.MIN_VALUE);
        Arrays.fill(raw,Integer.MAX_VALUE);
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                raw[i] = Math.min(raw[i],matrix[i][j]);
                lin[j] = Math.max(lin[j],matrix[i][j]);
            }
        }
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                if(matrix[i][j]==raw[i] && matrix[i][j]==lin[j]){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}