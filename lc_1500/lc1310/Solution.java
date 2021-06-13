package lc_1500.lc1310;

/**
 * @author qingjiusanliangsan
 * create 2021-05-12-9:06
 */
public class Solution {
    public int[] xorQueries1(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        int[] tem = new int[n];
        int[] ret = new int[m];
        tem[0]=arr[0];
        for(int i=1;i<n;i++){
            tem[i] = arr[i]^tem[i-1];
        }
        for(int i=0;i<m;i++){
            if(queries[i][0]==queries[i][1]){
                ret[i]=arr[i];
            }
            else{
                ret[i] = tem[queries[i][1]];
                if(queries[i][0]>0){
                    ret[i]=ret[i]^tem[queries[i][0]-1];
                }
            }
        }
        return ret;
    }
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        int[] ret = new int[m];
        for(int i=1;i<n;i++){
            arr[i] = arr[i]^arr[i-1];
        }
        for(int i=0;i<m;i++){
            ret[i] = arr[queries[i][1]];
            if(queries[i][0]>0){
                ret[i]=ret[i]^arr[queries[i][0]-1];
            }
        }
        return ret;
    }
}
