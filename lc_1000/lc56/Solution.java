package lc_1000.lc56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2022-05-14-10:46
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1){
            return intervals;
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int a,b;
        a = intervals[0][0];
        b = intervals[0][1];
        for(int[] num : intervals){
            if(num[0] <= b ){
                if(num[1] >b){
                    b = num[1];
                }
            }
            else{
                List<Integer> tem = new ArrayList<>();
                tem.add(a);
                tem.add(b);
                res.add(tem);
                a = num[0];
                b = num[1];
            }
        }
        int[][] ans = new int[res.size()+1][2];
        for(int i=0;i<res.size();i++){
            ans[i][0]=res.get(i).get(0);
            ans[i][1]=res.get(i).get(1);
        }
        ans[res.size()][0]=a;
        ans[res.size()][1]=b;
        return ans;
    }
}