package lc_1000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        Set<Character> hset = new HashSet<>();
        int t=0,k=0;
        for(int i=0;i<n;++i){
            if(!hset.contains(s.charAt(i))){
                hset.add(s.charAt(i));
                ++t;
            }
            else{
                res = Math.max(res,t);
                while (k<i){
                    if(s.charAt(k) != s.charAt(i)){
                        hset.remove(s.charAt(k));
                        ++k;
                        --t;
                    }
                    else{
                        ++k;
                        break;
                    }
                }
            }

        }

        return Math.max(res,t);
    }
}