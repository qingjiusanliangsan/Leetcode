package lc_1000.lc207;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qingjiusanliangsan
 * create 2022-05-17-13:22
 */
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        int[] num = new int[numCourses];
        int res=numCourses;
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int [] a : prerequisites){
            list.get(a[1]).add(a[0]);
            num[a[0]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(num[i]==0){
                qu.add(i);
            }
        }
        while (!qu.isEmpty()){
            int t = qu.poll();
            for(int e: list.get(t)){
                num[e]--;
                if(num[e]==0){
                    qu.add(e);
                }
            }
            res--;
        }
        return res==0;
    }
}