package labd.lc76;

import java.util.HashMap;

/**
 * @author qingjiusanliangsan
 * create 2022-05-24-10:39
 */
public class Solution {
    public String minWindow(String s, String t) {
        int nt = t.length();
        int ns = s.length();
        HashMap<Character,Integer> tmap = new HashMap<>();
        HashMap<Character,Integer> smap = new HashMap<>();
        for(int i=0;i<nt;i++){
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }
        int a=0,b=0;
        int start=0;
        int valid=0;
        int L=Integer.MAX_VALUE;
        while (b<ns){
            char c = s.charAt(b);
            b++;
            if(tmap.containsKey(c)){
                smap.put(c,smap.getOrDefault(c,0)+1);
                if(smap.get(c).equals(tmap.get(c))){
                    valid++;
                }
            }
            while (valid == tmap.size()){
                if(b-a<L){
                    start = a;
                    L= b-a;
                }
                char d = s.charAt(a);
                a++;
                if(tmap.containsKey(d)){
                    if(smap.get(d).equals(tmap.get(d))){
                        valid--;
                    }
                    smap.put(d,smap.get(d)-1);
                }
            }
        }
        if(L==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+L);
    }
}
