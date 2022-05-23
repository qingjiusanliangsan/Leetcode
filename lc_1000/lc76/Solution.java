package lc_1000.lc76;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2022-05-23-12:35
 */
public class Solution {
    Map<Character,Integer> Tnum = new HashMap<>();
    Map<Character,Integer> Snum = new HashMap<>();
    public String minWindow(String s, String t) {
        int tn = t.length();
        int sn = s.length();
        int ansa = -1;
        int ansb = -1;
        int L = sn;
        if(tn > sn){
            return "";
        }
        for(int i=0;i<tn;i++){
            Tnum.put(t.charAt(i),Tnum.getOrDefault(t.charAt(i),0)+1);
        }
        int a=0,b=-1;
        while (b<sn){
            b++;
            if(b<sn && Tnum.containsKey(s.charAt(b))){
                Snum.put(s.charAt(b),Snum.getOrDefault(s.charAt(b),0)+1);
            }
            while (compar() && a<=b){
                if(b-a+1 <= L){
                    ansa = a;
                    ansb = b+1;
                    L = b-a+1;
                }
                if(Tnum.containsKey(s.charAt(a))){
                    Snum.put(s.charAt(a),Snum.getOrDefault(s.charAt(a),0)-1);
                }
                a++;
            }

        }
        if(ansa == -1){
            return "";
        }
        return s.substring(ansa,ansb);
    }
    public boolean compar(){
        for(Map.Entry<Character,Integer> E : Tnum.entrySet()){
            if(Snum.getOrDefault(E.getKey(),0)<E.getValue()){
                return false;
            }
        }
        return true;
    }
}