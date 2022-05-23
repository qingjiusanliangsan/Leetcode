package lc_1000.lc39;

import java.util.*;

/**
 * @author qingjiusanliangsan
 * create 2022-05-13-23:08
 */
public class Solution {
    public Set<Integer> hset =new HashSet<>();
    public int[] num;
    public int n;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        n = candidates.length;
        Arrays.sort(candidates);
        num = candidates;
        for(int e:candidates){
             hset.add(e);
        }
        return make(0,target);
    }
    public List<List<Integer>> make(int index,int target){
        List<List<Integer>> res = new ArrayList<>();
        if(hset.contains(target)){
            List<Integer> tem = new ArrayList<>();
            tem.add(target);
            res.add(tem);
        }
        for(int i=index;i<n;i++){
            if(target > num[i] && target-num[i]>=num[i]){
                List<List<Integer>> tem_res = make(i,target-num[i]);
                for(List<Integer> tem : tem_res){
                    tem.add(num[i]);
                    res.add(tem);
                }
            }
            else{
                break;
            }
        }
        return res;
    }
}