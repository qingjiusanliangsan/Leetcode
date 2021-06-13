package lc_2000.lc1738;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author qingjiusanliangsan
 * create 2021-05-19-8:34
 */
public class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<Integer> q2 = new PriorityQueue<>(k);

        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                matrix[i][j] = matrix[i][j]^matrix[i][j-1];
            }
            if(i>0){
                for(int j=0;j<n;j++){
                    matrix[i][j] = matrix[i-1][j]^matrix[i][j];
                }
            }
        }

        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(q2.size()<k||matrix[i][j]>q2.element()){
                    while(q2.size()>=k){
                        q2.remove();
                    }
                    q2.add(matrix[i][j]);
                }
            }
        }
        return q2.element();
    }
}
