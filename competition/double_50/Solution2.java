package competition.double_50;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-04-17-22:38
 */
public class Solution2 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int m = points.length;
        int[] rets = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                long tem = (queries[i][0]-points[j][0])*(queries[i][0]-points[j][0]) + (queries[i][1]-points[j][1])*(queries[i][1]-points[j][1]);
                if(tem<=queries[i][2]*queries[i][2]){
                    rets[i]++;
                }
            }
        }
        return rets;
    }
    public static void main(String[] args) {
        int[][] points =  {{1,1},{2,2},{3,3},{4,4},{5,5}};
        int[][] queries = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.countPoints(points,queries)));
    }
}
