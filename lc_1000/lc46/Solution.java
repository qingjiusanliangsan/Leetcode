package lc_1000.lc46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2022-05-14-11:13
 */
public class Solution {
    int[] arr;
    int n;
    public List<List<Integer>> permute(int[] nums) {
        arr = nums;
        n = nums.length;
        int[] flag = new int[n];
        Arrays.fill(flag,0);
        return make(flag);
    }
    public List<List<Integer>> make(int[] flag){
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(flag[i]==0){
                flag[i]=1;
                List<List<Integer>> tem = make(flag);
                for(List<Integer> p : tem){
                    p.add(arr[i]);
                    res.add(p);
                }
                if(tem.size() ==0){
                    List<Integer> ze = new ArrayList<>();
                    ze.add(arr[i]);
                    res.add(ze);
                }
                flag[i]=0;
            }
        }
        return res;
    }
}