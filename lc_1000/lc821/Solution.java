package lc_1000.lc821;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans  = new int[n];
        List<Integer> num = new ArrayList<>();
        num.add(-n);
        for(int i=0;i<n;i++){
            if(s.charAt(i) == c){
                num.add(i);
            }
        }
        num.add(n*2);
        for(int i=1;i<num.size();i++){
            int a = num.get(i-1);
            int b = num.get(i);
            int k = Math.max(0,a);
            int m = Math.min(n-1,b);
            for(int j=k;j<=m;j++){
                ans[j] = Math.min(j-a,b-j);
            }
        }
        return ans;
    }
}