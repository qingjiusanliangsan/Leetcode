package lc_500.lc345;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        int n =s.length();
        char[] T = s.toCharArray();
        char tem;
        Set<Character> hset = new HashSet<>();
        hset.add('a');
        hset.add('e');
        hset.add('i');
        hset.add('o');
        hset.add('u');
        hset.add('A');
        hset.add('E');
        hset.add('I');
        hset.add('O');
        hset.add('U');
        int a=0,b=n-1;
        while(a<=b){
            if(!hset.contains(T[a])){
                ++a;
                continue;
            }
            if(!hset.contains(T[b])){
                --b;
                continue;
            }
            tem = T[a];
            T[a]=T[b];
            T[b] = tem;
            ++a;
            --b;
        }
        return new String(T);
    }
}