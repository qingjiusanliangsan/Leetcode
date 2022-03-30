package lc_1000.lc18;

import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer,Integer> hmap = new HashMap<>();
        Set<String> S_set = new HashSet<>();
        int n = nums.length;
        int a,b,c,d;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(nums[i])){
                hmap.replace(nums[i],hmap.get(nums[i])+1);
            }
            else{
                hmap.put(nums[i],1);
            }
        }
        for(int i=0;i<n;i++){
            a = nums[i];
            hmap.replace(a,hmap.get(a)-1);
            for(int j=i+1;j<n;j++){
                b = nums[j];
                hmap.replace(b,hmap.get(b)-1);
                for(int k=j+1;k<n;k++){
                    c = nums[k];
                    hmap.replace(c,hmap.get(c)-1);
                    d = target -a-b-c;
                    if(hmap.containsKey(d) && hmap.get(d)>0){
                        List<Integer> tem = new ArrayList<>();
                        tem.add(a);
                        tem.add(b);
                        tem.add(c);
                        tem.add(d);
                        Collections.sort(tem);
                        String s ="";
                        for (int p:tem) {
                            s+= String.valueOf(p) + "/";
                        }
                        if(S_set.contains(s)){
                            continue;
                        }else{
                            ret.add(tem);
                            S_set.add(s);
                        }

                    }
                    hmap.replace(c,hmap.get(c)+1);
                }
                hmap.replace(b,hmap.get(b)+1);
            }
            hmap.replace(a,hmap.get(a)+1);
        }

        return ret;
    }
}
