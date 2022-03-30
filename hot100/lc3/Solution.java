package hot100.lc3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int n = s.length();
        Set<Character> hset = new HashSet<>();
        int R=0,L=0;
        while (R < n){
            while (R<n && !hset.contains(s.charAt(R))){
                hset.add(s.charAt(R));
                ++R;
            }
            res = Math.max(res,hset.size());
            while (L < R && R<n){
                if(s.charAt(L)!=s.charAt(R)){
                    hset.remove(s.charAt(L));
                    ++L;
                }
                else{
                    ++L;
                    break;
                }
            }
            ++R;
        }
        return res;
    }
}