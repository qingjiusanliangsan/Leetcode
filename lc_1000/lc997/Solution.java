package lc_1000.lc997;

/**
 * @author qingjiusanliangsan
 * create 2021-12-19-21:26
 */
public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] num = new int[n+1][2];
        int m= trust.length;
        for(int i=0;i<m;i++){
            num[trust[i][0]][0]++;
            num[trust[i][1]][1]++;
        }
        for(int i=1;i<=n;i++){
            System.out.println(num[i].toString());
            if(num[i][0]==1 && num[i][1]==n-1){
                return i;
            }
        }
        return -1;
    }
}