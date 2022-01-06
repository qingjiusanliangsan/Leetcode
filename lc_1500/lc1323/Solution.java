package lc_1500.lc1323;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maximum69Number (int num) {
        List<Integer> arr = new ArrayList<>();
        int res=0;
        while (num>0){
            arr.add(num %10);
            num = num/10;
        }
        int n = arr.size();
        int k=n-1;
        while (k>=0){
            if(arr.get(k)==6){
                arr.set(k,9);
                break;
            }
            --k;
        }
        for (int i=n-1;i>=0;--i){
            res = res*10 +arr.get(i);
        }
        return res;
    }
}
