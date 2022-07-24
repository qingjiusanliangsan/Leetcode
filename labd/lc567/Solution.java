package labd.lc567;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2022-05-24-23:00
 */
public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n2<n1){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<n1;i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        int left=0;
        int right=0;
        int valid=0;
        while (right < n2){
            char c = s2.charAt(right);
            right++;
            if(map1.containsKey(c)){
                map2.put(c,map2.getOrDefault(c,0)+1);
                if(map2.get(c).equals(map1.get(c))){
                    valid++;
                }
            }
            while (right-left==n1){
                if(valid == map1.size()){
                    return true;
                }
                char d = s2.charAt(left);
                left++;
                if(map1.containsKey(d)){
                    if(map2.get(d).equals(map1.get(d))){
                        valid--;
                    }
                    map2.put(d,map2.get(d)-1);
                }
            }
        }
        return false;
    }
}