package lc_2000.lc2080;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RangeFreqQuery {
    Map<Integer, List<Integer>> hmap = new HashMap<>();
    public RangeFreqQuery(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            List<Integer> temList;
            if(hmap.containsKey(arr[i])){
                temList = hmap.get(arr[i]);
            }
            else{
                temList = new ArrayList<>();
            }
            temList.add(i);
            hmap.put(arr[i],temList);
        }
    }
    public int query(int left, int right, int value) {
        if(!hmap.containsKey(value)){
            return 0;
        }
        List<Integer> temList = hmap.get(value);
        return binfind(temList,right+1)-binfind(temList,left);
    }
    public int binfind(List<Integer> temList,int value){
        int a=0,b=temList.size()-1,ans =-1;
        while(a<=b){
            int c = (b-a)/2+a;
            if(temList.get(c)<value){
                ans = c;
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        return ans+1;
    }
}