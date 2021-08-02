package lc_1000.lc743;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-08-02-11:16
 */
//public class Solution {
//    public int networkDelayTime(int[][] times, int n, int k) {
//        int[][] ada = new int[n+1][n+1];
//        int m = times.length;
//        int ret = 0;
//        Queue<Integer> qnode = new LinkedList<>();
//        for(int i =0;i<m;i++){
//            ada[times[i][0]][times[i][1]] = times[i][2];
//        }
//        for(int i=1;i<=n;i++){
//            if(ada[k][i]!=0){
//                qnode.add(i);
//            }
//        }
//        while(!qnode.isEmpty()){
//            int t = qnode.remove();
//            for(int i=1;i<=n;i++){
//                if(i!=k && ada[t][i]!=0){
//                    qnode.add(i);
//                    int tn = ada[k][t] + ada[t][i];
//                    if(ada[k][i]==0 || tn<ada[k][i])
//                        ada[k][i] = tn;
//                }
//            }
//        }
//        for(int i=1;i<=n;i++){
//            if(i!=k&&ada[k][i]==0){
//                return -1;
//            }
//            ret = Math.max(ada[k][i],ret);
//        }
//        return ret;
//    }
//}
public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        final int INF = Integer.MAX_VALUE / 2;
        int[][] g = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(g[i], INF);
        }
        for (int[] t : times) {
            int x = t[0] - 1, y = t[1] - 1;
            g[x][y] = t[2];
        }

        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[k - 1] = 0;
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; ++i) {
            int x = -1;
            for (int y = 0; y < n; ++y) {
                if (!used[y] && (x == -1 || dist[y] < dist[x])) {
                    x = y;
                }
            }
            used[x] = true;
            for (int y = 0; y < n; ++y) {
                dist[y] = Math.min(dist[y], dist[x] + g[x][y]);
            }
        }

        int ans = Arrays.stream(dist).max().getAsInt();
        return ans == INF ? -1 : ans;
    }
}
