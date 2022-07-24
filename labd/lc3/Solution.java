package labd.lc3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qingjiusanliangsan
 * create 2022-05-23-22:51
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0){
            return 0;
        }
        Set<Character> hset = new HashSet<>();
        int res = 0;
        int le = 0;
        int ri = 0;
        while (ri<n){
            char c = s.charAt(ri);
            if(!hset.contains(c)){
                hset.add(c);
                res = Math.max(res,ri-le+1);
            }
            else{
                while (s.charAt(le) != c){
                    hset.remove(s.charAt(le));
                    le++;
                }
                le++;
            }
            ri++;
        }
        return res;
    }
}
