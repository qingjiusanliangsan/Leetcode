package Jianzhi.f57_2;

import java.util.ArrayList;


/**
 * @author qingjiusanliangsan
 * create 2022-07-30-15:24
 */
public class Solution {
    public int[][] findContinuousSequence(int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=target-1;i>=2;i--){
            int a = target/i;
            int b = target%i;

            if(i%2==0 && b==i/2 && (a-i/2+1)>0){
                ArrayList<Integer> list = new ArrayList<>();
                for(int k = a-i/2+1;k<=a+i/2;k++){
                    list.add(k);
                }
                ans.add(list);
            }
            else if(i%2==1 && b==0 && a-i/2>0){
                ArrayList<Integer> list = new ArrayList<>();
                for(int k = a-i/2;k<=a+i/2;k++){
                    list.add(k);
                }
                ans.add(list);
            }
        }
        int[][] res = new int[ans.size()][];
        for(int i=0;i<ans.size();i++){
            int[] A = new int[ans.get(i).size()];
            for(int j=0;j<ans.get(i).size();j++){
                A[j] = ans.get(i).get(j);
            }
            res[i] = A;
        }
        return res;
    }
}